package com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.controller;

import com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.model.AttendedConferenceWorkshop;
import com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.service.AttendedConferenceWorkshopService;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.model.FacultyResearchInterest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/manage/faculty/facultyWorkshop")
public class AttendedConferenceWorkshopController {

    @Autowired
    private AttendedConferenceWorkshopService service;

    //Create
    @PostMapping("/conference")
    public AttendedConferenceWorkshop add(@RequestBody AttendedConferenceWorkshop workshop) {
        return service.create(workshop);
    }

    //Create more than one
    @PostMapping("/conference-list")
    public List<AttendedConferenceWorkshop> addList(@RequestBody List<AttendedConferenceWorkshop> workshop) {
        return service.createList(workshop);
    }

    //Get One
    @GetMapping("/conference/{id}")
    public AttendedConferenceWorkshop findById(@PathVariable long id) {
        return service.getById(id);
    }

    //Get All
    @GetMapping("/conference")
    public List<AttendedConferenceWorkshop> find() {
        return service.get();
    }

    //Update
    @PutMapping("/conference/{id}")
    public AttendedConferenceWorkshop update(@RequestBody AttendedConferenceWorkshop workshop, @PathVariable("id") long id) {
        return service.update(workshop, id);
    }

    //Delete One
    @DeleteMapping("/conference/{id}")
    public List<AttendedConferenceWorkshop> deleteById(@PathVariable long id) {
        return service.deleteById(id);
    }


    //Delete All
    @DeleteMapping("/conference")
    public void delete() {
        service.delete();
    }

    //search By Name
    @GetMapping("/conference/name/{topic}")
    public List<AttendedConferenceWorkshop> findByTopic(@PathVariable String topic) {
        return service.getByTopic(topic);
    }
}