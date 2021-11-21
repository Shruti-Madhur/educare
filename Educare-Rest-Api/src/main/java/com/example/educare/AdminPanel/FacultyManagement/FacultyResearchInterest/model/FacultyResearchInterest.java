package com.example.educare.AdminPanel.FacultyManagement.FacultyResearchInterest.model;


import com.jayway.jsonpath.internal.function.numeric.Max;

import javax.persistence.*;

@Entity
@Table(name = "ResearchInterest")
public class FacultyResearchInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 10)
    private long id;

    @Column(name = "field", length = 255)
    private String field;

    @Column(name = "subject", length = 255)
    private String subject;

    @Column(name = "description", length = 255)
    private String description;


    public FacultyResearchInterest() {
    }

    public FacultyResearchInterest(String field, String subject, String description) {
        this.field = field;
        this.subject = subject;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}