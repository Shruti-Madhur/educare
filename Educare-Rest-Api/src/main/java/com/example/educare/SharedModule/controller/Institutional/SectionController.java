package com.example.educare.SharedModule.controller.Institutional;

import com.example.educare.SharedModule.models.Institutional.Phase;
import com.example.educare.SharedModule.models.Institutional.Section;
import com.example.educare.SharedModule.service.Institutional.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/Section")
public class SectionController {

    @Autowired
    private SectionService _sectionService;

    @PostMapping("/add")
    public ResponseEntity<Section> createInstitution(@RequestBody Section sec) {
        try {
            return new ResponseEntity<>(_sectionService.createSectionService(sec), HttpStatus.CREATED) ;
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/add/list")
    public ResponseEntity<List<Section>> createSectionList(@RequestBody List<Section> sectionList) {
        try{
            return new ResponseEntity<>(_sectionService.CreateSectionListService(sectionList), HttpStatus.CREATED);
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Section>> getAllSection() {
        try {
            if (_sectionService.getAllSectionService().isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(_sectionService.getAllSectionService(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get/{sectionId}")
    public ResponseEntity<Section> getInstitutionById(@PathVariable Long sectionId) {
        try {
            return new ResponseEntity<>(_sectionService.getSectionByIdService(sectionId), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("/update/{sectionId}")
    public ResponseEntity<Section> updateInstitution(@PathVariable("sectionId") Long sectionId, @RequestBody Section sec) {

        try {
            return new ResponseEntity<>(_sectionService.updateSectionService(sectionId, sec), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/delete/{sectionId}")
    public ResponseEntity<HttpStatus> deleteInstitution(@PathVariable Long sectionId) {
        try {
            _sectionService.deleteSecByIdService(sectionId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/all")
    public ResponseEntity<HttpStatus> deleteAllInstitution() {
        try {
            _sectionService.deleteAllSecService();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
