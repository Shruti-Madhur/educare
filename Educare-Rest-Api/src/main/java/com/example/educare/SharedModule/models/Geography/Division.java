package com.example.educare.SharedModule.models.Geography;

import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "division")
public class Division {

	@Id
	@Column(name = "id")
	/*@SequenceGenerator(
			initialValue = 1,
			name = "division_seq",
			sequenceName = "division_sequence"
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "division_seq"
	)*/
	private Long id;

	@Column(name = "name", length = 255)
	private String name;
	
	@Column(name = "geocode", length = 255)
	private String geocode;
	
	@OneToMany(
			mappedBy = "division",
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL
			//orphanRemoval = true
	)
	@JsonIgnore
	@ToString.Exclude
	private List<District> districts;
}
