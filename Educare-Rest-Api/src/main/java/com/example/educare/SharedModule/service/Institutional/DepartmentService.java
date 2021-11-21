package com.example.educare.SharedModule.service.Institutional;

import java.sql.Date;
import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import com.example.educare.SharedModule.utils.FacultyUtils;
import com.example.educare.SharedModule.utils.InstitutionalUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.SharedModule.models.Institutional.Department;
import com.example.educare.SharedModule.repository.Institutional.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository _departmentRepository;

	@Autowired
	private InstitutionalUtils _institutionalUtils;

	@Autowired
	private FacultyUtils _facultyUtils;

	public Department createDepartment(Department department) {
		System.out.println(department);
		department.setCreatedOn(Instant.now());
		if(department.getHead() != null){
			department.setHead(_facultyUtils.facultyFind(department.getHead()));
		}
		return _departmentRepository.save(department);
	}

	public List<Department> createDepartments(List<Department> departmentList) {
		for (Department department: departmentList){
			if(department.getHead() != null){
				department.setHead(_facultyUtils.facultyFind(department.getHead()));
			}
			department.setCreatedOn(Instant.now());
		}
		return _departmentRepository.saveAll(departmentList);
	}

	public List<Department> getDepartments() {
		List<Department> departments = _departmentRepository.findAll();
		for (Department department: departments){
			_institutionalUtils.clearCircleOnDepartment(department);
		}

		return departments;
	}

	public Department getDepartmentById(Long id) {
		Department department = _departmentRepository.findById(id).orElse(null);
		assert department != null;
		_institutionalUtils.clearCircleOnDepartment(department);
		return department;
	}

	public String deleteDepartmentById(Long id) {
		Department department = _departmentRepository.findById(id).orElse(null);
		assert department != null;
		_institutionalUtils.clearCircleOnDepartment(department);
		department.setSubjects(null);

		_departmentRepository.deleteById(id);
		return "Department removed " + id + "!!";
	}

	public String deleteDepartments() {
		List<Department> departments = _departmentRepository.findAll();
		for (Department department: departments){
			_institutionalUtils.clearCircleOnDepartment(department);
			department.setSubjects(null);
		}

		_departmentRepository.deleteAll();
		return "Successfully delete all entities!!!";
	}

	public Department updateDepartment(Department department) {
		
		Department existingDepartment = _departmentRepository.findById(department.getId()).orElse(null);

		assert existingDepartment != null;
		existingDepartment.setName(department.getName());
		existingDepartment.setCode(department.getCode());
		if(department.getHead() != null){
			existingDepartment.setHead(
					_facultyUtils.facultyFind(
							department.getHead()));
		}
		existingDepartment.setModifiedOn(Instant.now());
		existingDepartment.setModifiedBy(department.getModifiedBy());

		_departmentRepository.save(existingDepartment);
		_institutionalUtils.clearCircleOnDepartment(existingDepartment);

		return existingDepartment;
	}
}
