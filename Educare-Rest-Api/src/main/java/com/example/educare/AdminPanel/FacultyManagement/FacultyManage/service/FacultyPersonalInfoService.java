package com.example.educare.AdminPanel.FacultyManagement.FacultyManage.service;

import java.sql.Date;

import java.time.Instant;
import java.time.LocalDate;

import java.util.List;

import com.example.educare.SharedModule.service.Geography.AddressService;
import com.example.educare.SharedModule.utils.AddressUtils;
import com.example.educare.SharedModule.utils.FacultyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.AdminPanel.FacultyManagement.FacultyManage.repository.FacultyPersonalInfoRepository;
import com.example.educare.SharedModule.models.Faculty.FacultyPersonalInfo;
import com.example.educare.SharedModule.utils.AgeConverterService;

@Service
public class FacultyPersonalInfoService {
	
	@Autowired
	private FacultyPersonalInfoRepository _facultyRepository;
	
	@Autowired 
	private AgeConverterService _ageConverterService;

	@Autowired
	private FacultyUtils _facultyUtils;

	@Autowired
	private AddressUtils _utils;

	public FacultyPersonalInfo createFaculty(FacultyPersonalInfo faculty) {
		if(faculty.getPermanentAddress() != null){
			_utils.addressPreprocess(faculty.getPermanentAddress());
		}

		if(faculty.getPresentAddress() != null){
			_utils.addressPreprocess(faculty.getPresentAddress());
		}

		faculty.setAge(_ageConverterService.age(faculty.getDateOfBirth()));
		faculty.setCreatedOn(Instant.now());
		
		_facultyRepository.save(faculty);
		_facultyUtils.clearCircle(faculty);
		return faculty;
	}

	public List<FacultyPersonalInfo> getFacultys() {
		List<FacultyPersonalInfo> facultyPersonalInfos = _facultyRepository.findAll();
		for(FacultyPersonalInfo facultyPersonalInfo: facultyPersonalInfos){
			_facultyUtils.clearCircle(facultyPersonalInfo);
		}
		return facultyPersonalInfos;
	}

	public FacultyPersonalInfo getFacultyById(Long id) {
		FacultyPersonalInfo facultyPersonalInfo = _facultyRepository.findById(id).orElse(null);
		assert facultyPersonalInfo != null;
		_facultyUtils.clearCircle(facultyPersonalInfo);
		return facultyPersonalInfo;
	}

	public String deleteFacultyById(Long id) {
		FacultyPersonalInfo facultyPersonalInfo = _facultyRepository.findById(id).orElse(null);
		assert facultyPersonalInfo != null;
		_facultyUtils.deletePreprocess(facultyPersonalInfo);
		_facultyRepository.deleteById(id);
		return "Faculty removed " + id + "!!";
	}

	public FacultyPersonalInfo updateFaculty(FacultyPersonalInfo faculty) {

		FacultyPersonalInfo existingFaculty = _facultyRepository.findById(faculty.getId()).orElse(null);

		assert existingFaculty != null;
		existingFaculty.setFirstName(faculty.getFirstName());
		existingFaculty.setLastName(faculty.getLastName());
		existingFaculty.setDateOfBirth(faculty.getDateOfBirth());
		existingFaculty.setAge(_ageConverterService.age(faculty.getDateOfBirth()));
		existingFaculty.setGender(faculty.getGender());
		existingFaculty.setNid(faculty.getNid());

		if(faculty.getPermanentAddress() != null){
			_utils.updateAddress(
					existingFaculty.getPermanentAddress(),
					faculty.getPermanentAddress()
			);
		}
		if (faculty.getPresentAddress() != null){
			_utils.updateAddress(
					existingFaculty.getPresentAddress(),
					faculty.getPresentAddress()
			);
		}

		existingFaculty.setCellphone(faculty.getCellphone());
		existingFaculty.setPhoto(faculty.getPhoto());
		existingFaculty.setModifiedOn(Instant.now());
		existingFaculty.setModifiedBy(faculty.getModifiedBy());
		
		_facultyRepository.save(existingFaculty);
		_facultyUtils.clearCircle(existingFaculty);

		return existingFaculty;
	}
}
