/*package com.example.educare.AdminPanel.GradeManagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.GradeManagement.model.OSPExam;
import com.example.educare.AdminPanel.GradeManagement.repository.OSPExamRepository;

@Service
public class OSPExamService {
	
	@Autowired
	private OSPExamRepository _ospExamRepository;

	public OSPExam createOSPExam(OSPExam ospExam) {
		return _ospExamRepository.save(ospExam);
	}

	public List<OSPExam> createOSPExams(List<OSPExam> ospExamList) {
		return _ospExamRepository.saveAll(ospExamList);
	}

	public List<OSPExam> getOSPExams() {
		return _ospExamRepository.findAll();
	}

	public OSPExam getOSPExamById(int id) {
		return _ospExamRepository.findById(id).orElse(null);
	}

	public String deleteOSPExamById(int id) {
		_ospExamRepository.deleteById(id);
		return "OSPExam removed !!" + id;
	}

	public void deleteOSPExams() {
		_ospExamRepository.deleteAll();
	}

	public OSPExam updateOSPExam(OSPExam ospExam) {
		
		OSPExam existingOSPExam = _ospExamRepository.findById(ospExam.getId()).orElse(null);
		
		existingOSPExam.setExamDate(ospExam.getExamDate());
		existingOSPExam.setCreatedOn(ospExam.getCreatedOn());
		existingOSPExam.setCreatedBy(ospExam.getCreatedBy());
		existingOSPExam.setModifiedOn(ospExam.getModifiedOn());
		existingOSPExam.setModifiedBy(ospExam.getModifiedBy());

		return _ospExamRepository.save(existingOSPExam);

	}
}
*/