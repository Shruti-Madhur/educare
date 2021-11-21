package com.example.educare.AdminPanel.FacultyManagement.FacultyManage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educare.SharedModule.models.Faculty.FacultyPersonalInfo;

public interface FacultyPersonalInfoRepository extends JpaRepository<FacultyPersonalInfo, Long>{

}
