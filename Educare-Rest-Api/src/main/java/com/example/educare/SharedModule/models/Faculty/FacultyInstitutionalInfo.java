package com.example.educare.SharedModule.models.Faculty;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.educare.SharedModule.models.Institutional.Department;
import com.example.educare.SharedModule.models.Institutional.Institution;

@Entity
@Table(name = "faculty_institutional_info")
public class FacultyInstitutionalInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "institutional")
	private String institutional;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "officeEmail")
	private String officeEmail;
	
	@Column(name = "officeCellPhone")
	private Long officeCellPhone;
	
	@Column(name = "salary")
	private Long salary;
	
	@Column(name = "position")
	private String positon;
	
	/*@OneToOne(mappedBy = "faculty")
	private Department department;
	
	@OneToOne(mappedBy = "fc")
	private FacultyPersonalInfo FacultyPersonalInfo;
	
	@OneToOne(mappedBy = "facultyInstitutionalInfo")
	private Institution institution;*/

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

	public FacultyInstitutionalInfo() {
	}
}
