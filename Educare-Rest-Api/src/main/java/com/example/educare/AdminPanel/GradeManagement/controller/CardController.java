/*package com.example.educare.AdminPanel.GradeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.educare.AdminPanel.GradeManagement.model.Card;
import com.example.educare.AdminPanel.GradeManagement.service.CardManagementService;

@CrossOrigin
@RestController
@RequestMapping("/api/manage/card")
public class CardController {
	
	@Autowired
	private CardManagementService _cardManagementService;

	@PostMapping("/save-card")
	public Card saveCardManagement(@RequestBody Card cardManagement) {
		return _cardManagementService.createCardManagement(cardManagement);
	}

	@PostMapping("/save-card-list")
	public List<Card> saveCardManagementList(@RequestBody List<Card> cardManagementList) {
		return _cardManagementService.createCardManagements(cardManagementList);
	}

	@GetMapping("/get-card-list")
	public List<Card> getAllCardManagements() {
		return _cardManagementService.getCardManagements();
	}

	@GetMapping("/get-card-by-id")
	public Card findCardManagementById(@RequestParam("id") int id) {
		return _cardManagementService.getCardManagementById(id);
	}

	@DeleteMapping("/delete-card-by-id")
	public String deleteCardManagementById(@RequestParam("id") int id) {
		return _cardManagementService.deleteCardManagementById(id);
	}

	@PutMapping("/update-card")
	public Card upateCardManagement(@RequestBody Card cardManagement) {
		return _cardManagementService.updateCardManagement(cardManagement);
	}

	@DeleteMapping("/delete-all-card")
	public String deleteAll() {
		_cardManagementService.deleteCardManagements();
		return "Successfully delete all entities";
	}
}
*/