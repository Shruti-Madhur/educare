package com.example.educare.SharedModule.models.Institutional;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.example.educare.SharedModule.models.Student.StudentPersonalInfo;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "batch")
public class Batch implements Serializable {
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
	
	@Column(name = "name", length = 255)
	private String name;
	
	@Column(name = "year", length = 4)
	private int year;
	
	@Column(name = "admissionYear", length = 4)
	private int admissionYear;
	
	@OneToMany(
			mappedBy = "batch",
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
			//orphanRemoval = true
	)
	@JsonIgnore
	@ToString.Exclude
	private List<StudentPersonalInfo> studentPersonalInfos;
	
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
