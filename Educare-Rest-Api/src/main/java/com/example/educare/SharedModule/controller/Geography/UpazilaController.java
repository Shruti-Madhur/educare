package com.example.educare.SharedModule.controller.Geography;

import java.util.List;

import com.example.educare.SharedModule.models.Geography.District;
import com.example.educare.SharedModule.models.Geography.Division;
import com.example.educare.SharedModule.service.Geography.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.educare.SharedModule.models.Geography.Upazila;
import com.example.educare.SharedModule.service.Geography.UpazilaService;

@CrossOrigin
@RestController
@RequestMapping("/api/masterdata/geography/upazila")
public class UpazilaController {
	
	@Autowired
	private UpazilaService _upazilaService;

	@PostMapping("/add")
	public @ResponseBody ResponseEntity<Upazila> saveUpazila(@RequestBody Upazila upazila) {
		if(upazila == null){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
		return new ResponseEntity<>(
				_upazilaService.createUpazila(upazila),
				HttpStatus.OK
		);
	}

	@PostMapping("/add-all")
	public @ResponseBody ResponseEntity<List<Upazila>> saveUpazilaList(@RequestBody List<Upazila> upazilaList) {

		if(upazilaList == null){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}
		return new ResponseEntity<>(
				_upazilaService.createUpazilas(upazilaList),
				HttpStatus.OK
		);
	}

	@GetMapping("/get-all")
	public @ResponseBody ResponseEntity<List<Upazila>> getAllUpazilas() {

		List<Upazila> upazilas = _upazilaService.getUpazilas();
		if(upazilas != null){
			return new ResponseEntity<>(
					upazilas,
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<Upazila> findUpazilaById(@PathVariable Long id) {

		Upazila upazila = _upazilaService.getUpazilaById(id);
		if(upazila != null){
			return new ResponseEntity<>(
					upazila,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody ResponseEntity<String> deleteUpazilaById(@PathVariable Long id) {
		return new ResponseEntity<>(
				_upazilaService.deleteUpazilaById(id),
				HttpStatus.OK
		);
	}

	@PutMapping("/update")
	public @ResponseBody ResponseEntity<Upazila> updateUpazila(@RequestBody Upazila upazila) {

		if(upazila != null){
			return new ResponseEntity<>(
					_upazilaService.updateUpazila(upazila),
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/delete-all")
	public @ResponseBody ResponseEntity<String> deleteAll() {
		return new ResponseEntity<>(
				_upazilaService.deleteUpazilas(),
				HttpStatus.OK
		);
	}
}
