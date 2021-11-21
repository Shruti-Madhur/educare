package com.example.educare.AdminPanel.ProfManagement.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.*;

import com.example.educare.AdminPanel.ProfManagement.CourseManagement.model.CourseOffering;
import com.example.educare.AdminPanel.ProfManagement.Enrollment.model.Enrollment;
import com.example.educare.SharedModule.models.Institutional.Batch;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "professional_offering")
public class ProfessionalOffering {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "profName")
	private String profName;
	
	@OneToMany(
			mappedBy = "professionalOffering",
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JsonIgnore
	@ToString.Exclude
	private List<Enrollment> enrollments;

	@OneToMany(
			mappedBy = "professionalOffering",
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JsonIgnore
	@ToString.Exclude
	private List<CourseOffering> courseOfferings;

	@Column(name = "session")
	private String session;

	/*@ManyToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JoinColumn(
			foreignKey = @ForeignKey(name = "batchId"),
			name = "batchId"
	)
	@ToString.Exclude
	private Batch batch;*/

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
