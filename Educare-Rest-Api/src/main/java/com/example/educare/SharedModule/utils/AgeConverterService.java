package com.example.educare.SharedModule.utils;

import java.sql.Date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class AgeConverterService {
	
	public LocalDate convertToEntityAttribute(Date date) {
        return Optional.ofNullable(date)
          .map(Date::toLocalDate)
          .orElse(null);
    }
	
	public int age(Date date) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = convertToEntityAttribute(date);

		Period period = Period.between(birthday, today);

		if(date != null){
			return period.getYears();
		}

		return 0;
	}
}
