package com.example.educare.SharedModule.controller.Institutional;

import com.example.educare.SharedModule.models.Institutional.Batch;
import com.example.educare.SharedModule.models.Institutional.Institution;
import com.example.educare.SharedModule.service.Institutional.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/api/masterdata/institution")
public class InstitutionController {

    @Autowired
    private InstitutionService _instService;


    @PostMapping("/add")
    public ResponseEntity<Institution> createInstitution(@RequestBody Institution inst) {
        try {
            return new ResponseEntity<>(_instService.createInstService(inst), HttpStatus.CREATED) ;
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Institution>> getAllInstitution() {
        try {
            if (_instService.getAllInstService().isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(_instService.getAllInstService(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get/{institutionId}")
    public ResponseEntity<Institution> getInstitutionById(@PathVariable Long institutionId) {
        try {
            return new ResponseEntity<>(_instService.getInstByIdService(institutionId), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Institution> updateInstitution(@PathVariable("id") Long id, @RequestBody Institution institution) {

        System.out.println(institution);
        System.out.println(_instService.updateInstService(id, institution));
        try {
            return new ResponseEntity<>(_instService.updateInstService(id,institution), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/delete/{institutionId}")
    public ResponseEntity<HttpStatus> deleteInstitution(@PathVariable Long institutionId) {
        try {
            _instService.deleteInstByIdService(institutionId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping("/delete/all")
    public ResponseEntity<HttpStatus> deleteAllInstitution() {
        try {
            _instService.deleteAllInstService();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
