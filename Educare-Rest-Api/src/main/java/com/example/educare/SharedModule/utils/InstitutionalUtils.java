package com.example.educare.SharedModule.utils;

import com.example.educare.SharedModule.models.Geography.District;
import com.example.educare.SharedModule.models.Institutional.*;
import com.example.educare.SharedModule.repository.Institutional.DepartmentRepository;
import com.example.educare.SharedModule.repository.Institutional.PartRepository;
import com.example.educare.SharedModule.repository.Institutional.PhaseRepository;
import com.example.educare.SharedModule.repository.Institutional.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutionalUtils {
    @Autowired
    private DepartmentRepository _departmentRepository;

    @Autowired
    private PhaseRepository _phaseRepository;

    @Autowired
    private SubjectRepository _subjectRepository;

    public Department departmentFind(Department department){
        return _departmentRepository.findById(department.getId()).orElse(null);
    }

    public Phase phaseFind(Phase phase){
        return _phaseRepository.findById(phase.getId()).orElse(null);
    }

    public Subject subjectFind(Subject subject){
        return _subjectRepository.findById(subject.getId()).orElse(null);
    }

    //Clear Circular Dependency
    public void clearDependencyOnSubject(Subject subject){
        if(subject.getDepartment() != null)
            subject.getDepartment().setSubjects(null);
        if(subject.getPhase() != null)
            subject.getPhase().setSubjects(null);
        if (subject.getParts() != null)
            for (Part part : subject.getParts())
                part.setSubject(null);
    }

    //Clear Circular Dependency
    public void clearCircleOnSubjectDelete(Subject subject) {
        if (subject.getDepartment() != null)
            subject.setDepartment(null);
        if (subject.getPhase() != null)
            subject.setPhase(null);
        if (subject.getParts() != null) {
            for (Part part : subject.getParts()) {
                part.setSubject(null);
            }
            subject.setParts(null);
        }
    }

    //Clear Circular Dependency
    public void clearCircleOnDepartment(Department department){
        if(department.getSubjects() != null)
        for (Subject subject: department.getSubjects()){
            subject.setDepartment(null);

           if(subject.getPhase() != null) {
               subject.getPhase().setSubjects(null);
           }
        }
    }

    //Clear Circular Dependency
    public void clearCircleOnPhase(Phase phase){
        if(phase.getSubjects() != null)
        for (Subject subject: phase.getSubjects()){
            subject.setPhase(null);

            if( subject.getDepartment() != null) {
                subject.getDepartment().setSubjects(null);
            }
        }
    }

    //Clear Circular Dependency
    public void clearCircleOnPart(Part part){
        if(part.getSubject().getDepartment() != null)
            part.getSubject().getDepartment().setSubjects(null);
        if(part.getSubject().getPhase() != null)
            part.getSubject().getPhase().setSubjects(null);
        if(part.getSubject() != null)
            part.getSubject().setParts(null);
    }

    public void deletePreprocessOnInst(Institution institution){

        institution.getAddress().setDivision(null);
        institution.getAddress().setDistrict(null);
        institution.getAddress().setUpazila(null);
    }
}
