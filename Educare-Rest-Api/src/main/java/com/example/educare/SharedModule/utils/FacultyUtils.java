package com.example.educare.SharedModule.utils;

import com.example.educare.AdminPanel.FacultyManagement.FacultyManage.repository.FacultyPersonalInfoRepository;
import com.example.educare.SharedModule.models.Faculty.FacultyPersonalInfo;
import com.example.educare.SharedModule.models.Student.StudentPersonalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyUtils {

    @Autowired
    private FacultyPersonalInfoRepository _facultyPersonalInfoRepository;

    @Autowired
    private AddressUtils _utils;

    public FacultyPersonalInfo facultyFind(FacultyPersonalInfo facultyPersonalInfo){
        return _facultyPersonalInfoRepository.findById(
                facultyPersonalInfo.getId()
        ).orElse(null);
    }

    public void deletePreprocess(FacultyPersonalInfo facultyPersonalInfo){

        facultyPersonalInfo.getPermanentAddress().setDivision(null);
        facultyPersonalInfo.getPermanentAddress().setDistrict(null);
        facultyPersonalInfo.getPermanentAddress().setUpazila(null);

        facultyPersonalInfo.getPresentAddress().setDivision(null);
        facultyPersonalInfo.getPresentAddress().setDistrict(null);
        facultyPersonalInfo.getPresentAddress().setUpazila(null);
    }

    public void clearCircle(FacultyPersonalInfo faculty){
        if(faculty.getPermanentAddress() != null){
            _utils.clearCircleOnAddress(faculty.getPermanentAddress());
        }

        if(faculty.getPresentAddress() != null){
            _utils.clearCircleOnAddress(faculty.getPresentAddress());
        }
    }
}
