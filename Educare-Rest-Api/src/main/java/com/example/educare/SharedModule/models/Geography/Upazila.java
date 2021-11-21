package com.example.educare.SharedModule.models.Geography;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "upazila")
public class Upazila {
	
	@Id
	@Column(name = "id")
	/*@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "upazila_seq"
	)
	@SequenceGenerator(
			initialValue = 1,
			name = "upazila_seq",
			sequenceName = "upazila_sequence"
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
			foreignKey = @ForeignKey(name = "districtId"),
			name = "districtId"
	)
	@ToString.Exclude
	private District district;
}
