package com.interrait.HealthCare.Entity;

import java.io.File;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="appointment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String patientName;
	
	private String status;
	
	private String reason;
	
	private String cancellationResion;
	
	private String appointmentDate;
	
	private String doctorName;

}
