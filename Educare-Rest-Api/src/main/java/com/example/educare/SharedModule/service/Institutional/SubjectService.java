package com.example.educare.SharedModule.service.Institutional;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;


import com.example.educare.SharedModule.utils.InstitutionalUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.educare.SharedModule.models.Institutional.Subject;
import com.example.educare.SharedModule.repository.Institutional.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository _subjectRepository;

	@Autowired
	private InstitutionalUtils _institutionalUtils;

	public Subject createSubject(Subject subject) {
		subject.setDepartment(_institutionalUtils.departmentFind(subject.getDepartment()));
		subject.setPhase(_institutionalUtils.phaseFind(subject.getPhase()));
		subject.setCreatedOn(Instant.now());
		_subjectRepository.save(subject);
		_institutionalUtils.clearDependencyOnSubject(subject);

		return subject;
	}

	public List<Subject> createSubjects(List<Subject> subjectList) {
		for(Subject subject: subjectList){
			subject.setDepartment(_institutionalUtils.departmentFind(subject.getDepartment()));
			subject.setPhase(_institutionalUtils.phaseFind(subject.getPhase()));
			subject.setCreatedOn(Instant.now());
		}
		_subjectRepository.saveAll(subjectList);
		for(Subject subject: subjectList){
			_institutionalUtils.clearDependencyOnSubject(subject);
		}

		return subjectList;
	}

	public List<Subject> getSubjects() {
		List<Subject> subjects = _subjectRepository.findAll();
		for(Subject subject: subjects){
			_institutionalUtils.clearDependencyOnSubject(subject);
		}
		return subjects;
	}

	public Subject getSubjectById(Long id) {
		Subject subject = _subjectRepository.findById(id).orElse(null);
		assert subject != null;
		_institutionalUtils.clearDependencyOnSubject(subject);
		return subject;
	}

	public String deleteSubjectById(Long id) {
		Subject subject = _subjectRepository.findById(id).orElse(null);
		assert subject != null;
		_institutionalUtils.clearCircleOnSubjectDelete(subject);
		_subjectRepository.deleteById(id);
		return "Subject removed " + id + "!!";
	}

	public String deleteSubjects() {
		List<Subject> subjects = _subjectRepository.findAll();
		for(Subject subject: subjects){
			_institutionalUtils.clearCircleOnSubjectDelete(subject);
		}
		_subjectRepository.deleteAll();
		return "Successfully delete all entities!!!";
	}

	public Subject updateSubject(Subject subject) {
		
		Subject existingSubject = _subjectRepository.findById(subject.getId()).orElse(null);

		assert existingSubject != null;
		existingSubject.setName(subject.getName());
		existingSubject.setCode(subject.getCode());

		existingSubject.setDepartment(
				_institutionalUtils.departmentFind(subject.getDepartment()));
		existingSubject.setPhase(
				_institutionalUtils.phaseFind(subject.getPhase()));
		existingSubject.setModifiedOn(Instant.now());
		existingSubject.setModifiedBy(subject.getModifiedBy());

		_subjectRepository.save(existingSubject);
		_institutionalUtils.clearDependencyOnSubject(existingSubject);

		return existingSubject;
	}
}
