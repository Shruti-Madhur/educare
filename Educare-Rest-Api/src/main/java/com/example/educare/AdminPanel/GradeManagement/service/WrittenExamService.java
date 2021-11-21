/*package com.example.educare.AdminPanel.GradeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.GradeManagement.model.WrittenExam;
import com.example.educare.AdminPanel.GradeManagement.repository.WrittenExamRepository;

@Service
public class WrittenExamService {
	
	@Autowired
	private WrittenExamRepository _writtenExamRepository;

	public WrittenExam createWrittenExam(WrittenExam writtenExam) {
		return _writtenExamRepository.save(writtenExam);
	}

	public List<WrittenExam> createWrittenExams(List<WrittenExam> writtenExamList) {
		return _writtenExamRepository.saveAll(writtenExamList);
	}

	public List<WrittenExam> getWrittenExams() {
		return _writtenExamRepository.findAll();
	}

	public WrittenExam getWrittenExamById(int id) {
		return _writtenExamRepository.findById(id).orElse(null);
	}

	public String deleteWrittenExamById(int id) {
		_writtenExamRepository.deleteById(id);
		return "WrittenExam removed !!" + id;
	}

	public void deleteWrittenExams() {
		_writtenExamRepository.deleteAll();
	}

	public WrittenExam updateWrittenExam(WrittenExam writtenExam) {
		
		WrittenExam existingWrittenExam = _writtenExamRepository.findById(writtenExam.getId()).orElse(null);
		
		existingWrittenExam.setExamDate(writtenExam.getExamDate());
		existingWrittenExam.setCreatedOn(writtenExam.getCreatedOn());
		existingWrittenExam.setCreatedBy(writtenExam.getCreatedBy());
		existingWrittenExam.setModifiedOn(writtenExam.getModifiedOn());
		existingWrittenExam.setModifiedBy(writtenExam.getModifiedBy());

		return _writtenExamRepository.save(existingWrittenExam);

	}
}
*/