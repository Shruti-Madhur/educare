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

import com.example.educare.AdminPanel.GradeManagement.model.Prof;
import com.example.educare.AdminPanel.GradeManagement.service.ProfService;
import com.example.educare.AdminPanel.ProfManagement.model.ProfManagement;
import com.example.educare.AdminPanel.ProfManagement.service.ProfManagementService;

@CrossOrigin
@RestController
@RequestMapping("/api/manage/prof")
public class ProfController {
	
	@Autowired
	private ProfService _profManagementService;

	@PostMapping("/save-prof")
	public Prof saveProfManagement(@RequestBody Prof profManagement) {
		return _profManagementService.createProfManagement(profManagement);
	}

	@PostMapping("/save-prof-list")
	public List<Prof> saveProfManagementList(@RequestBody List<Prof> profManagementList) {
		return _profManagementService.createProfManagements(profManagementList);
	}

	@GetMapping("/get-prof-list")
	public List<Prof> getAllProfManagements() {
		return _profManagementService.getProfManagements();
	}

	@GetMapping("/get-prof-by-id")
	public Prof findProfManagementById(@RequestParam("id") int id) {
		return _profManagementService.getProfManagementById(id);
	}

	@DeleteMapping("/delete-prof-by-id")
	public String deleteProfManagementById(@RequestParam("id") int id) {
		return _profManagementService.deleteProfManagementById(id);
	}

	@PutMapping("/update-prof")
	public Prof upateProfManagement(@RequestBody Prof profManagement) {
		return _profManagementService.updateProfManagement(profManagement);
	}

	@DeleteMapping("/delete-all-prof")
	public String deleteAll() {
		_profManagementService.deleteProfManagements();
		return "Successfully delete all entities";
	}
}
*/