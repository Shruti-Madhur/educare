/*package com.example.educare.AdminPanel.GradeManagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.GradeManagement.model.OSCExam;
import com.example.educare.AdminPanel.GradeManagement.repository.OSCExamRepository;

@Service
public class OSCExamService {
	
	@Autowired
	private OSCExamRepository _oscExamRepository;

	public OSCExam createOSCExam(OSCExam oscExam) {
		return _oscExamRepository.save(oscExam);
	}

	public List<OSCExam> createOSCExams(List<OSCExam> oscExamList) {
		return _oscExamRepository.saveAll(oscExamList);
	}

	public List<OSCExam> getOSCExams() {
		return _oscExamRepository.findAll();
	}

	public OSCExam getOSCExamById(int id) {
		return _oscExamRepository.findById(id).orElse(null);
	}

	public String deleteOSCExamById(int id) {
		_oscExamRepository.deleteById(id);
		return "OSCExam removed !!" + id;
	}

	public void deleteOSCExams() {
		_oscExamRepository.deleteAll();
	}

	public OSCExam updateOSCExam(OSCExam oscExam) {
		
		OSCExam existingOSCExam = _oscExamRepository.findById(oscExam.getId()).orElse(null);
		
		existingOSCExam.setExamDate(oscExam.getExamDate());
		existingOSCExam.setCreatedOn(oscExam.getCreatedOn());
		existingOSCExam.setCreatedBy(oscExam.getCreatedBy());
		existingOSCExam.setModifiedOn(oscExam.getModifiedOn());
		existingOSCExam.setModifiedBy(oscExam.getModifiedBy());

		return _oscExamRepository.save(existingOSCExam);

	}
}
*/