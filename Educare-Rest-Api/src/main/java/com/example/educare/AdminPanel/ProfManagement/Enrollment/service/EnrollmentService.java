package com.example.educare.AdminPanel.ProfManagement.Enrollment.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.ProfManagement.Enrollment.model.Enrollment;
import com.example.educare.AdminPanel.ProfManagement.Enrollment.repository.EnrollmentRepository;

@Service
public class EnrollmentService {
	
	@Autowired
	private EnrollmentRepository _enrollmentRepository;

	public Enrollment createEnrollment(Enrollment enrollment) {
		
		Enrollment enrollmentResp = _enrollmentRepository.save(enrollment);
		enrollmentResp.setCreatedOn(Date.valueOf(LocalDate.now()));
		
		return enrollmentResp;
	}

	public List<Enrollment> createEnrollments(List<Enrollment> enrollmentList) {
		return _enrollmentRepository.saveAll(enrollmentList);
	}

	public List<Enrollment> getEnrollments() {
		return _enrollmentRepository.findAll();
	}

	public Enrollment getEnrollmentById(int id) {
		return _enrollmentRepository.findById(id).orElse(null);
	}

	public String deleteEnrollmentById(int id) {
		_enrollmentRepository.deleteById(id);
		return "Enrollment removed !!" + id;
	}

	public void deleteEnrollments() {
		_enrollmentRepository.deleteAll();
	}

	public Enrollment updateEnrollment(Enrollment enrollment) {
		
		Enrollment existingEnrollment = _enrollmentRepository.findById(enrollment.getId()).orElse(null);
		
		existingEnrollment.setCourse(enrollment.getCourse());
		existingEnrollment.setStudent(enrollment.getStudent());
		existingEnrollment.setProfessionalOffering(enrollment.getProfessionalOffering());
		existingEnrollment.setSectionNo(enrollment.getSectionNo());
		existingEnrollment.setRoomId(enrollment.getRoomId());
		existingEnrollment.setYear(enrollment.getYear());
		existingEnrollment.setSemester(enrollment.getSemester());
		existingEnrollment.setModifiedOn(Date.valueOf(LocalDate.now()));
		existingEnrollment.setModifiedBy(enrollment.getModifiedBy());

		return _enrollmentRepository.save(existingEnrollment);

	}
}
