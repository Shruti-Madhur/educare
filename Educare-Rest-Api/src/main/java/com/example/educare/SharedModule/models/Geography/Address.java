package com.example.educare.SharedModule.models.Geography;

import javax.persistence.*;

import com.example.educare.SharedModule.models.Faculty.FacultyPersonalInfo;
import com.example.educare.SharedModule.models.Institutional.Institution;
import com.example.educare.SharedModule.models.Student.StudentPersonalInfo;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "address")
public class Address implements Serializable {
	
	@Id
	@Column(name = "id")
	@SequenceGenerator(
			initialValue = 1,
			name = "address_seq",
			sequenceName = "address_sequence"
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "address_seq"
	)
	private Long id;
	
	@Column(name = "street", length = 255)
	private String street;
	
	@Column(name = "postOffice", length = 255)
	private String postOffice;
	
	@Column(name = "postalCode", length = 50)
	private String postalCode;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "divisionId")
	private Division division;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "districtId")
	private District district;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "upazilaId")
	private Upazila upazila;

	//Will be auto generated
	@CreatedDate
	@Column(name = "createdOn")
	private Instant createdOn;

	@Column(name = "createdBy", length = 255)
	private String createdBy;
	
	//Will be auto generated
	@LastModifiedDate
	@Column(name = "modifiedOn")
	private Instant modifiedOn;
	
	@Column(name = "modifiedBy", length = 255)
	private String modifiedBy;
}
