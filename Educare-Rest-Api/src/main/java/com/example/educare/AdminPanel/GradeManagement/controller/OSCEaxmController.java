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

import com.example.educare.AdminPanel.GradeManagement.model.OSCExam;
import com.example.educare.AdminPanel.GradeManagement.service.OSCExamService;

@CrossOrigin
@RestController
@RequestMapping("/api/oscexam")
public class OSCEaxmController {
	
	@Autowired
	private OSCExamService _oscExamService;

	@PostMapping("/save-oscexam")
	public OSCExam saveOSCExam(@RequestBody OSCExam oscExam) {
		return _oscExamService.createOSCExam(oscExam);
	}

	@PostMapping("/save-oscexam-list")
	public List<OSCExam> saveOSCExamList(@RequestBody List<OSCExam> oscExamList) {
		return _oscExamService.createOSCExams(oscExamList);
	}

	@GetMapping("/get-oscexam-list")
	public List<OSCExam> getAllOSCExams() {
		return _oscExamService.getOSCExams();
	}

	@GetMapping("/get-oscexam-by-id")
	public OSCExam findOSCExamById(@RequestParam("id") int id) {
		return _oscExamService.getOSCExamById(id);
	}

	@DeleteMapping("/delete-oscexam-by-id")
	public String deleteOSCExamById(@RequestParam("id") int id) {
		return _oscExamService.deleteOSCExamById(id);
	}

	@PutMapping("/update-oscexam")
	public OSCExam upateOSCExam(@RequestBody OSCExam oscExam) {
		return _oscExamService.updateOSCExam(oscExam);
	}

	@DeleteMapping("/delete-all-oscexam")
	public String deleteAll() {
		_oscExamService.deleteOSCExams();
		return "Successfully delete all entities";
	}
}
*/