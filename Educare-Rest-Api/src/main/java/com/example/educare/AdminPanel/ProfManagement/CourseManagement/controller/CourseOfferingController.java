package com.example.educare.AdminPanel.ProfManagement.CourseManagement.controller;

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

import com.example.educare.AdminPanel.ProfManagement.CourseManagement.model.CourseOffering;
import com.example.educare.AdminPanel.ProfManagement.CourseManagement.service.CourseOfferingService;

@CrossOrigin
@RestController
@RequestMapping("/api/manage/course")
public class CourseOfferingController {
	
	@Autowired
	private CourseOfferingService _courseService;

	@PostMapping("/save-course")
	public CourseOffering saveCourse(@RequestBody CourseOffering course) {
		return _courseService.createCourse(course);
	}

	@PostMapping("/save-course-list")
	public List<CourseOffering> saveCourseList(@RequestBody List<CourseOffering> courseList) {
		return _courseService.createCourses(courseList);
	}

	@GetMapping("/get-course-list")
	public List<CourseOffering> getAllCourses() {
		return _courseService.getCourses();
	}

	@GetMapping("/get-course-by-id")
	public CourseOffering findCourseById(@RequestParam("id") int id) {
		return _courseService.getCourseById(id);
	}

	@DeleteMapping("/delete-course-by-id")
	public String deleteCourseById(@RequestParam("id") int id) {
		return _courseService.deleteCourseById(id);
	}

	@PutMapping("/update-course")
	public CourseOffering upateCourse(@RequestBody CourseOffering course) {
		return _courseService.updateCourse(course);
	}

	@DeleteMapping("/delete-all-course")
	public String deleteAll() {
		_courseService.deleteCourses();
		return "Successfully delete all entities";
	}
}
