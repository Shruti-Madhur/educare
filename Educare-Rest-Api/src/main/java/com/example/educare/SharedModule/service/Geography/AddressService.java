package com.example.educare.SharedModule.service.Geography;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import com.example.educare.SharedModule.utils.AddressUtils;
import com.example.educare.SharedModule.utils.GeographicUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.SharedModule.models.Geography.Address;
import com.example.educare.SharedModule.repository.Geography.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository _addressRepository;

	@Autowired
	private AddressUtils _utils;

	//CRUD service
	public Address createAddress(Address address) {
		_utils.addressPreprocess(address);
		_addressRepository.save(address);
		_utils.clearCircleOnAddress(address);
		return address;
	}

	public List<Address> getAddresss() {
		List<Address> addresses = _addressRepository.findAll();
		for(Address address: addresses){
			_utils.clearCircleOnAddress(address);
		}
		return addresses;
	}

	public Address getAddressById(Long id) {
		Address address = _addressRepository.findById(id).orElse(null);
		assert address != null;
		_utils.clearCircleOnAddress(address);
		return address;
	}
	
	public String deleteAddressById(Long id) {
		Address address = _addressRepository.findById(id).orElse(null);

		assert address != null;
		address.setDivision(null);
		address.setDistrict(null);
		address.setUpazila(null);

		_addressRepository.deleteById(id);
		return "Address removed " + id + "!!";
	}

	public Address updateAddress(Address address) {
		
		Address existingAddress = _addressRepository.findById(address.getId()).orElse(null);

		assert existingAddress != null;
		_utils.updateAddress(existingAddress, address);
		_addressRepository.save(existingAddress);
		_utils.clearCircleOnAddress(existingAddress);

		return existingAddress;
	}
}
