package com.interrait.HealthCare.Service;



import com.interrait.HealthCare.Dto.AppointmentDto;
import com.interrait.HealthCare.Dto.PatientDto;
import com.interrait.HealthCare.Entity.Appointment;




public interface PatientService {
	
	public PatientDto getPatient(String name);
	public boolean setPatient(PatientDto patient);
	public Appointment setAppointment(AppointmentDto appointment);
	
	

}
