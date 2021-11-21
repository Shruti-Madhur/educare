package com.example.educare.SharedModule.service.Institutional;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;


import com.example.educare.SharedModule.utils.InstitutionalUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.SharedModule.models.Institutional.Phase;
import com.example.educare.SharedModule.repository.Institutional.PhaseRepository;

@Service
public class PhaseService {
	
	@Autowired
	private PhaseRepository _phaseRepository;

	@Autowired
	private InstitutionalUtils _institutionalUtils;

	public Phase createPhase(Phase phase) {
		phase.setCreatedOn(Instant.now());
		return _phaseRepository.save(phase);
	}

	public List<Phase> createPhases(List<Phase> phaseList) {
		for(Phase phase: phaseList){
			phase.setCreatedOn(Instant.now());
		}
		return _phaseRepository.saveAll(phaseList);
	}

	public List<Phase> getPhases() {
		List<Phase> phases = _phaseRepository.findAll();
		for (Phase phase: phases){
			_institutionalUtils.clearCircleOnPhase(phase);
		}

		return phases;
	}

	public Phase getPhaseById(Long id) {
		Phase phase = _phaseRepository.findById(id).orElse(null);
		_institutionalUtils.clearCircleOnPhase(phase);

		return phase;
	}

	public String deletePhaseById(Long id) {
		Phase phase = _phaseRepository.findById(id).orElse(null);
		_institutionalUtils.clearCircleOnPhase(phase);
		phase.setSubjects(null);

		_phaseRepository.deleteById(id);
		return "Phase removed " + id + "!!";
	}

	public String deletePhases() {
		List<Phase> phases = _phaseRepository.findAll();
		for (Phase phase: phases){
			_institutionalUtils.clearCircleOnPhase(phase);
			phase.setSubjects(null);
		}

		_phaseRepository.deleteAll();
		return "Successfully delete all entities!!!";
	}

	public Phase updatePhase(Phase phase) {
		
		Phase existingPhase = _phaseRepository.findById(phase.getId()).orElse(null);

		assert existingPhase != null;
		existingPhase.setName(phase.getName());
		existingPhase.setYear(phase.getYear());
		existingPhase.setModifiedOn(Instant.now());
		existingPhase.setModifiedBy(phase.getModifiedBy());
		
		_phaseRepository.save(existingPhase);
		_institutionalUtils.clearCircleOnPhase(existingPhase);

		return existingPhase;
	}
}
