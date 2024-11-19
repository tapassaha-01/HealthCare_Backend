package com.interrait.HealthCare.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interrait.HealthCare.Dto.DoctorDto;
import com.interrait.HealthCare.Entity.Doctor;
import com.interrait.HealthCare.Repository.DoctorRepo;
import com.interrait.HealthCare.Service.DoctorService;

@Service
public class DoctorServiceImp implements DoctorService {
	
	@Autowired
	DoctorRepo doctorRepo;

	@Override
	public Doctor registerDoctor(DoctorDto doc) {
		
		Doctor doctor = Doctor.builder().name(doc.getName()).build();
		
		return doctorRepo.save(doctor);
	}

}
