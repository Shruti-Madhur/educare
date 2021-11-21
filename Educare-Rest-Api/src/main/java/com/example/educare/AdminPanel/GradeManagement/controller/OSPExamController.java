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

import com.example.educare.AdminPanel.GradeManagement.model.OSPExam;
import com.example.educare.AdminPanel.GradeManagement.service.OSPExamService;

@CrossOrigin
@RestController
@RequestMapping("/api/ospexam")
public class OSPExamController {
	
	@Autowired
	private OSPExamService _ospExamService;

	@PostMapping("/save-ospexam")
	public OSPExam saveOSPExam(@RequestBody OSPExam ospExam) {
		return _ospExamService.createOSPExam(ospExam);
	}

	@PostMapping("/save-ospexam-list")
	public List<OSPExam> saveOSPExamList(@RequestBody List<OSPExam> ospExamList) {
		return _ospExamService.createOSPExams(ospExamList);
	}

	@GetMapping("/get-ospexam-list")
	public List<OSPExam> getAllOSPExams() {
		return _ospExamService.getOSPExams();
	}

	@GetMapping("/get-ospexam-by-id")
	public OSPExam findOSPExamById(@RequestParam("id") int id) {
		return _ospExamService.getOSPExamById(id);
	}

	@DeleteMapping("/delete-ospexam-by-id")
	public String deleteOSPExamById(@RequestParam("id") int id) {
		return _ospExamService.deleteOSPExamById(id);
	}

	@PutMapping("/update-ospexam")
	public OSPExam upateOSPExam(@RequestBody OSPExam ospExam) {
		return _ospExamService.updateOSPExam(ospExam);
	}

	@DeleteMapping("/delete-all-ospexam")
	public String deleteAll() {
		_ospExamService.deleteOSPExams();
		return "Successfully delete all entities";
	}
}
*/