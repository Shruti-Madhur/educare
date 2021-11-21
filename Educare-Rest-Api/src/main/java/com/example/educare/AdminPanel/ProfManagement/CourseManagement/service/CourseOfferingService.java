package com.example.educare.AdminPanel.ProfManagement.CourseManagement.service;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.ProfManagement.CourseManagement.model.CourseOffering;
import com.example.educare.AdminPanel.ProfManagement.CourseManagement.repository.CourseOfferingRepository;

@Service
public class CourseOfferingService {
	
	@Autowired
	private CourseOfferingRepository _courseRepository;

	public CourseOffering createCourse(CourseOffering course_Offering) {
		
		CourseOffering course_OfferingResp = _courseRepository.save(course_Offering);
		course_OfferingResp.setCreatedOn(Instant.now());
		
		return course_OfferingResp;
	}

	public List<CourseOffering> createCourses(List<CourseOffering> courseList) {
		return _courseRepository.saveAll(courseList);
	}

	public List<CourseOffering> getCourses() {
		return _courseRepository.findAll();
	}

	public CourseOffering getCourseById(int id) {
		return _courseRepository.findById(id).orElse(null);
	}

	public String deleteCourseById(int id) {
		_courseRepository.deleteById(id);
		return "Course removed !!" + id;
	}

	public void deleteCourses() {
		_courseRepository.deleteAll();
	}

	public CourseOffering updateCourse(CourseOffering course) {
		
		CourseOffering existingCourse = _courseRepository.findById(course.getId()).orElse(null);

		assert existingCourse != null;
		existingCourse.setCourseTime(course.getCourseTime());
		existingCourse.setSectionNo(course.getSectionNo());
		existingCourse.setRoomId(course.getRoomId());
		existingCourse.setYear(course.getYear());
		existingCourse.setSemester(course.getSemester());
		existingCourse.setModifiedOn(Instant.now());
		existingCourse.setModifiedBy(course.getModifiedBy());

		return _courseRepository.save(existingCourse);

	}
}
