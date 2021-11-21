package com.example.educare.SharedModule.controller.Geography;

import java.util.List;

import com.example.educare.SharedModule.service.Geography.DistrictService;
import com.example.educare.SharedModule.service.Geography.UpazilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.educare.SharedModule.models.Geography.Division;
import com.example.educare.SharedModule.service.Geography.DivisionService;

@CrossOrigin
@RestController
@RequestMapping("/api/masterdata/geography/division")
public class DivisionController {

	@Autowired
	private DivisionService _divisionService;

	@PostMapping("/add")
	public @ResponseBody ResponseEntity<Division> saveDivision(@RequestBody Division division) {
		if(division == null){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}

		return new ResponseEntity<>(
				_divisionService.createDivision(division),
				HttpStatus.OK
		);
	}

	@PostMapping("/add-all")
	public @ResponseBody ResponseEntity<List<Division>> saveDivisionList(@RequestBody List<Division> divisionList) {
		if(divisionList == null){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}

		return new ResponseEntity<List<Division>>(
				_divisionService.createDivisions(divisionList),
				HttpStatus.OK
		);
	}

	@GetMapping("/get-all")
	public @ResponseBody ResponseEntity<List<Division>> getAllDivisions() {

		List<Division> divisions = _divisionService.getDivisions();
		if(divisions != null){
			return new ResponseEntity<>(
					divisions,
					HttpStatus.OK);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<Division> findDivisionById(@PathVariable Long id) {

		Division division = _divisionService.getDivisionById(id);
		if(division != null){
			return new ResponseEntity<Division>(
					division,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody ResponseEntity<String> deleteDivisionById(@PathVariable Long id) {
		return new ResponseEntity<String>(
				_divisionService.deleteDivisionById(id),
				HttpStatus.OK
		);
	}

	@PutMapping("/update")
	public @ResponseBody ResponseEntity<Division> updateDivision(@RequestBody Division division) {
		if(division == null){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}

		return new ResponseEntity<Division>(
				_divisionService.updateDivision(division),
				HttpStatus.OK
		);
	}

	@DeleteMapping("/delete-all")
	public @ResponseBody ResponseEntity<String> deleteAll() {
		return new ResponseEntity<String>(
				_divisionService.deleteDivisions(),
				HttpStatus.OK
		);
	}
}
