package com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.repository;

import com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.model.AttendedConferenceWorkshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendedConferenceWorkshopRepository extends JpaRepository<AttendedConferenceWorkshop, Long> {
    List<AttendedConferenceWorkshop> findByTopic(String topic);
}
