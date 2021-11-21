package com.example.educare.SharedModule.controller.Institutional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.educare.SharedModule.models.Institutional.Department;
import com.example.educare.SharedModule.service.Institutional.DepartmentService;

@CrossOrigin
@RestController
@RequestMapping("/api/masterdata/institutional/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService _departmentService;

	@PostMapping("/add")
	public @ResponseBody ResponseEntity<Department> saveDepartment(
			@RequestBody Department department) {

		try {
			return new ResponseEntity<>(
					_departmentService.createDepartment(department),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}

	@PostMapping("/add-all")
	public @ResponseBody ResponseEntity<List<Department>> saveDepartmentList(
			@RequestBody List<Department> departmentList) {
		try {
			return new ResponseEntity<>(
					_departmentService.createDepartments(departmentList),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}

	@GetMapping("/get-all")
	public @ResponseBody ResponseEntity<List<Department>> getAllDepartments() {
		try {
			return new ResponseEntity<>(
					_departmentService.getDepartments(),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<Department> findDepartmentById(@PathVariable Long id) {
		try {
			return new ResponseEntity<>(
					_departmentService.getDepartmentById(id),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody ResponseEntity<String> deleteDepartmentById(@PathVariable Long id) {
		try {
			return new ResponseEntity<>(
					_departmentService.deleteDepartmentById(id),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}

	@PutMapping("/update")
	public @ResponseBody ResponseEntity<Department> upateDepartment(
			@RequestBody Department department) {

		try {
			return new ResponseEntity<>(
					_departmentService.updateDepartment(department),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}


	@DeleteMapping("/delete-all")
	public @ResponseBody ResponseEntity<String> deleteAll() {

		try {
			return new ResponseEntity<>(
					_departmentService.deleteDepartments(),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}
}
