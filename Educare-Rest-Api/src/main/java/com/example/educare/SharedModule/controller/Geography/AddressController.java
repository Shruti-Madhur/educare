package com.example.educare.SharedModule.controller.Geography;

import java.sql.Date;
import java.util.List;
import java.util.Locale;

import com.example.educare.SharedModule.models.Geography.District;
import com.example.educare.SharedModule.models.Geography.Division;
import com.example.educare.SharedModule.models.Geography.Upazila;
import com.example.educare.SharedModule.service.Geography.DistrictService;
import com.example.educare.SharedModule.service.Geography.DivisionService;
import com.example.educare.SharedModule.service.Geography.UpazilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.educare.SharedModule.models.Geography.Address;
import com.example.educare.SharedModule.service.Geography.AddressService;

@CrossOrigin
@RestController
@RequestMapping("/api/masterdata/geography/address")
public class AddressController {

	@Autowired
	private AddressService _addressService;

	@PostMapping("/add")
	public @ResponseBody ResponseEntity<Address> saveAddress(@RequestBody Address address) {

		Address addressResp = _addressService.createAddress(address);
		if(addressResp != null){
			return new ResponseEntity<>(
					addressResp,
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@GetMapping("/get-all")
	public @ResponseBody ResponseEntity<List<Address>> getAllAddresss() {

		List<Address> addresses = _addressService.getAddresss();
		if(addresses != null){
			return new ResponseEntity<>(
					addresses,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);

	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<Address> findAddressById(@PathVariable Long id) {

		Address address = _addressService.getAddressById(id);
		if(address != null){
			return new ResponseEntity<>(
					address,
					HttpStatus.OK
			);
		}

		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}
	
	@DeleteMapping("/delete/{id}")
	public @ResponseBody ResponseEntity<String> deleteAddressById(@PathVariable Long id) {

		return new ResponseEntity<>(
				_addressService.deleteAddressById(id),
				HttpStatus.OK
		);
	}

	@PutMapping("/update")
	public @ResponseBody ResponseEntity<Address> updateAddress(@RequestBody Address address) {
		if(address == null){
			return new ResponseEntity<>(
					HttpStatus.NOT_FOUND
			);
		}

		return new ResponseEntity<>(
				_addressService.updateAddress(address),
				HttpStatus.OK
		);
	}
}
