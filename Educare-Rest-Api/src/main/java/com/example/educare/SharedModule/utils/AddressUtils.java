package com.example.educare.SharedModule.utils;

import com.example.educare.SharedModule.models.Geography.Address;
import com.example.educare.SharedModule.models.Geography.District;
import com.example.educare.SharedModule.models.Geography.Division;
import com.example.educare.SharedModule.models.Geography.Upazila;
import com.example.educare.SharedModule.repository.Geography.DistrictRepository;
import com.example.educare.SharedModule.repository.Geography.DivisionRepository;
import com.example.educare.SharedModule.repository.Geography.UpazilaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;


@Service
public class AddressUtils {

    @Autowired
    private GeographicUtils _geographicUtils;

    // Circular Dependency Clear
    public void clearCircleOnAddress(Address address) {
        address.getDivision().setDistricts(null);

        address.getDistrict().setDivision(null);
        address.getDistrict().setUpazilas(null);

        address.getUpazila().setDistrict(null);
    }

    public void findAndSet(Address address){
        address.setDivision(_geographicUtils.divisionFind(address.getDivision()));
        address.setDistrict(_geographicUtils.districtFind(address.getDistrict()));
        address.setUpazila(_geographicUtils.upazilaFind(address.getUpazila()));
    }

    public void updateAddress(Address ex, Address pr){
        ex.setStreet(pr.getStreet());
        ex.setPostOffice(pr.getPostOffice());
        ex.setPostalCode(pr.getPostalCode());
        ex.setDivision(_geographicUtils.divisionFind(pr.getDivision()));
        ex.setDistrict(_geographicUtils.districtFind(pr.getDistrict()));
        ex.setUpazila(_geographicUtils.upazilaFind(pr.getUpazila()));

        ex.setModifiedOn(Instant.now());
    }

    public void addressPreprocess(Address address){
        findAndSet(address);
        address.setCreatedOn(Instant.now());
    }
}
