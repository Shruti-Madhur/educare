package com.example.educare.SharedModule.service.Geography;

import java.util.List;


import com.example.educare.SharedModule.models.Geography.Division;
import com.example.educare.SharedModule.models.Geography.Upazila;
import com.example.educare.SharedModule.repository.Geography.DivisionRepository;
import com.example.educare.SharedModule.repository.Geography.UpazilaRepository;
import com.example.educare.SharedModule.utils.GeographicUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.SharedModule.models.Geography.District;
import com.example.educare.SharedModule.repository.Geography.DistrictRepository;

@Service
public class DistrictService {
	
	@Autowired
	private DistrictRepository _districtRepository;

	@Autowired
	private GeographicUtils _geographicUtils;

	//CRUD Service
	public District createDistrict(District district) {
		district.setDivision(_geographicUtils.divisionFind(district.getDivision()));
		district.setGeocode(district.getId().toString());
		_districtRepository.save(district);
		_geographicUtils.clearCircleOnDivision(district);

		return district;
	}

	public List<District> createDistricts(List<District> districtList) {
		for(District district: districtList){
			district.setDivision(_geographicUtils.divisionFind(district.getDivision()));
			district.setGeocode(district.getId().toString());
		}
		_districtRepository.saveAll(districtList);
		for(District district: districtList){
			_geographicUtils.clearCircleOnDivision(district);

		}
		return districtList;
	}

	public List<District> getDistricts() {
		List<District> districts = _districtRepository.findAll();

		//Clear Circulation
		for (District district: districts){
			_geographicUtils.clearCircleOnUpazilas(district.getUpazilas());
			_geographicUtils.clearCircleOnDivision(district);
		}

		return districts;
	}

	public District getDistrictById(Long id) {
		District district = _districtRepository.findById(id).orElse(null);

		assert district != null;
		_geographicUtils.clearCircleOnUpazilas(district.getUpazilas());
		_geographicUtils.clearCircleOnDivision(district);

		return district;
	}

	public String deleteDistrictById(Long id) {
		District district = _districtRepository.findById(id).orElse(null);

		assert district != null;
		district.setDivision(null);

		_districtRepository.deleteById(id);
		return "District removed " + id + "!!";
	}

	public String deleteDistricts() {
		List<District> districts = _districtRepository.findAll();

		for(District district: districts){
			district.setDivision(null);
		}

		_districtRepository.deleteAll();
		return "Successfully delete all entities!!!";
	}


	///Here not edited
	public District updateDistrict(District district) {
		
		District existingDistrict = _districtRepository.findById(district.getId()).orElse(null);

		assert existingDistrict != null;
		existingDistrict.setName(district.getName());

		_districtRepository.save(existingDistrict);
		_geographicUtils.clearCircleOnUpazilas(existingDistrict.getUpazilas());
		_geographicUtils.clearCircleOnDivision(existingDistrict);

		return existingDistrict;
	}
}
