package com.interrait.HealthCare.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interrait.HealthCare.Entity.Appointment;
import com.interrait.HealthCare.Entity.Patient;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
	
//	public List<Appointment> findByPatient(Patient patient);

}
