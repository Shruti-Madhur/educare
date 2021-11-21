package com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.repository;

import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.model.ResearchSupervision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResearchSupervisionRepository extends JpaRepository<ResearchSupervision,Long> {


    List<ResearchSupervision> findByProjectNameContaining(String projectName);


}
