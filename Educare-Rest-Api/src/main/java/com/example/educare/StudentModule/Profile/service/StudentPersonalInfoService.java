package com.example.educare.StudentModule.Profile.service;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import com.example.educare.SharedModule.models.Institutional.Batch;
import com.example.educare.SharedModule.repository.Institutional.BatchRepository;
import com.example.educare.SharedModule.service.Geography.AddressService;
import com.example.educare.SharedModule.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.SharedModule.models.Student.StudentPersonalInfo;
import com.example.educare.StudentModule.Profile.repository.StudentPersonalInfoRepository;

@Service
public class StudentPersonalInfoService {

	@Autowired
	private StudentPersonalInfoRepository _studentRepository;
	
	@Autowired
	private AgeConverterService _ageConverterService;

	@Autowired
	private AddressService _addressService;

	@Autowired
	private AddressUtils _utils;

	@Autowired
	private BatchUtils _batchUtils;

	@Autowired
	private StudentUtils _studentUtils;

	//CRUD Service
	public StudentPersonalInfo createStudent(StudentPersonalInfo studentPersonalInfo) {
		if(studentPersonalInfo.getBatch() != null){
			studentPersonalInfo.setBatch(
					_batchUtils.batchFind(
							studentPersonalInfo.getBatch()));
		}
		studentPersonalInfo.setAge(_ageConverterService.age(studentPersonalInfo.getDateOfBirth()));
		studentPersonalInfo.setCreatedOn(Instant.now());

		if(studentPersonalInfo.getPermanentAddress() != null){
			_utils.addressPreprocess(studentPersonalInfo.getPermanentAddress());
		}

		if(studentPersonalInfo.getPresentAddress() != null){
			_utils.addressPreprocess(studentPersonalInfo.getPresentAddress());
		}

		_studentRepository.save(studentPersonalInfo);
		_studentUtils.clearCircle(studentPersonalInfo);

		return studentPersonalInfo;
	}

	public List<StudentPersonalInfo> createStudents(List<StudentPersonalInfo> studentPersonalInfoList) {
		for (StudentPersonalInfo studentPersonalInfo: studentPersonalInfoList){
			if(studentPersonalInfo.getBatch() != null){
				studentPersonalInfo.setBatch(
						_batchUtils.batchFind(
								studentPersonalInfo.getBatch()));
			}
			studentPersonalInfo.setAge(_ageConverterService.age(studentPersonalInfo.getDateOfBirth()));
			studentPersonalInfo.setCreatedOn(Instant.now());

			if(studentPersonalInfo.getPermanentAddress() != null){
				_utils.addressPreprocess(studentPersonalInfo.getPermanentAddress());
			}

			if(studentPersonalInfo.getPresentAddress() != null){
				_utils.addressPreprocess(studentPersonalInfo.getPresentAddress());
			}
		}
		_studentRepository.saveAll(studentPersonalInfoList);
		for (StudentPersonalInfo studentPersonalInfo: studentPersonalInfoList){
			_studentUtils.clearCircle(studentPersonalInfo);
		}
		return studentPersonalInfoList;
	}

	public List<StudentPersonalInfo> getStudents() {
		List<StudentPersonalInfo> studentPersonalInfos = _studentRepository.findAll();

		for (StudentPersonalInfo studentPersonalInfo: studentPersonalInfos){
			_studentUtils.clearCircle(studentPersonalInfo);
		}

		return studentPersonalInfos;
	}

	public StudentPersonalInfo getStudentById(Long id) {
		StudentPersonalInfo studentPersonalInfo = _studentRepository.findById(id).orElse(null);

		assert studentPersonalInfo != null;
		_studentUtils.clearCircle(studentPersonalInfo);

		return studentPersonalInfo;
	}

	public String deleteStudentById(Long id) {
		StudentPersonalInfo studentPersonalInfo = _studentRepository.findById(id).orElse(null);

		assert studentPersonalInfo != null;
		_studentUtils.deletePreprocess(studentPersonalInfo);

		_studentRepository.deleteById(id);
		return "Student removed "+ id + "!!";
	}

	public String deleteStudents() {
		List<StudentPersonalInfo> studentPersonalInfos = _studentRepository.findAll();
		_studentUtils.deletePreprocessList(studentPersonalInfos);

		_studentRepository.deleteAll();
		return "Successfully delete all entities!!!";
	}

	public StudentPersonalInfo updateStudent(StudentPersonalInfo studentPersonalInfo) {
		
		StudentPersonalInfo existingStudentPersonalInfo = _studentRepository.findById(studentPersonalInfo.getId()).orElse(null);

		assert existingStudentPersonalInfo != null;
		existingStudentPersonalInfo.setFullName(studentPersonalInfo.getFullName());
		existingStudentPersonalInfo.setStudentId(studentPersonalInfo.getStudentId());
		existingStudentPersonalInfo.setCurrentStatus(studentPersonalInfo.getCurrentStatus());
		existingStudentPersonalInfo.setCellphone(studentPersonalInfo.getCellphone());
		existingStudentPersonalInfo.setEmail(studentPersonalInfo.getEmail());
		existingStudentPersonalInfo.setNid(studentPersonalInfo.getNid());
		existingStudentPersonalInfo.setBirthRegNO(studentPersonalInfo.getBirthRegNO());
		existingStudentPersonalInfo.setDateOfBirth(studentPersonalInfo.getDateOfBirth());
		existingStudentPersonalInfo.setAge(_ageConverterService.age(studentPersonalInfo.getDateOfBirth()));
		existingStudentPersonalInfo.setGender(studentPersonalInfo.getGender());
		existingStudentPersonalInfo.setNationality(studentPersonalInfo.getNationality());
		existingStudentPersonalInfo.setBloodGroup(studentPersonalInfo.getBloodGroup());
		existingStudentPersonalInfo.setMaritialStatus(studentPersonalInfo.getMaritialStatus());

		if(studentPersonalInfo.getPermanentAddress() != null){
			_utils.updateAddress(
					existingStudentPersonalInfo.getPermanentAddress(),
					studentPersonalInfo.getPermanentAddress()
			);
		}

		if(studentPersonalInfo.getPresentAddress() != null){
			_utils.updateAddress(
					existingStudentPersonalInfo.getPresentAddress(),
					studentPersonalInfo.getPresentAddress()
			);
		}

		existingStudentPersonalInfo.setFatherName(studentPersonalInfo.getFatherName());
		existingStudentPersonalInfo.setMotherName(studentPersonalInfo.getMotherName());
		existingStudentPersonalInfo.setGurdianName(studentPersonalInfo.getGurdianName());
		existingStudentPersonalInfo.setParentMobibleNo(studentPersonalInfo.getParentMobibleNo());

		if(studentPersonalInfo.getBatch() != null){
			studentPersonalInfo.setBatch(
					_batchUtils.batchFind(
							studentPersonalInfo.getBatch()));
			existingStudentPersonalInfo.setBatch(studentPersonalInfo.getBatch());
		}
		existingStudentPersonalInfo.setPhoto(studentPersonalInfo.getPhoto());
		existingStudentPersonalInfo.setModifiedOn(Instant.now());
		existingStudentPersonalInfo.setModifiedBy(studentPersonalInfo.getModifiedBy());
		
		_studentRepository.save(existingStudentPersonalInfo);
		_studentUtils.clearCircle(existingStudentPersonalInfo);

		return existingStudentPersonalInfo;
	}
}