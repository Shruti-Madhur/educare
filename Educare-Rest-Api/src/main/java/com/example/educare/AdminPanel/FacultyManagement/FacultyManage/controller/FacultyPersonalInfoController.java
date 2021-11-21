package com.example.educare.AdminPanel.FacultyManagement.FacultyManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.educare.AdminPanel.FacultyManagement.FacultyManage.service.FacultyPersonalInfoService;
import com.example.educare.SharedModule.models.Faculty.FacultyPersonalInfo;

@CrossOrigin
@RestController
@RequestMapping("/api/manage/faculty/profile")
public class FacultyPersonalInfoController {
	
	@Autowired
	private FacultyPersonalInfoService _facultyService;

	@PostMapping("/add")
	public @ResponseBody ResponseEntity<FacultyPersonalInfo> saveFaculty(@RequestBody FacultyPersonalInfo faculty) {
		FacultyPersonalInfo facultyPersonalInfo = _facultyService.createFaculty(faculty);
		if(facultyPersonalInfo != null){
			return new ResponseEntity<>(
					facultyPersonalInfo,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@GetMapping("/get-all")
	public @ResponseBody ResponseEntity<List<FacultyPersonalInfo>> getAllFacultys() {
		List<FacultyPersonalInfo> facultyPersonalInfos = _facultyService.getFacultys();

		if(facultyPersonalInfos != null){
			return new ResponseEntity<>(
					facultyPersonalInfos,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<FacultyPersonalInfo> findFacultyById(@PathVariable Long id) {
		FacultyPersonalInfo facultyPersonalInfo = _facultyService.getFacultyById(id);
		if(facultyPersonalInfo != null){
			return new ResponseEntity<>(
					facultyPersonalInfo,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteFacultyById(@PathVariable Long id) {
		return _facultyService.deleteFacultyById(id);
	}

	@PutMapping("/update")
	public @ResponseBody ResponseEntity<FacultyPersonalInfo> updateFaculty(@RequestBody FacultyPersonalInfo faculty) {
		FacultyPersonalInfo facultyPersonalInfo = _facultyService.updateFaculty(faculty);
		if(facultyPersonalInfo != null){
			return new ResponseEntity<>(
					facultyPersonalInfo,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}
}
