package com.interrait.HealthCare.Dto;

import java.io.File;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentDto {
	
	
	
	private String patient;
	
	private String status;
	
	private String reason;
	
	private String cancellationResion;
	
	private String appointmentDate;
	
	
	private String doctor;
	
	

}
