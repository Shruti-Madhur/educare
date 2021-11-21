package com.example.educare.SharedModule.controller.Institutional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.educare.SharedModule.models.Institutional.Phase;
import com.example.educare.SharedModule.service.Institutional.PhaseService;

@CrossOrigin
@RestController
@RequestMapping("/api/masterdata/institutional/phase")
public class PhaseController {
	
	@Autowired
	private PhaseService _phaseService;

	@PostMapping("/add")
	public @ResponseBody ResponseEntity<Phase> savePhase(@RequestBody Phase phase) {
		try {
			return new ResponseEntity<>(
					_phaseService.createPhase(phase),
					HttpStatus.CREATED
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					HttpStatus.INTERNAL_SERVER_ERROR
			);
		}
	}

	@PostMapping("/add-all")
	public @ResponseBody ResponseEntity<List<Phase>> savePhaseList(@RequestBody List<Phase> phaseList) {
		if(phaseList != null){
			return new ResponseEntity<>(
					_phaseService.createPhases(phaseList),
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@GetMapping("/get-all")
	public @ResponseBody ResponseEntity<List<Phase>> getAllPhases() {
		List<Phase> phases = _phaseService.getPhases();
		if(phases != null){
			return new ResponseEntity<>(
					phases,
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@GetMapping("/get/{id}")
	public @ResponseBody ResponseEntity<Phase> findPhaseById(
			@PathVariable Long id) {
		Phase phase = _phaseService.getPhaseById(id);
		if(phase != null){
			return new ResponseEntity<>(
					phase,
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody ResponseEntity<String> deletePhaseById(@PathVariable Long id) {
		return new ResponseEntity<>(
				_phaseService.deletePhaseById(id),
				HttpStatus.OK
		);
	}

	@PutMapping("/update")
	public @ResponseBody ResponseEntity<Phase> upatePhase(@RequestBody Phase phase) {
		if(phase != null){
			return new ResponseEntity<>(
					_phaseService.updatePhase(phase),
					HttpStatus.OK
			);
		}
		return new ResponseEntity<>(
				HttpStatus.NOT_FOUND
		);
	}

	@DeleteMapping("/delete-all")
	public @ResponseBody ResponseEntity<String> deleteAll() {
		return new ResponseEntity<>(
				_phaseService.deletePhases(),
				HttpStatus.OK
		);
	}
}
