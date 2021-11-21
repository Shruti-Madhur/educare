package com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.service;

import com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.model.AttendedConferenceWorkshop;
import com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.repository.AttendedConferenceWorkshopRepository;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.model.FacultyResearchInterest;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.model.ResearchSupervision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.Optional;

@Service
public class AttendedConferenceWorkshopService {

    @Autowired
    private AttendedConferenceWorkshopRepository repository;

    //Create
    public AttendedConferenceWorkshop create(AttendedConferenceWorkshop workshop) {
        return repository.save(workshop);


    }

    //Create More than one
    public List<AttendedConferenceWorkshop> createList(List<AttendedConferenceWorkshop> workshop) {
        return repository.saveAll(workshop);
    }

    //Get One
    public AttendedConferenceWorkshop getById(long id) {
        return repository.findById(id).orElse(null);
    }

    //Get All
    public List<AttendedConferenceWorkshop> get() {
        return repository.findAll();
    }

    //Delete One
    public List<AttendedConferenceWorkshop> deleteById(long id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    //Delete All
    public void delete() {
        repository.deleteAll();
    }


    //Update
    public AttendedConferenceWorkshop update(AttendedConferenceWorkshop workshop, long id) {

        Optional<AttendedConferenceWorkshop> data = repository.findById(id);
        AttendedConferenceWorkshop _workshop = data.get();

        _workshop.setTopic(workshop.getTopic());
        _workshop.setDate(workshop.getDate());
        _workshop.setOrganization(workshop.getOrganization());
        _workshop.setDuration(workshop.getDuration());
        _workshop.setVenue(workshop.getVenue());


        return repository.save(_workshop);
    }

    //Search By Name
    public List<AttendedConferenceWorkshop> getByTopic(String topic) {
        return repository.findByTopic(topic);
    }

}