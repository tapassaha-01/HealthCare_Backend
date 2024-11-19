package com.interrait.HealthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.interrait.HealthCare.Dto.AppointmentDto;
import com.interrait.HealthCare.Dto.DoctorDto;
import com.interrait.HealthCare.Dto.PatientDto;
import com.interrait.HealthCare.Entity.Appointment;
import com.interrait.HealthCare.Entity.Doctor;
import com.interrait.HealthCare.Service.DoctorService;
import com.interrait.HealthCare.Service.PatientService;



@RestController
@RequestMapping("/admin")
public class AdminController {

	
	@Autowired
	PatientService patientService;
	
	@Autowired
	DoctorService doctorService;
	
	@GetMapping("/getByFullname")
	public PatientDto getPatientByFullname(@RequestParam String fullname) {
		
		return patientService.getPatient(fullname);
	}
	
	@PostMapping("/registerPatient")
	public boolean registerPatient(@RequestBody PatientDto patient) {
		return patientService.setPatient(patient);
	}
	
	@PostMapping("/registerDoctor")
	public Doctor registerDoctor(@RequestBody DoctorDto doc) {
		return doctorService.registerDoctor(doc);
	}
	
	@PostMapping("/setAppointment")
	public Appointment setAppointment(@RequestBody AppointmentDto appointment) {
		return patientService.setAppointment(appointment);
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	
}
