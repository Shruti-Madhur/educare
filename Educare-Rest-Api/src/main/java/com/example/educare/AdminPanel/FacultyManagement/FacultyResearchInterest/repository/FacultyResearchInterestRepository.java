package com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.repository;

import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.model.FacultyResearchInterest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FacultyResearchInterestRepository extends JpaRepository<FacultyResearchInterest,Long> {

    List<FacultyResearchInterest> findBySubjectContaining(String subject);
}
