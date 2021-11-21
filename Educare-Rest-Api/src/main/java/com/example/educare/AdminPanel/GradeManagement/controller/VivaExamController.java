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

import com.example.educare.AdminPanel.GradeManagement.model.VivaExam;
import com.example.educare.AdminPanel.GradeManagement.service.VivaExamService;

@CrossOrigin
@RestController
@RequestMapping("/api/viva_exam")
public class VivaExamController {
	
	@Autowired
	private VivaExamService _vivaExamService;

	@PostMapping("/save-viva_exam")
	public VivaExam saveVivaExam(@RequestBody VivaExam vivaExam) {
		return _vivaExamService.createVivaExam(vivaExam);
	}

	@PostMapping("/save-viva_exam-list")
	public List<VivaExam> saveVivaExamList(@RequestBody List<VivaExam> vivaExamList) {
		return _vivaExamService.createVivaExams(vivaExamList);
	}

	@GetMapping("/get-viva_exam-list")
	public List<VivaExam> getAllVivaExams() {
		return _vivaExamService.getVivaExams();
	}

	@GetMapping("/get-viva_exam-by-id")
	public VivaExam findVivaExamById(@RequestParam("id") int id) {
		return _vivaExamService.getVivaExamById(id);
	}

	@DeleteMapping("/delete-viva_exam-by-id")
	public String deleteVivaExamById(@RequestParam("id") int id) {
		return _vivaExamService.deleteVivaExamById(id);
	}

	@PutMapping("/update-viva_exam")
	public VivaExam upateVivaExam(@RequestBody VivaExam vivaExam) {
		return _vivaExamService.updateVivaExam(vivaExam);
	}

	@DeleteMapping("/delete-all-viva_exam")
	public String deleteAll() {
		_vivaExamService.deleteVivaExams();
		return "Successfully delete all entities";
	}
}
*/