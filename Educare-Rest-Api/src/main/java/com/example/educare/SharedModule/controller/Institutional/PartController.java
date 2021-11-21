package com.example.educare.SharedModule.controller.Institutional;

import com.example.educare.SharedModule.models.Institutional.Part;
import com.example.educare.SharedModule.models.Institutional.Subject;
import com.example.educare.SharedModule.service.Institutional.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/masterdata/institutional/part")
public class PartController {
    @Autowired
    private PartService _partService;

    @PostMapping("/add")
    public @ResponseBody
    ResponseEntity<Part> savePart(@RequestBody Part Part) {
        return new ResponseEntity<>(
                _partService.createPart(Part),
                HttpStatus.OK
        );
    }

    @PostMapping("/add-all")
    public @ResponseBody ResponseEntity<List<Part>> savePartList(@RequestBody List<Part> partList) {
        try {
            return new ResponseEntity<>(
                    _partService.createParts(partList),
                    HttpStatus.OK
            );
        }catch (Exception e){
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND
            );
        }
    }

    @GetMapping("/get-all")
    public @ResponseBody ResponseEntity<List<Part>> getAllParts() {
        return new ResponseEntity<>(
                _partService.getParts(),
                HttpStatus.OK
        );
    }

    @GetMapping("/get/{id}")
    public @ResponseBody ResponseEntity<Part> findPartById(@PathVariable Long id) {
        return new ResponseEntity<>(
                _partService.getPartById(id),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity<String> deletePartById(@PathVariable Long id) {
        return new ResponseEntity<>(
                _partService.deletePartById(id),
                HttpStatus.OK
        );
    }

    @PutMapping("/update")
    public @ResponseBody ResponseEntity<Part> updatePart(@RequestBody Part part) {
        return new ResponseEntity<>(
                _partService.updatePart(part),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/delete-all")
    public @ResponseBody ResponseEntity<String> deleteAll() {
        try {
            return new ResponseEntity<>(
                    _partService.deleteParts(),
                    HttpStatus.OK
            );
        }catch (Exception e){
            return new ResponseEntity<>(
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
}

