package com.example.educare.SharedModule.utils;

import com.example.educare.SharedModule.models.Geography.Address;
import com.example.educare.SharedModule.models.Geography.District;
import com.example.educare.SharedModule.models.Geography.Division;
import com.example.educare.SharedModule.models.Geography.Upazila;
import com.example.educare.SharedModule.repository.Geography.DistrictRepository;
import com.example.educare.SharedModule.repository.Geography.DivisionRepository;
import com.example.educare.SharedModule.repository.Geography.UpazilaRepository;
import com.example.educare.SharedModule.service.Geography.UpazilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeographicUtils {

    @Autowired
    private DivisionRepository _divisionRepository;

    @Autowired
    private DistrictRepository _districtRepository;

    @Autowired
    private UpazilaRepository _upazilaRepository;


    //Division find and creation
    public Division divisionFind(Division division){
       return _divisionRepository.findById(division.getId()).orElse(null);
    }

    //District find and creation
    public District districtFind(District district){
        return _districtRepository.findById(district.getId()).orElse(null);
    }

    //Upazila find and creation
    public Upazila upazilaFind(Upazila upazila){
        return _upazilaRepository.findById(upazila.getId()).orElse(null);
    }

    // Circular Dependency Clear
    public void clearCircleOnUpazilas(List<Upazila> upazilas) {
        for (Upazila upazila: upazilas){
            upazila.setDistrict(null);
        }
    }

    //Clear Circular Dependency
    public void clearCircleOnDivision(District district){
        district.setDivision(null);
    }
}
