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

import com.example.educare.AdminPanel.GradeManagement.model.WrittenExam;
import com.example.educare.AdminPanel.GradeManagement.service.WrittenExamService;

@CrossOrigin
@RestController
@RequestMapping("/api/written_exam")
public class WrittenExamController {
	
	@Autowired
	private WrittenExamService _writtenExamService;

	@PostMapping("/save-written_exam")
	public WrittenExam saveWrittenExam(@RequestBody WrittenExam writtenExam) {
		return _writtenExamService.createWrittenExam(writtenExam);
	}

	@PostMapping("/save-written_exam-list")
	public List<WrittenExam> saveWrittenExamList(@RequestBody List<WrittenExam> writtenExamList) {
		return _writtenExamService.createWrittenExams(writtenExamList);
	}

	@GetMapping("/get-written_exam-list")
	public List<WrittenExam> getAllWrittenExams() {
		return _writtenExamService.getWrittenExams();
	}

	@GetMapping("/get-written_exam-by-id")
	public WrittenExam findWrittenExamById(@RequestParam("id") int id) {
		return _writtenExamService.getWrittenExamById(id);
	}

	@DeleteMapping("/delete-written_exam-by-id")
	public String deleteWrittenExamById(@RequestParam("id") int id) {
		return _writtenExamService.deleteWrittenExamById(id);
	}

	@PutMapping("/update-written_exam")
	public WrittenExam upateWrittenExam(@RequestBody WrittenExam writtenExam) {
		return _writtenExamService.updateWrittenExam(writtenExam);
	}

	@DeleteMapping("/delete-all-written_exam")
	public String deleteAll() {
		_writtenExamService.deleteWrittenExams();
		return "Successfully delete all entities";
	}
}
*/