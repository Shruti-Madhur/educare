package com.example.educare.SharedModule.service.Geography;

import java.util.List;

import com.example.educare.SharedModule.models.Geography.District;
import com.example.educare.SharedModule.repository.Geography.DistrictRepository;
import com.example.educare.SharedModule.utils.GeographicUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.SharedModule.models.Geography.Upazila;
import com.example.educare.SharedModule.repository.Geography.UpazilaRepository;

@Service
public class UpazilaService {

	@Autowired
	private UpazilaRepository _upazilaRepository;

	@Autowired
	private GeographicUtils _geographicUtils;

	//CRUD Service
	public Upazila createUpazila(Upazila upazila) {
		upazila.setDistrict(_geographicUtils.districtFind(upazila.getDistrict()));
		upazila.setGeocode(upazila.getId().toString());
		_upazilaRepository.save(upazila);
		upazila.setDistrict(null);

		return upazila;
	}

	public List<Upazila> createUpazilas(List<Upazila> upazilaList) {
		for(Upazila upazila: upazilaList){
			upazila.setDistrict(_geographicUtils.districtFind(upazila.getDistrict()));
			upazila.setGeocode(upazila.getId().toString());
		}
		_upazilaRepository.saveAll(upazilaList);
		_geographicUtils.clearCircleOnUpazilas(upazilaList);
		return upazilaList;
	}

	public List<Upazila> getUpazilas() {
		List<Upazila> upazilas = _upazilaRepository.findAll();
		_geographicUtils.clearCircleOnUpazilas(upazilas);
		return upazilas;
	}

	public Upazila getUpazilaById(Long id) {
		Upazila upazila = _upazilaRepository.findById(id).orElse(null);

		assert upazila != null;
		upazila.setDistrict(null);

		return upazila;
	}
	
	public String deleteUpazilaById(Long id) {
		Upazila upazila = _upazilaRepository.findById(id).orElse(null);

		assert upazila != null;
		upazila.setDistrict(null);

		_upazilaRepository.deleteById(id);
		return "Upazila removed " + id + "!!";
	}

	public String deleteUpazilas() {
		List<Upazila> upazilas = _upazilaRepository.findAll();

		for(Upazila upazila: upazilas){
			upazila.setDistrict(null);
		}

		_upazilaRepository.deleteAll();
		return "Successfully delete all entities!!!";
	}

	public Upazila updateUpazila(Upazila upazila) {

		Upazila existingUpazila = _upazilaRepository.findById(upazila.getId()).orElse(null);

		assert existingUpazila != null;
		existingUpazila.setName(upazila.getName());

		_upazilaRepository.save(existingUpazila);
		existingUpazila.setDistrict(null);

		return existingUpazila;
	}
}
