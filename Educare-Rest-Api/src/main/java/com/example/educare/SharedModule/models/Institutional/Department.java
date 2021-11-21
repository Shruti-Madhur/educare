package com.example.educare.SharedModule.models.Institutional;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.example.educare.SharedModule.models.Faculty.FacultyInstitutionalInfo;
import com.example.educare.SharedModule.models.Faculty.FacultyPersonalInfo;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "department")
public class Department implements Serializable {

	@Id
	@SequenceGenerator(
			initialValue = 1,
			name = "batch_sequence",
			sequenceName = "batch_sequence"
	)
	@GeneratedValue(

			strategy = GenerationType.SEQUENCE,
			generator = "batch_sequence"
	)
	private Long id;
	
	@Column(name = "name")
	private String name;

	/*@Column(name = "deptHead")
	private String deptHead;*/

	@Column(name = "code")
	private String code;
	
	@OneToMany(
			mappedBy = "department",
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JsonIgnore
	@ToString.Exclude
	private List<Subject> subjects;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deptHeadId")
	private FacultyPersonalInfo head;

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

