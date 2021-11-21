package com.example.educare.SharedModule.service.Institutional;


import com.example.educare.SharedModule.models.Institutional.Batch;
import com.example.educare.SharedModule.models.Institutional.Institution;
import com.example.educare.SharedModule.repository.Institutional.InstitutionRepository;
import com.example.educare.SharedModule.service.Geography.AddressService;
import com.example.educare.SharedModule.utils.AddressUtils;
<<<<<<< HEAD
=======
import com.example.educare.SharedModule.utils.InstitutionalUtils;
>>>>>>> master
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class InstitutionService {

    @Autowired
    private InstitutionRepository _instRepository;
<<<<<<< HEAD
    @Autowired
    private AddressService _addressService;
    @Autowired
    private AddressUtils _addressUtils;
=======
>>>>>>> master

    @Autowired
    private AddressUtils _utils;

    @Autowired
    private InstitutionalUtils _institutionalUtils;

//    Create new Institution
    public Institution createInstService(Institution inst) {
<<<<<<< HEAD
        if(inst.getAddress() != null){
            inst.setAddress(_addressService.createAddress(inst.getAddress()));
        }
        return _instRepository.save(inst);

=======
        if(inst.getAddress() != null) {
            _utils.addressPreprocess(inst.getAddress());
        }
        _instRepository.save(inst);
        if(inst.getAddress() != null) {
            _utils.clearCircleOnAddress(inst.getAddress());
        }
        return inst;
>>>>>>> master
    }

//    Get all Institution Data
    public List<Institution> getAllInstService() {
        List<Institution> institutions = _instRepository.findAll();
        for (Institution institution: institutions){
            if(institution.getAddress() != null) {
                _utils.clearCircleOnAddress(institution.getAddress());
            }
        }
        return institutions;
    }

//    Get Institution Data by ID
    public Institution getInstByIdService(Long institutionId) {
        Institution institution = _instRepository.findById(institutionId).orElse(null);
        assert institution != null;
        if(institution.getAddress() != null) {
            _utils.clearCircleOnAddress(institution.getAddress());
        }
        return institution;
    }

//    Update Institution Data
    public  Institution updateInstService(Long id, Institution inst) {

       Optional<Institution> data = _instRepository.findById(id);
       Institution _institution = data.get();

        _institution.setName(inst.getName());
        _institution.setSlogan(inst.getSlogan());
<<<<<<< HEAD
        if (inst.getAddress() != null) {

            _institution.setAddress(_addressService.createAddress(inst.getAddress()));
        }
=======
        _utils.updateAddress(_institution.getAddress(), inst.getAddress());
>>>>>>> master
        _institution.setOfficeEmail(inst.getOfficeEmail());
        _institution.setOfficeCellPhone(inst.getOfficeCellPhone());
        _institution.setFax(inst.getFax());
        _institution.setWebsite(inst.getWebsite());

        _instRepository.save(_institution);

        if(inst.getAddress() != null) {
            _utils.clearCircleOnAddress(_institution.getAddress());
        }
        return _institution;
    }

//    Delete Institution Data by ID
    public void deleteInstByIdService(Long id) {
        Institution institution = _instRepository.findById(id).orElse(null);
<<<<<<< HEAD
        if(institution.getAddress() != null ) {
            _addressUtils.clearCircleOnAddress(institution.getAddress());
        }
        institution.setAddress(null);
=======
        assert institution != null;
        if(institution.getAddress() != null) {
            _institutionalUtils.deletePreprocessOnInst(institution);
        }
>>>>>>> master
        _instRepository.deleteById(id);
    }

//    Delete All Institution Data
    public void deleteAllInstService() {
<<<<<<< HEAD
        List<Institution> institutionList = _instRepository.findAll();
        for (Institution inst: institutionList) {
            _addressUtils.clearCircleOnAddress(inst.getAddress());
            inst.setAddress(null);
=======
        List<Institution> institutions = _instRepository.findAll();
        for (Institution institution: institutions){
            if(institution.getAddress() != null) {
                _institutionalUtils.deletePreprocessOnInst(institution);
            }
>>>>>>> master
        }
        _instRepository.deleteAll();
    }
}

