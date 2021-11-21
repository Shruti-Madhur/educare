package com.example.educare.SharedModule.repository.Institutional;

import com.example.educare.SharedModule.models.Institutional.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
    List<Institution> findByNameContaining(String name);

}
