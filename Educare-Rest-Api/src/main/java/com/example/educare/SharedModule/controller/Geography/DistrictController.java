package com.example.educare.SharedModule.controller.Geography;

import java.util.List;
import java.util.Set;

import com.example.educare.SharedModule.models.Geography.Division;
import com.example.educare.SharedModule.service.Geography.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.educare.SharedModule.models.Geography.District;
import com.example.educare.SharedModule.service.Geography.DistrictService;


@CrossOrigin
@RestController
@RequestMapping("/api/masterdata/geography/district")
public class DistrictController {
	
	@Autowired
	private DistrictService _districtService;

	@PostMapping("/add")
	public @ResponseBody ResponseEntity<District> saveDistrict(@RequestBody District district) {
		if(district != null) {
			return new ResponseEntity<>(
					_districtService.createDistrict(district),
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@PostMapping("/add-all")
	public @ResponseBody ResponseEntity<List<District>> saveDistrictList(@RequestBody List<District> districtList) {

		if(districtList == null){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}

		return new ResponseEntity<>(
				_districtService.createDistricts(districtList),
				HttpStatus.OK
		);
	}

	@GetMapping("/get-all")
	public @ResponseBody ResponseEntity<List<District>> getAllDistricts() {

		List<District> districts = _districtService.getDistricts();
		if(districts != null){
			return new ResponseEntity<>(
					districts,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<District> findDistrictById(@PathVariable Long id) {
		District district = _districtService.getDistrictById(id);
		if(district != null){
			return new ResponseEntity<>(
					district,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody ResponseEntity<String> deleteDistrictById(@PathVariable Long id) {
		return new ResponseEntity<String>(
				_districtService.deleteDistrictById(id),
				HttpStatus.OK
		);
	}

	@PutMapping("/update")
	public @ResponseBody ResponseEntity<District> updateDistrict(@RequestBody District district) {

		if(district != null){
			return new ResponseEntity<District>(
					_districtService.updateDistrict(district),
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@DeleteMapping("/delete-all")
	public @ResponseBody ResponseEntity<String> deleteAll() {
		return new ResponseEntity<String>(
				_districtService.deleteDistricts(),
				HttpStatus.OK
		);
	}
}
