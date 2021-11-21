package com.example.educare.SharedModule.service.Institutional;

import java.time.Instant;
import java.util.List;

import com.example.educare.SharedModule.utils.StudentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.SharedModule.models.Institutional.Batch;
import com.example.educare.SharedModule.repository.Institutional.BatchRepository;

@Service
public class BatchService {
	
	@Autowired
	private BatchRepository _batchRepository;

	@Autowired
	private StudentUtils _studentUtils;

	public Batch createBatch(Batch batch) {
		batch.setCreatedOn(Instant.now());
		return _batchRepository.save(batch);
	}

	public List<Batch> getBatchs() {
		List<Batch> batches = _batchRepository.findAll();

		for (Batch batch: batches){
			_studentUtils.clearCircleOnStudents(batch.getStudentPersonalInfos());
		}

		return batches;
	}

	public Batch getBatchById(Long id) {
		Batch batch = _batchRepository.findById(id).orElse(null);

		assert batch != null;
		_studentUtils.clearCircleOnStudents(batch.getStudentPersonalInfos());

		return batch;
	}

	public String deleteBatchById(Long id) {
		Batch batch = _batchRepository.findById(id).orElse(null);

		assert batch != null;
		_studentUtils.clearCircleOnStudents(batch.getStudentPersonalInfos());
		batch.setStudentPersonalInfos(null);

		_batchRepository.deleteById(id);
		return "Batch removed " + id + "!!";
	}

	public String deleteBatchs() {
		List<Batch> batches = _batchRepository.findAll();

		for (Batch batch: batches){
			_studentUtils.clearCircleOnStudents(batch.getStudentPersonalInfos());
			batch.setStudentPersonalInfos(null);
		}

		_batchRepository.deleteAll();
		return "Successfully delete all entities!!!";
	}

	public Batch updateBatch(Batch batch) {
		
		Batch existingBatch = _batchRepository.findById(batch.getId()).orElse(null);

		assert existingBatch != null;
		existingBatch.setName(batch.getName());
		existingBatch.setYear(batch.getYear());
		existingBatch.setAdmissionYear(batch.getAdmissionYear());
		existingBatch.setModifiedOn(Instant.now());
		existingBatch.setModifiedBy(batch.getModifiedBy());

		_batchRepository.save(existingBatch);
		_studentUtils.clearCircleOnStudents(existingBatch.getStudentPersonalInfos());

		return existingBatch;
	}
}
