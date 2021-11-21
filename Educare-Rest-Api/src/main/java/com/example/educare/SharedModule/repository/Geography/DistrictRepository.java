package com.example.educare.SharedModule.repository.Geography;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educare.SharedModule.models.Geography.District;

import java.util.List;
import java.util.Set;

public interface DistrictRepository extends JpaRepository<District, Long>{
}
