package com.example.educare.AdminPanel.FacultyManagement.FacultyResearchSupervision.model;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "facultyResearchSupervision")
public class ResearchSupervision {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 10)
    private long id;

    @Column(name = "projectName", length = 255)
    private String projectName;

    @Column(name = "levelOfStudy", length = 255)
    private String levelOfStudy;

    @Column(name = "coSupervisor", length = 255)
    private String coSupervisor;

    @Column(name = "areaOfResearch", length = 255)
    private String areaOfResearch;

    @Column(name = "currentCompletion", length = 255)
    private String currentCompletion;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "estimatedCompletionDate")
    private Date estimatedCompletionDate;


    public ResearchSupervision() {
    }

    public ResearchSupervision(String projectName, String levelOfStudy, String coSupervisor, String areaOfResearch, String currentCompletion, Date startDate, Date estimatedCompletionDate) {
        this.projectName = projectName;
        this.levelOfStudy = levelOfStudy;
        this.coSupervisor = coSupervisor;
        this.areaOfResearch = areaOfResearch;
        this.currentCompletion = currentCompletion;
        this.startDate = startDate;
        this.estimatedCompletionDate = estimatedCompletionDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLevelOfStudy() {
        return levelOfStudy;
    }

    public void setLevelOfStudy(String levelOfStudy) {
        this.levelOfStudy = levelOfStudy;
    }

    public String getCoSupervisor() {
        return coSupervisor;
    }

    public void setCoSupervisor(String coSupervisor) {
        this.coSupervisor = coSupervisor;
    }

    public String getAreaOfResearch() {
        return areaOfResearch;
    }

    public void setAreaOfResearch(String areaOfResearch) {
        this.areaOfResearch = areaOfResearch;
    }

    public String getCurrentCompletion() {
        return currentCompletion;
    }

    public void setCurrentCompletion(String currentCompletion) {
        this.currentCompletion = currentCompletion;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEstimatedCompletionDate() {
        return estimatedCompletionDate;
    }

    public void setEstimatedCompletionDate(Date estimatedCompletionDate) {
        this.estimatedCompletionDate = estimatedCompletionDate;
    }
}