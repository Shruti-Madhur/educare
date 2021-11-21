package com.example.educare.SharedModule.models.Institutional;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;
import java.util.List;

import javax.persistence.*;

import com.example.educare.AdminPanel.ProfManagement.CourseManagement.model.CourseOffering;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "subject")
public class Subject implements Serializable {

	@Id
	@SequenceGenerator(
			initialValue = 1,
			name = "subject_sequence",
			sequenceName = "subject_sequence"
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "subject_sequence"
	)
	private Long id;
	
	@Column(name = "name", length = 255)
	private String name;

	@Column(name = "code", length = 255)
	private String code;

	@ManyToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JoinColumn(
			foreignKey = @ForeignKey(name = "deptId"),
			name = "deptId"
	)
	@ToString.Exclude
	private Department department;
	
	@ManyToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JoinColumn(
			foreignKey = @ForeignKey(name = "phaseId"),
			name = "phaseId"
	)
	@ToString.Exclude
	private Phase phase;

	@OneToMany(
			mappedBy = "subject",
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JsonIgnore
	@ToString.Exclude
	private List<Part> parts;

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
