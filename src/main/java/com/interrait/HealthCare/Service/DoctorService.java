package com.interrait.HealthCare.Service;


import com.interrait.HealthCare.Dto.DoctorDto;
import com.interrait.HealthCare.Entity.Doctor;

public interface DoctorService {

	public Doctor registerDoctor(DoctorDto doc);
}
