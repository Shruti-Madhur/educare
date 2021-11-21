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

import com.example.educare.AdminPanel.GradeManagement.model.Term;
import com.example.educare.AdminPanel.GradeManagement.service.TermManagementService;

@CrossOrigin
@RestController
@RequestMapping("/api/manage/term")
public class TermController {
	
	@Autowired
	private TermManagementService _termManagementService;

	@PostMapping("/save-term")
	public Term saveTermManagement(@RequestBody Term termManagement) {
		return _termManagementService.createTermManagement(termManagement);
	}

	@PostMapping("/save-term-list")
	public List<Term> saveTermManagementList(@RequestBody List<Term> termManagementList) {
		return _termManagementService.createTermManagements(termManagementList);
	}

	@GetMapping("/get-term-list")
	public List<Term> getAllTermManagements() {
		return _termManagementService.getTermManagements();
	}

	@GetMapping("/get-term-by-id")
	public Term findTermManagementById(@RequestParam("id") int id) {
		return _termManagementService.getTermManagementById(id);
	}

	@DeleteMapping("/delete-term-by-id")
	public String deleteTermManagementById(@RequestParam("id") int id) {
		return _termManagementService.deleteTermManagementById(id);
	}

	@PutMapping("/update-term")
	public Term upateTermManagement(@RequestBody Term termManagement) {
		return _termManagementService.updateTermManagement(termManagement);
	}

	@DeleteMapping("/delete-all-term")
	public String deleteAll() {
		_termManagementService.deleteTermManagements();
		return "Successfully delete all entities";
	}
}
*/