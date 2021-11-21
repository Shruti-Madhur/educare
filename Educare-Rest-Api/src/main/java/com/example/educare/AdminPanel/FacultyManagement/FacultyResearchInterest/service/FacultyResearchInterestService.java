package com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.service;

import com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.model.AttendedConferenceWorkshop;
import com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.repository.AttendedConferenceWorkshopRepository;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.model.FacultyResearchInterest;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.repository.FacultyResearchInterestRepository;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.model.ResearchSupervision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyResearchInterestService {
    @Autowired
    private FacultyResearchInterestRepository repository;

    //Create
    public FacultyResearchInterest create(FacultyResearchInterest research) {
        return repository.save(research);


    }

    //Create More than one
    public List<FacultyResearchInterest> createList(List<FacultyResearchInterest> research) {
        return repository.saveAll(research);
    }

    //Get One
    public FacultyResearchInterest getById(long id) {
        return repository.findById(id).orElse(null);
    }

    //Get All
    public List<FacultyResearchInterest> get() {
        return repository.findAll();
    }

    //Delete One
    public List<FacultyResearchInterest> deleteById(long id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    //Delete All
    public void delete() {
        repository.deleteAll();
    }


    //Update
    public FacultyResearchInterest update(FacultyResearchInterest research, long id) {

        Optional<FacultyResearchInterest> data = repository.findById(id);
        FacultyResearchInterest _research = data.get();


        _research.setField(research.getField());
        _research.setSubject(research.getSubject());
        _research.setDescription(research.getDescription());

        return repository.save(_research);
    }

    //Search By Name
    public List<FacultyResearchInterest> getBySubject(String subject) {
        return repository.findBySubjectContaining(subject);
    }

}

