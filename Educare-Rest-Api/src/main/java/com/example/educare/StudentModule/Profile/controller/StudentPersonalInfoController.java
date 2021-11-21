package com.example.educare.StudentModule.Profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.educare.SharedModule.models.Student.StudentPersonalInfo;
import com.example.educare.StudentModule.Profile.service.StudentPersonalInfoService;

@CrossOrigin
@RestController
@RequestMapping("/api/student/profile")
public class StudentPersonalInfoController {

	@Autowired
	private StudentPersonalInfoService _studentService;

	@PostMapping("/add")
	public @ResponseBody ResponseEntity<StudentPersonalInfo> saveStudent(
			@RequestBody StudentPersonalInfo studentPersonalInfo) {

		if(studentPersonalInfo != null){
			return new ResponseEntity<>(
					_studentService.createStudent(studentPersonalInfo),
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@PostMapping("/add-all")
	public @ResponseBody ResponseEntity<List<StudentPersonalInfo>> saveStudentList(
			@RequestBody List<StudentPersonalInfo> studentPersonalInfoList) {

		if(studentPersonalInfoList != null){
			return new ResponseEntity<>(
					_studentService.createStudents(studentPersonalInfoList),
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@GetMapping("/get-all")
	public @ResponseBody ResponseEntity<List<StudentPersonalInfo>> getAllStudents() {
		List<StudentPersonalInfo> studentPersonalInfos = _studentService.getStudents();

		if(studentPersonalInfos != null){
			return new ResponseEntity<>(
					studentPersonalInfos,
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<StudentPersonalInfo> findStudentById(
			@PathVariable Long id) {

		StudentPersonalInfo studentPersonalInfo = _studentService.getStudentById(id);
		if(studentPersonalInfo != null){
			return new ResponseEntity<>(
					studentPersonalInfo,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody ResponseEntity<String> deleteStudentById(
			@PathVariable Long id) {

		return new ResponseEntity<>(
				_studentService.deleteStudentById(id),
				HttpStatus.OK
		);
	}

	@PutMapping("/update")
	public @ResponseBody ResponseEntity<StudentPersonalInfo> upateStudent(
			@RequestBody StudentPersonalInfo studentPersonalInfo) {

		if(studentPersonalInfo != null){
			return new ResponseEntity<>(
					_studentService.updateStudent(studentPersonalInfo),
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@DeleteMapping("/delete-all")
	public @ResponseBody ResponseEntity<String> deleteAll() {
		return new ResponseEntity<>(
				_studentService.deleteStudents(),
				HttpStatus.OK
		);
	}
}