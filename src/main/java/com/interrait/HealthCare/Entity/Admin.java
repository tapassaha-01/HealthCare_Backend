package com.interrait.HealthCare.Entity;

import java.util.*;

import com.interrait.HealthCare.Dto.PatientDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates IDs
    private Long id;
	
//	
//	private ArrayList<Patient> patientList;
//	
//	@JoinColumn(referencedColumnName="appointmentDate")
//	private Patient appointmentDate;
//	
	

}