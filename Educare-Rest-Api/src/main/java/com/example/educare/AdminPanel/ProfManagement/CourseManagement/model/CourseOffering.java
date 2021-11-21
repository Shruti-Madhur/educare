package com.example.educare.AdminPanel.ProfManagement.CourseManagement.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;

import javax.persistence.*;

import com.example.educare.AdminPanel.ProfManagement.model.ProfessionalOffering;
import com.example.educare.SharedModule.models.Faculty.FacultyPersonalInfo;
import com.example.educare.SharedModule.models.Institutional.Subject;
import lombok.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "course_offering")
public class CourseOffering implements Serializable {

	@Id
	@SequenceGenerator(
			initialValue = 1,
			name = "course_sequence",
			sequenceName = "course_sequence"
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "course_sequence"
	)
	private int id;
	
	@ManyToOne
	@JoinColumn(
			foreignKey = @ForeignKey(name = "facultyId"),
			name = "facultyId"
	)
	private FacultyPersonalInfo facultyPersonalInfo;

	@ManyToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JoinColumn(
			foreignKey = @ForeignKey(name = "profId"),
			name = "profId"
	)
	private ProfessionalOffering professionalOffering;
	
	@Column(name = "courseTime")
	private Date courseTime;
	
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
	private Instant createdOn;

	@Column(name = "createdBy")
	private String createdBy;
	
	//Will be auto generated
	@Column(name = "modifiedOn")
	private Instant modifiedOn;
	
	@Column(name = "modifiedBy")
	private String modifiedBy;
}
