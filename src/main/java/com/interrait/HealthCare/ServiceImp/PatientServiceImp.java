package com.interrait.HealthCare.ServiceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interrait.HealthCare.Dto.AppointmentDto;
import com.interrait.HealthCare.Dto.DoctorDto;
import com.interrait.HealthCare.Dto.PatientDto;
import com.interrait.HealthCare.Entity.Appointment;
import com.interrait.HealthCare.Entity.Doctor;
import com.interrait.HealthCare.Entity.Patient;
import com.interrait.HealthCare.Repository.AppointmentRepo;
import com.interrait.HealthCare.Repository.DoctorRepo;
import com.interrait.HealthCare.Repository.PatientRepo;
import com.interrait.HealthCare.Service.PatientService;


@Service
public class PatientServiceImp implements PatientService{
	
	@Autowired
	PatientRepo patientRepo;
	
	@Autowired
	AppointmentRepo appointmentRepo;

	@Autowired
	DoctorRepo doctorRepo;
	
	@Override
	public PatientDto getPatient(String patientName) {
		Patient p = patientRepo.findByFullname(patientName);
		PatientDto pDto = PatientDto.builder()
				.address(p.getAddress())
				.dob(p.getDob())
				.email(p.getEmail())
				.emergencyContactName(p.getEmergencyContactName())
				.emergencyContactNo(p.getEmergencyContactNo())
				.fullname(p.getFullname())
				.phoneNo(p.getPhoneNo())
				.gender(p.getGender()).build();
		return pDto;
	}

	@Override
	public boolean setPatient(PatientDto p) {
		Patient patient = patientRepo.save(Patient.builder()
				.address(p.getAddress())
				.dob(p.getDob())
				.email(p.getEmail())
				.emergencyContactName(p.getEmergencyContactName())
				.emergencyContactNo(p.getEmergencyContactNo())
				.fullname(p.getFullname())
				.phoneNo(p.getPhoneNo())
				.gender(p.getGender()).build());
		return patient!=null;
	}

	@Override
	public Appointment setAppointment(AppointmentDto appointment) {
		Patient pati = Optional.ofNullable(patientRepo.findByFullname(appointment.getPatient()))
                .orElseThrow(() -> new RuntimeException("Patient is not available...!!"));
		
		Doctor doc = Optional.ofNullable(doctorRepo.findByName(appointment.getDoctor()))
                .orElseThrow(() -> {
                    System.out.println("Doctor not found for name: " + appointment.getDoctor());
                    return new RuntimeException("Doctor is not available...!!");
                });
		
		
		Appointment app = appointmentRepo.save(Appointment.builder()
								.appointmentDate(appointment.getAppointmentDate())
								.cancellationResion(appointment.getCancellationResion())
								.doctorName(appointment.getDoctor())
								.patientName(appointment.getPatient())
								.reason(appointment.getReason())
								.status(appointment.getStatus()).build());
		List<Long> appointmentList = Optional.ofNullable(pati.getAppointmentIdList()).orElse(new ArrayList<>());
		appointmentList.add(app.getId());
		pati.setAppointmentIdList(appointmentList);
		patientRepo.save(pati); 
		appointmentList = Optional.ofNullable(doc.getAppointmentIdList()).orElse(new ArrayList<>());
		appointmentList.add(app.getId());
		doc.setAppointmentIdList(appointmentList);
		doctorRepo.save(doc);
		
		return app;
	}
	

}
