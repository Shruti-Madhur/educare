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
@EqualsAndHashCode
@Table(name = "district")
public class District {

	@Id
	@Column(name = "id")
	/*@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "district_seq"
	)
	@SequenceGenerator(
			initialValue = 1,
			name = "district_seq",
			sequenceName = "district_sequence"
	)*/
	private Long id;
	
	@Column(name = "name", length = 255)
	private String name;
	
	@Column(name = "geocode", length = 255)
	private String geocode;
	
	@ManyToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
    @JoinColumn(
			foreignKey = @ForeignKey(name = "divisionId"),
			name = "divisionId"
	)
	@ToString.Exclude
	private Division division;
	
	@OneToMany(
			mappedBy = "district",
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
			//orphanRemoval = true
	)
	@JsonIgnore
	@ToString.Exclude
	private List<Upazila> upazilas;
}
