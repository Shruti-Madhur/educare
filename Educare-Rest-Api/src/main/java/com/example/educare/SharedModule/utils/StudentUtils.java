package com.example.educare.SharedModule.utils;

import com.example.educare.SharedModule.models.Student.StudentPersonalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentUtils {

	@Autowired
	private AddressUtils _utils;

	@Autowired
	private BatchUtils _batchUtils;

    public void deletePreprocess(StudentPersonalInfo studentPersonalInfo){
		studentPersonalInfo.setBatch(null);

		studentPersonalInfo.getPermanentAddress().setDivision(null);
		studentPersonalInfo.getPermanentAddress().setDistrict(null);
		studentPersonalInfo.getPermanentAddress().setUpazila(null);

		studentPersonalInfo.getPresentAddress().setDivision(null);
		studentPersonalInfo.getPresentAddress().setDistrict(null);
		studentPersonalInfo.getPresentAddress().setUpazila(null);
	}

	//Clear Circulation
	public void clearCircleOnStudents(List<StudentPersonalInfo> studentPersonalInfos) {
		for (StudentPersonalInfo studentPersonalInfo: studentPersonalInfos){
			studentPersonalInfo.setBatch(null);
		}
	}

	//Clear Circular for Delete
	public void deletePreprocessList(List<StudentPersonalInfo> studentPersonalInfos) {
		for (StudentPersonalInfo studentPersonalInfo: studentPersonalInfos){
			deletePreprocess(studentPersonalInfo);
		}
	}

	public void clearCircle(StudentPersonalInfo studentPersonalInfo){
		if(studentPersonalInfo.getPermanentAddress() != null){
			_utils.clearCircleOnAddress(studentPersonalInfo.getPermanentAddress());
		}
		if(studentPersonalInfo.getPresentAddress() != null){
			_utils.clearCircleOnAddress(studentPersonalInfo.getPresentAddress());
		}
		if(studentPersonalInfo.getBatch() != null){
			_batchUtils.clearCircleOnBatch(studentPersonalInfo.getBatch());
		}
	}
}
