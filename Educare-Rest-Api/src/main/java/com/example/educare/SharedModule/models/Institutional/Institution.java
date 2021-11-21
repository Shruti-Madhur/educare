package com.example.educare.SharedModule.models.Institutional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.educare.SharedModule.models.Geography.Address;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.Instant;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "institution_")
public class Institution {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long institutionId;

	@Column(name = "name")
	private String name;

	@Column(name = "slogan")
	private String slogan;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address", referencedColumnName = "id")
	private Address address;

	@Column(name = "officeEmail")
	private String officeEmail;

	@Column(name = "officeCellPhone")
	private Long officeCellPhone;

	@Column(name = "fax")
	private Long fax;

	@Column(name = "website")
	private String website;

	@CreatedDate
	@Column(name = "createdOn", nullable = false, updatable = false)
	private Instant createdOn = Instant.now();

	@CreatedBy
	@Column(name = "createdBy", updatable = false)
	private String createdBy;

	@LastModifiedDate
	@Column(name = "modifiedOn", nullable = false)
	private Instant modifiedOn = Instant.now();

	@LastModifiedBy
	@Column(name = "modifiedBy")
	private String modifiedBy;

	public void setName(String name) {
		this.name = name;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setOfficeEmail(String officeEmail) {
		this.officeEmail = officeEmail;
	}

	public void setOfficeCellPhone(Long officeCellPhone) {
		this.officeCellPhone = officeCellPhone;
	}

	public void setFax(Long fax) {
		this.fax = fax;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
}
