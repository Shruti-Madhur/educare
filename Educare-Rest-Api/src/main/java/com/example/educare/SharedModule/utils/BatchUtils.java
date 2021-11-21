package com.example.educare.SharedModule.utils;

import com.example.educare.SharedModule.models.Institutional.Batch;
import com.example.educare.SharedModule.models.Student.StudentPersonalInfo;
import com.example.educare.SharedModule.repository.Institutional.BatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;

@Service
public class BatchUtils {

    @Autowired
    private BatchRepository _batchRepository;

    //Clear Circular Dependency
    public void clearCircleOnBatch(Batch batch){
        batch.setStudentPersonalInfos(null);
    }

    //Batch find and creation
    public Batch batchFind(Batch batch){
       return _batchRepository.findById(batch.getId()).orElse(null);
    }
}
