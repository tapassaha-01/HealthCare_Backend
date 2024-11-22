package com.interrait.HealthCare.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interrait.HealthCare.Entity.Appointment;
import com.interrait.HealthCare.Repository.AppointmentRepo;
import com.interrait.HealthCare.Service.AppointmentService;

@Service
public class AppointmentServiceImp implements AppointmentService {
	
	@Autowired
	AppointmentRepo appointmentRepo;

	@Override
	public List<Appointment> getAllAppointment() {
		
		return appointmentRepo.findAll();
	}

}
