package com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.service;

import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.model.FacultyResearchInterest;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.repository.FacultyResearchInterestRepository;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.model.ResearchSupervision;
import com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.repository.ResearchSupervisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service

public class ResearchSupervisionService {
    @Autowired
    private ResearchSupervisionRepository repository;

    //Create
    public ResearchSupervision create(ResearchSupervision research) {
        return repository.save(research);


    }

    //Create More than one
    public List<ResearchSupervision> createList(List<ResearchSupervision> research) {
        return repository.saveAll(research);
    }

    //Get One
    public ResearchSupervision getById(long id) {
        return repository.findById(id).orElse(null);
    }

    //Get All
    public List<ResearchSupervision> get() {
        return repository.findAll();
    }

    //Delete One
    public List<ResearchSupervision> deleteById(long id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    //Delete All
    public void delete() {
        repository.deleteAll();
    }


    //Update
    public ResearchSupervision update(ResearchSupervision research, long id) {

        Optional<ResearchSupervision> data = repository.findById(id);
        ResearchSupervision _research = data.get();

        _research.setProjectName(research.getProjectName());
        _research.setLevelOfStudy(research.getLevelOfStudy());
        _research.setCoSupervisor(research.getCoSupervisor());
        _research.setAreaOfResearch(research.getAreaOfResearch());
        _research.setCurrentCompletion(research.getCurrentCompletion());
        _research.setStartDate(research.getStartDate());
        _research.setEstimatedCompletionDate(research.getEstimatedCompletionDate());


        return repository.save(_research);
    }

    //Search By Name
    public List<ResearchSupervision> getByProject(String projectName) {
        return repository.findByProjectNameContaining(projectName);
    }

}



