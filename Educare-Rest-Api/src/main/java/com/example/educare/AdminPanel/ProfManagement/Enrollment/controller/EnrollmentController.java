package com.example.educare.AdminPanel.ProfManagement.Enrollment.controller;

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

import com.example.educare.AdminPanel.ProfManagement.Enrollment.model.Enrollment;
import com.example.educare.AdminPanel.ProfManagement.Enrollment.service.EnrollmentService;

@CrossOrigin
@RestController
@RequestMapping("/api/enrollment")
public class EnrollmentController {
	
	@Autowired
	private EnrollmentService _enrollmentService;

	@PostMapping("/save-enrollment")
	public Enrollment saveEnrollment(@RequestBody Enrollment enrollment) {
		return _enrollmentService.createEnrollment(enrollment);
	}

	@PostMapping("/save-enrollment-list")
	public List<Enrollment> saveEnrollmentList(@RequestBody List<Enrollment> enrollmentList) {
		return _enrollmentService.createEnrollments(enrollmentList);
	}

	@GetMapping("/get-enrollment-list")
	public List<Enrollment> getAllEnrollments() {
		return _enrollmentService.getEnrollments();
	}

	@GetMapping("/get-enrollment-by-id")
	public Enrollment findEnrollmentById(@RequestParam("id") int id) {
		return _enrollmentService.getEnrollmentById(id);
	}

	@DeleteMapping("/delete-enrollment-by-id")
	public String deleteEnrollmentById(@RequestParam("id") int id) {
		return _enrollmentService.deleteEnrollmentById(id);
	}

	@PutMapping("/update-enrollment")
	public Enrollment upateEnrollment(@RequestBody Enrollment enrollment) {
		return _enrollmentService.updateEnrollment(enrollment);
	}

	@DeleteMapping("/delete-all-enrollment")
	public String deleteAll() {
		_enrollmentService.deleteEnrollments();
		return "Successfully delete all entities";
	}
}
