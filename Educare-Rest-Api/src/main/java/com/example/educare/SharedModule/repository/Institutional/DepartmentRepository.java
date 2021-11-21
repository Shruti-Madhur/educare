package com.example.educare.SharedModule.repository.Institutional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educare.SharedModule.models.Institutional.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
}
