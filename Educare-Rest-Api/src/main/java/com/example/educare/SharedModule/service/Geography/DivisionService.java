package com.example.educare.SharedModule.service.Geography;

import java.util.List;

import com.example.educare.SharedModule.models.Geography.District;
import com.example.educare.SharedModule.repository.Geography.DistrictRepository;
import com.example.educare.SharedModule.utils.GeographicUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.SharedModule.models.Geography.Division;
import com.example.educare.SharedModule.repository.Geography.DivisionRepository;

@Service
public class DivisionService {
	
	@Autowired
	private DivisionRepository _divisionRepository;

	@Autowired
	private DistrictRepository _districtRepository;

	@Autowired
	private GeographicUtils _geographicUtils;

	// Circular Dependency Clear
	public void clearCircleOnDistricts(List<District> districts) {
		for (District district: districts){
			_geographicUtils.clearCircleOnUpazilas(district.getUpazilas());
			_geographicUtils.clearCircleOnDivision(district);
		}
	}

	//CRUD service
	public Division createDivision(Division division) {
		division.setGeocode(division.getId().toString());
		return _divisionRepository.save(division);
	}

	public List<Division> createDivisions(List<Division> divisionList) {
		for (Division division: divisionList){
			division.setGeocode(division.getId().toString());
		}
		return _divisionRepository.saveAll(divisionList);
	}

	public List<Division> getDivisions() {
		List<Division> divisions = _divisionRepository.findAll();

		//Clear Circulation
		for (Division division: divisions){
			clearCircleOnDistricts(division.getDistricts());
		}

		return divisions;
	}

	public Division getDivisionById(Long id) {
		Division division = _divisionRepository.findById(id).orElse(null);

		assert division != null;
		clearCircleOnDistricts(division.getDistricts());

		return division;
	}
	
	public String deleteDivisionById(Long id) {
		_divisionRepository.deleteById(id);
		return "Division removed " + id + "!!";
	}

	public String deleteDivisions() {
		_divisionRepository.deleteAll();
		return "Successfully delete all entities!!!";
	}

	public Division updateDivision(Division division) {
		
		Division existingDivision = _divisionRepository.findById(division.getId()).orElse(null);

		assert existingDivision != null;
		existingDivision.setName(division.getName());
		
		_divisionRepository.save(existingDivision);
		clearCircleOnDistricts(existingDivision.getDistricts());
		return existingDivision;
	}
}
