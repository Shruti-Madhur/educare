/*package com.example.educare.AdminPanel.GradeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.GradeManagement.model.Term;
import com.example.educare.AdminPanel.GradeManagement.repository.TermRepository;

@Service
public class TermManagementService {
	
	@Autowired
	private TermRepository _termManagementRepository;

	public Term createTermManagement(Term termManagement) {
		return _termManagementRepository.save(termManagement);
	}

	public List<Term> createTermManagements(List<Term> termManagementList) {
		return _termManagementRepository.saveAll(termManagementList);
	}

	public List<Term> getTermManagements() {
		return _termManagementRepository.findAll();
	}

	public Term getTermManagementById(int id) {
		return _termManagementRepository.findById(id).orElse(null);
	}

	public String deleteTermManagementById(int id) {
		_termManagementRepository.deleteById(id);
		return "TermManagement removed !!" + id;
	}

	public void deleteTermManagements() {
		_termManagementRepository.deleteAll();
	}

	public Term updateTermManagement(Term termManagement) {
		
		Term existingTermManagement = _termManagementRepository.findById(termManagement.getId()).orElse(null);
		
		existingTermManagement.setSubjectName(termManagement.getSubjectName());
		existingTermManagement.setTermTopic(termManagement.getTermTopic());
		existingTermManagement.setTermDue(termManagement.getTermDue());
		existingTermManagement.setTermStatus(termManagement.getTermStatus());
		existingTermManagement.setTermScore(termManagement.getTermScore());
		existingTermManagement.setTermOutOf(termManagement.getTermOutOf());
		existingTermManagement.setVivaExamId(termManagement.getVivaExamId());
		existingTermManagement.setWrittenExamId(termManagement.getWrittenExamId());
		existingTermManagement.setOspEaxmId(termManagement.getOspEaxmId());
		existingTermManagement.setOscExamId(termManagement.getOscExamId());
		existingTermManagement.setFacultyId(termManagement.getFacultyId());
		existingTermManagement.setPhaseId(termManagement.getPhaseId());
		existingTermManagement.setCardId(termManagement.getCardId());
		existingTermManagement.setProfId(termManagement.getProfId());
		existingTermManagement.setCreatedOn(termManagement.getCreatedOn());
		existingTermManagement.setCreatedBy(termManagement.getCreatedBy());

		return _termManagementRepository.save(existingTermManagement);

	}
}
*/