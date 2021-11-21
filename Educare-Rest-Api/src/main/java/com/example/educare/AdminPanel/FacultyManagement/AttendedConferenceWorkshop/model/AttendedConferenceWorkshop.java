package com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.model;

import com.example.educare.SharedModule.models.Faculty.FacultyPersonalInfo;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "AttendedConferenceWorkshop")
public class AttendedConferenceWorkshop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 10)
    private Long id;

    @Column(name = "topic", length = 255)
    private String topic;

    @Column(name = "date")
    private Date date;

    @Column(name = "organization", length = 255)
    private String organization;

    @Column(name = "duration")
    private Time duration;

    @Column(name = "venue", length = 255)
    private String venue;


    public AttendedConferenceWorkshop() {
    }

    public AttendedConferenceWorkshop(String topic, Date date, String organization, Time duration, String venue) {
        this.topic = topic;
        this.date = date;
        this.organization = organization;
        this.duration = duration;
        this.venue = venue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}