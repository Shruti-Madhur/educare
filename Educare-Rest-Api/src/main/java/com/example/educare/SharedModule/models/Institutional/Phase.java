package com.example.educare.SharedModule.models.Institutional;

import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;
import java.util.Set;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "phase")
public class Phase implements Serializable {
	
	@Id
	@SequenceGenerator(
			initialValue = 1,
			name = "phase_sequence",
			sequenceName = "phase_sequence"
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "phase_sequence"
	)
	private Long id;
	
	@Column(name = "name", length = 255)
	private String name;
	
	@Column(name = "year", length = 4)
	private int year;
	
	@OneToMany(
			mappedBy = "phase",
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JsonIgnore
	@ToString.Exclude
	private Set<Subject> subjects;
	
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
