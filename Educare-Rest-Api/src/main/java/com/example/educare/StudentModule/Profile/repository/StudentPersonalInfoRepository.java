package com.example.educare.StudentModule.Profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educare.SharedModule.models.Student.StudentPersonalInfo;

public interface StudentPersonalInfoRepository extends JpaRepository<StudentPersonalInfo, Long> {

}