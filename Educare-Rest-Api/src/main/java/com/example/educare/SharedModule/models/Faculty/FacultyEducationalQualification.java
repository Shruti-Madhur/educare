package com.example.educare.SharedModule.models.Faculty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "faculty_educational_qualification")
public class FacultyEducationalQualification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "degree")
	private String degree;
	
	@Column(name = "institution")
	private String institution;
	
	@Column(name = "completionYear")
	private int completionYear;
	
	@Column(name = "result")
	private String result;
	
	@ManyToOne
	@JoinColumn(name = "facultyId", nullable = false)
	private FacultyPersonalInfo faculty;

	public FacultyEducationalQualification() {
	}

	public FacultyEducationalQualification(int id, String degree, String institution, int completionYear, String result,
			FacultyPersonalInfo faculty) {
		this.id = id;
		this.degree = degree;
		this.institution = institution;
		this.completionYear = completionYear;
		this.result = result;
		this.faculty = faculty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public int getCompletionYear() {
		return completionYear;
	}

	public void setCompletionYear(int completionYear) {
		this.completionYear = completionYear;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public FacultyPersonalInfo getFaculty() {
		return faculty;
	}

	public void setFaculty(FacultyPersonalInfo faculty) {
		this.faculty = faculty;
	}
}
