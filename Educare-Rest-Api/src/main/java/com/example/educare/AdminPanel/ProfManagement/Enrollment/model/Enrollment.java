package com.example.educare.AdminPanel.ProfManagement.Enrollment.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.educare.AdminPanel.ProfManagement.CourseManagement.model.CourseOffering;
import com.example.educare.AdminPanel.ProfManagement.model.ProfessionalOffering;
import com.example.educare.SharedModule.models.Student.StudentPersonalInfo;

@Entity
@Table(name = "enrollment")
public class Enrollment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "courseId", nullable = false)
	private CourseOffering course;
	
	@ManyToOne
	@JoinColumn(name = "studentId", nullable = false)
	private StudentPersonalInfo studentPersonalInfo;
	
	@ManyToOne
	@JoinColumn(name = "professionalId", nullable = false)
	private ProfessionalOffering professionalOffering;
	
	@Column(name = "sectionNo")
	private int sectionNo;
	
	@Column(name = "roomId")
	private int roomId;
	
	@Column(name = "year")
	private int year;
	
	@Column(name = "semester")
	private String semester;

	//Will be auto generated
	@Column(name = "createdOn")
	private Date createdOn;

	@Column(name = "createdBy")
	private String createdBy;
	
	//Will be auto generated
	@Column(name = "modifiedOn")
	private Date modifiedOn;
	
	@Column(name = "modifiedBy")
	private String modifiedBy;
	
	public Enrollment() {
	}

	public Enrollment(int id, CourseOffering course, StudentPersonalInfo studentPersonalInfo, ProfessionalOffering professionalOffering,
                      int sectionNo, int roomId, int year, String semester, Date createdOn, String createdBy, Date modifiedOn,
                      String modifiedBy) {
		this.id = id;
		this.course = course;
		this.studentPersonalInfo = studentPersonalInfo;
		this.professionalOffering = professionalOffering;
		this.sectionNo = sectionNo;
		this.roomId = roomId;
		this.year = year;
		this.semester = semester;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.modifiedOn = modifiedOn;
		this.modifiedBy = modifiedBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CourseOffering getCourse() {
		return course;
	}

	public void setCourse(CourseOffering course) {
		this.course = course;
	}

	public StudentPersonalInfo getStudent() {
		return studentPersonalInfo;
	}

	public void setStudent(StudentPersonalInfo studentPersonalInfo) {
		this.studentPersonalInfo = studentPersonalInfo;
	}

	public ProfessionalOffering getProfessionalOffering() {
		return professionalOffering;
	}

	public void setProfessionalOffering(ProfessionalOffering professionalOffering) {
		this.professionalOffering = professionalOffering;
	}

	public int getSectionNo() {
		return sectionNo;
	}

	public void setSectionNo(int sectionNo) {
		this.sectionNo = sectionNo;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
}
