package com.example.educare.SharedModule.models.Faculty;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.time.Instant;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.example.educare.AdminPanel.FacultyManagement.AttendedConferenceWorkshop.model.AttendedConferenceWorkshop;
import com.example.educare.AdminPanel.ProfManagement.CourseManagement.model.CourseOffering;
import com.example.educare.SharedModule.models.Geography.Address;
import lombok.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "faculty_personal_info")
public class FacultyPersonalInfo implements Serializable {
	@Id
	@SequenceGenerator(
			initialValue = 1,
			name = "faculty_sequence",
			sequenceName = "faculty_sequence"
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "faculty_sequence"
	)
	private Long id;

	@Column(name = "firstName", length = 255)
	private String firstName;

	@Column(name = "lastName", length = 255)
	private String lastName;

	@Column(name = "dateOfBirth")
	private Date dateOfBirth;

	@Column(name = "age")
	private int age = 0;

	@Column(name = "gender", length = 10)
	private String gender;

	@Column(name = "nid", length = 30)
	private String nid;
	

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "permanentAddress")
	private Address permanentAddress;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "presentAddress")
	private Address presentAddress;

	
	@Column(name = "cellphone", length = 11)
	private String cellphone;
	
	@Column(name = "email", length = 255)
	private String email;

	@Lob
	@Column(name = "photo", columnDefinition="BLOB")
	private byte[] photo;

	/*@OneToMany(
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	@ToString.Exclude
	private Set<CourseOffering> courses;

	@OneToMany(
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	@ToString.Exclude
	private List<FacultyEducationalQualification> facultyEducationalQualifications;

	@OneToMany(
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	@ToString.Exclude
	private List<FacultyAllResearchProject> facultyAllResearchProject;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "facultyInstitutionalInfoId", referencedColumnName = "id")
	private FacultyInstitutionalInfo facultyInstitutionalInfo;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "facultyResearchInterestId", referencedColumnName = "id")
	private FacultyResearchInterest facultyResearchInterest;
	 */
	

	//Will be auto generated
	@Column(name = "createdOn")
	private Instant createdOn;

	@Column(name = "createdBy", length = 255)
	private String createdBy;

	//Will be auto generated
	@Column(name = "modifiedOn")
	private Instant modifiedOn;

	@Column(name = "modifiedBy", length = 255)
	private String modifiedBy;
}

