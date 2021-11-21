package com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.controller;

import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.model.FacultyResearchInterest;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.service.FacultyResearchInterestService;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.model.ResearchSupervision;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.repository.ResearchSupervisionRepository;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.service.ResearchSupervisionService;
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
public class ResearchSupervisionController {

    @Autowired
    private ResearchSupervisionService service;

    //Create
    @PostMapping("/supervision")
    public ResearchSupervision add(@RequestBody ResearchSupervision research) {
        return service.create(research);
    }

    //Create more than one
    @PostMapping("/supervision-list")
    public List<ResearchSupervision> addList(@RequestBody List<ResearchSupervision> research) {
        return service.createList(research);
    }

    //Get One
    @GetMapping("/supervision/{id}")
    public ResearchSupervision findById(@PathVariable long id) {
        return service.getById(id);
    }

    //Get All
    @GetMapping("/supervision")
    public List<ResearchSupervision> find() {
        return service.get();
    }

    //Update
    @PutMapping("/supervision/{id}")
    public ResearchSupervision updateResearchSupervision(@RequestBody ResearchSupervision research, @PathVariable("id") long id) {
        return service.update(research, id);
    }

    //Delete One
    @DeleteMapping("/supervision/{id}")
    public List<ResearchSupervision> deleteById(@PathVariable long id) {
        return service.deleteById(id);
    }


    //Delete All
    @DeleteMapping("/supervision")
    public void delete() {
        service.delete();
    }

    //Search By Name
    @GetMapping("/supervision/name/{projectName}")
    public List<ResearchSupervision> findByProjectName(@PathVariable String projectName) {
        return service.getByProject(projectName);
    }
}