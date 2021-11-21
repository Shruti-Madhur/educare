package com.example.educare.SharedModule.controller.Institutional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.educare.SharedModule.models.Institutional.Subject;
import com.example.educare.SharedModule.service.Institutional.SubjectService;

@CrossOrigin
@RestController
@RequestMapping("/api/masterdata/institutional/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService _subjectService;

	@PostMapping("/add")
	public @ResponseBody ResponseEntity<Subject> saveSubject(@RequestBody Subject subject) {
		try {
			return new ResponseEntity<>(
					_subjectService.createSubject(subject),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}

	@PostMapping("/add-all")
	public @ResponseBody ResponseEntity<List<Subject>> saveSubjectList(@RequestBody List<Subject> subjectList) {
		try {
			return new ResponseEntity<>(
					_subjectService.createSubjects(subjectList),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}

	@GetMapping("/get-all")
	public @ResponseBody ResponseEntity<List<Subject>> getAllSubjects() {
		try {
			return new ResponseEntity<>(
					_subjectService.getSubjects(),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<Subject> findSubjectById(@PathVariable Long id) {
		try {
			return new ResponseEntity<>(
					_subjectService.getSubjectById(id),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody ResponseEntity<String> deleteSubjectById(@PathVariable Long id) {
		try {
			return new ResponseEntity<>(
					_subjectService.deleteSubjectById(id),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}

	@PutMapping("/update")
	public @ResponseBody ResponseEntity<Subject> upateSubject(@RequestBody Subject subject) {
		try {
			return new ResponseEntity<>(
					_subjectService.updateSubject(subject),
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
					_subjectService.deleteSubjects(),
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
	}
}
