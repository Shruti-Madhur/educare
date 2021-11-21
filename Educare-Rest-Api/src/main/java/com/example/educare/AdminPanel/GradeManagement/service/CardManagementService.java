/*package com.example.educare.AdminPanel.GradeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.GradeManagement.model.Card;
import com.example.educare.AdminPanel.GradeManagement.repository.CardRepository;

@Service
public class CardManagementService {
	
	@Autowired
	private CardRepository _cardManagementRepository;

	public Card createCardManagement(Card cardManagement) {
		return _cardManagementRepository.save(cardManagement);
	}

	public List<Card> createCardManagements(List<Card> cardManagementList) {
		return _cardManagementRepository.saveAll(cardManagementList);
	}

	public List<Card> getCardManagements() {
		return _cardManagementRepository.findAll();
	}

	public Card getCardManagementById(int id) {
		return _cardManagementRepository.findById(id).orElse(null);
	}

	public String deleteCardManagementById(int id) {
		_cardManagementRepository.deleteById(id);
		return "CardManagement removed !!" + id;
	}

	public void deleteCardManagements() {
		_cardManagementRepository.deleteAll();
	}

	public Card updateCardManagement(Card cardManagement) {
		
		Card existingCardManagement = _cardManagementRepository.findById(cardManagement.getId()).orElse(null);
		
		existingCardManagement.setSubjectName(cardManagement.getSubjectName());
		existingCardManagement.setCardTopic(cardManagement.getCardTopic());
		existingCardManagement.setCardDue(cardManagement.getCardDue());
		existingCardManagement.setCardStatus(cardManagement.getCardStatus());
		existingCardManagement.setCardScore(cardManagement.getCardScore());
		existingCardManagement.setCardOutOf(cardManagement.getCardOutOf());
		existingCardManagement.setVivaExamId(cardManagement.getVivaExamId());
		existingCardManagement.setWrittenExamId(cardManagement.getWrittenExamId());
		existingCardManagement.setOspEaxmId(cardManagement.getOspEaxmId());
		existingCardManagement.setOscExamId(cardManagement.getOscExamId());
		existingCardManagement.setFacultyId(cardManagement.getFacultyId());
		existingCardManagement.setPhaseId(cardManagement.getPhaseId());
		existingCardManagement.setTermId(cardManagement.getTermId());
		existingCardManagement.setItemId(cardManagement.getItemId());
		existingCardManagement.setCreatedOn(cardManagement.getCreatedOn());
		existingCardManagement.setCreatedBy(cardManagement.getCreatedBy());

		return _cardManagementRepository.save(existingCardManagement);

	}
}
*/