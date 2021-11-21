/*package com.example.educare.AdminPanel.GradeManagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.GradeManagement.model.VivaExam;
import com.example.educare.AdminPanel.GradeManagement.repository.VivaExamRepository;

@Service
public class VivaExamService {
	
	@Autowired
	private VivaExamRepository _vivaExamRepository;

	public VivaExam createVivaExam(VivaExam vivaExam) {
		return _vivaExamRepository.save(vivaExam);
	}

	public List<VivaExam> createVivaExams(List<VivaExam> vivaExamList) {
		return _vivaExamRepository.saveAll(vivaExamList);
	}

	public List<VivaExam> getVivaExams() {
		return _vivaExamRepository.findAll();
	}

	public VivaExam getVivaExamById(int id) {
		return _vivaExamRepository.findById(id).orElse(null);
	}

	public String deleteVivaExamById(int id) {
		_vivaExamRepository.deleteById(id);
		return "VivaExam removed !!" + id;
	}

	public void deleteVivaExams() {
		_vivaExamRepository.deleteAll();
	}

	public VivaExam updateVivaExam(VivaExam vivaExam) {
		
		VivaExam existingVivaExam = _vivaExamRepository.findById(vivaExam.getId()).orElse(null);
		
		existingVivaExam.setExamDate(vivaExam.getExamDate());
		existingVivaExam.setCreatedOn(vivaExam.getCreatedOn());
		existingVivaExam.setCreatedBy(vivaExam.getCreatedBy());
		existingVivaExam.setModifiedOn(vivaExam.getModifiedOn());
		existingVivaExam.setModifiedBy(vivaExam.getModifiedBy());

		return _vivaExamRepository.save(existingVivaExam);

	}
}
*/