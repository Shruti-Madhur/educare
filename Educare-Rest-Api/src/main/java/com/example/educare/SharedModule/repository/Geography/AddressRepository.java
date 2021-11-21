package com.example.educare.SharedModule.repository.Geography;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educare.SharedModule.models.Geography.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
	
}
