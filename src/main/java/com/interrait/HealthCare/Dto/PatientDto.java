package com.interrait.HealthCare.Dto;

import java.io.File;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientDto {
	

	
	private String fullname;
	private String email;
	private Long phoneNo;
	private String dob;
	private String gender;
	private String address;
	private String occupation;
	private String emergencyContactName;
	private Long emergencyContactNo;
	 private String primaryCarePhysician;
	    private String insuranceProvider;
	    private String insurancePolicyNo;
	    private String allergies;
	    private String currentMedications;
	    private String familyMedicalHistroy;
	    private String pastMedicalHistory;
	    //Identification and Verification
	    private String identificationTyp;
	    private Long identificationNo;
	    private File identificationDocument;

}
