package com.example.educare.SharedModule.models.Student;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Date;
import java.time.Instant;
import java.util.List;

import javax.persistence.*;
import javax.sql.rowset.serial.SerialBlob;

import com.example.educare.SharedModule.models.Geography.Address;
import com.example.educare.SharedModule.models.Institutional.Batch;
import lombok.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "student_personal_info")
public class StudentPersonalInfo implements Serializable {
	@Id
	@SequenceGenerator(
			initialValue = 1,
			name = "student_sequence",
			sequenceName = "student_sequence"
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
	)
	private Long id;
	
	@Column(name = "fullName", length = 255)
	private String fullName;
	
	@Column(name = "studentId", length = 20)
	private String studentId;
	
	@Column(name = "currentStatus", length = 255)
	private String currentStatus;
	
	@Column(name = "cellphone", length = 11)
	private String cellphone;
	
	@Column(name = "email", length = 255)
	private String email;
	
	@Column(name = "nid", length = 30)
	private String nid;
	
	@Column(name = "birthRegNO", length = 30)
	private String birthRegNO;
	
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	
	//Will be auto assigned, calculating from date of birth
	@Column(name = "age")
	private int age;
	
	@Column(name = "gender", length = 10)
	private String gender;
	
	@Column(name = "nationality", length = 20)
	private String nationality;
	
	@Column(name = "bloodGroup", length = 10)
	private String bloodGroup;
	
	@Column(name = "martialStatus", length = 30)
	private String maritialStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "permanentAddress", referencedColumnName = "id")
	private Address permanentAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "presentAddress", referencedColumnName = "id")
	private Address presentAddress;

	@Column(name = "fatherName", length = 255)
	private String fatherName;
	
	@Column(name = "motherName", length = 255)
	private String motherName;
	
	@Column(name = "gurdianName", length = 255)
	private String gurdianName;
	
	@Column(name = "parentMobileNo", length = 11)
	private String parentMobibleNo;
	
	@ManyToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
	)
	@JoinColumn(
			foreignKey = @ForeignKey(name = "batchId"),
			name = "batchId"
	)
	@ToString.Exclude
	private Batch batch;

	@Lob
	@Column(name = "photo", columnDefinition="BLOB")
	private byte[] photo;
	
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