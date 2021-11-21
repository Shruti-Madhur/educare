package com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.controller;

import com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.model.AttendedConferenceWorkshop;
import com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.service.AttendedConferenceWorkshopService;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.model.FacultyResearchInterest;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.repository.FacultyResearchInterestRepository;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.service.FacultyResearchInterestService;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.model.ResearchSupervision;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.repository.ResearchSupervisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/manage/faculty")
public class FacultyResearchInterestController {

    @Autowired
    private FacultyResearchInterestService service;

    //Create
    @PostMapping("/interest")
    public FacultyResearchInterest add(@RequestBody FacultyResearchInterest research) {
        return service.create(research);
    }

    //Create more than one
    @PostMapping("/interest-list")
    public List<FacultyResearchInterest> addList(@RequestBody List<FacultyResearchInterest> research) {
        return service.createList(research);
    }

    //Get One
    @GetMapping("/interest/{id}")
    public FacultyResearchInterest findById(@PathVariable long id) {
        return service.getById(id);
    }

    //Get All
    @GetMapping("/interest")
    public List<FacultyResearchInterest> find() {
        return service.get();
    }

    //Update
    @PutMapping("/interest/{id}")
    public FacultyResearchInterest update(@RequestBody FacultyResearchInterest research, @PathVariable("id") long id) {
        return service.update(research, id);
    }

    //Delete one
    @DeleteMapping("/interest/{id}")
    public List<FacultyResearchInterest> deleteById(@PathVariable long id) {
        return service.deleteById(id);
    }


    //Delete All
    @DeleteMapping("/interest")
    public void delete() {
        service.delete();
    }

    //Search By Name
    @GetMapping("/interest/name/{subject}")
    public List<FacultyResearchInterest> findBySubject(@PathVariable String subject) {
        return service.getBySubject(subject);
    }
}