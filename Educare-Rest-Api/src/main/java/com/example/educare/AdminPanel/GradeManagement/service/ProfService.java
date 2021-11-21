/*package com.example.educare.AdminPanel.GradeManagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.GradeManagement.model.Prof;
import com.example.educare.AdminPanel.GradeManagement.repository.ProfRepository;
import com.example.educare.AdminPanel.ProfManagement.model.ProfManagement;


@Service
public class ProfService {
	
	@Autowired
	private ProfRepository _profManagementRepository;

	public Prof createProfManagement(Prof profManagement) {
		return _profManagementRepository.save(profManagement);
	}

	public List<Prof> createProfManagements(List<Prof> profManagementList) {
		return _profManagementRepository.saveAll(profManagementList);
	}

	public List<Prof> getProfManagements() {
		return _profManagementRepository.findAll();
	}

	public Prof getProfManagementById(int id) {
		return _profManagementRepository.findById(id).orElse(null);
	}

	public String deleteProfManagementById(int id) {
		_profManagementRepository.deleteById(id);
		return "ProfManagement removed !!" + id;
	}

	public void deleteProfManagements() {
		_profManagementRepository.deleteAll();
	}

	public Prof updateProfManagement(Prof profManagement) {
		
		Prof existingProfManagement = _profManagementRepository.findById(profManagement.getId()).orElse(null);
		
		existingProfManagement.setSubjectName(profManagement.getSubjectName());
		existingProfManagement.setProfTopic(profManagement.getProfTopic());
		existingProfManagement.setProfDue(profManagement.getProfDue());
		existingProfManagement.setProfStatus(profManagement.getProfStatus());
		existingProfManagement.setProfScore(profManagement.getProfScore());
		existingProfManagement.setProfOutOf(profManagement.getProfOutOf());
		existingProfManagement.setVivaExamId(profManagement.getVivaExamId());
		existingProfManagement.setWrittenExamId(profManagement.getWrittenExamId());
		existingProfManagement.setOspEaxmId(profManagement.getOspEaxmId());
		existingProfManagement.setOscExamId(profManagement.getOscExamId());
		existingProfManagement.setFacultyId(profManagement.getFacultyId());
		existingProfManagement.setPhaseId(profManagement.getPhaseId());
		existingProfManagement.setTermId(profManagement.getTermId());
		existingProfManagement.setCreatedOn(profManagement.getCreatedOn());
		existingProfManagement.setCreatedBy(profManagement.getCreatedBy());

		return _profManagementRepository.save(existingProfManagement);

	}
}
*/