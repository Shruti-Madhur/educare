package com.example.educare.SharedModule.repository.Geography;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educare.SharedModule.models.Geography.Division;

import java.util.Set;

public interface DivisionRepository extends JpaRepository<Division, Long>{

}
