package com.example.educare.SharedModule.service.Institutional;

import com.example.educare.SharedModule.models.Institutional.Part;
import com.example.educare.SharedModule.repository.Institutional.PartRepository;
import com.example.educare.SharedModule.utils.InstitutionalUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class PartService {
    @Autowired
    private PartRepository _partRepository;

    @Autowired
    private InstitutionalUtils _institutionalUtils;

    public Part createPart(Part part) {
        part.setSubject(_institutionalUtils.subjectFind(part.getSubject()));
        part.setCreatedOn(Instant.now());

        _partRepository.save(part);
        _institutionalUtils.clearCircleOnPart(part);
        return part;
    }

    public List<Part> createParts(List<Part> partList) {
        for (Part part: partList){
            part.setSubject(_institutionalUtils.subjectFind(part.getSubject()));
            part.setCreatedOn(Instant.now());
        }
        _partRepository.saveAll(partList);
        for (Part part: partList){
            _institutionalUtils.clearCircleOnPart(part);
        }

        return partList;
    }

    public List<Part> getParts() {
        List<Part> parts = _partRepository.findAll();
        for (Part part: parts){
            _institutionalUtils.clearCircleOnPart(part);
        }
        return parts;
    }

    public Part getPartById(Long id) {
        Part part = _partRepository.findById(id).orElse(null);
        assert part != null;
        _institutionalUtils.clearCircleOnPart(part);
        return part;
    }

    public String deletePartById(Long id) {
        Part part = _partRepository.findById(id).orElse(null);
        assert part != null;
        part.setSubject(null);
        _partRepository.deleteById(id);
        return "Part removed " + id + "!!";
    }

    public String deleteParts() {
        List<Part> parts = _partRepository.findAll();
        for (Part part: parts){
            part.setSubject(null);
        }
        _partRepository.deleteAll();
        return "Successfully delete all entities!!!";
    }

    public Part updatePart(Part part) {

        Part existingPart = _partRepository.findById(part.getId()).orElse(null);

        assert existingPart != null;
        existingPart.setName(part.getName());
        existingPart.setSubject(_institutionalUtils.subjectFind(part.getSubject()));
        existingPart.setModifiedOn(Instant.now());
        existingPart.setModifiedBy(part.getModifiedBy());

        _partRepository.save(existingPart);
        _institutionalUtils.clearCircleOnPart(existingPart);

        return existingPart;
    }
}
