package com.interrait.HealthCare.Entity;



import java.io.File;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patient") 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId; 
    
//    
    private List<Long> appointmentIdList;
    
    //Personal information
    private String fullname;
    private String email;
    @Column(unique = true)
    private Long phoneNo;
    private String dob; 
    private String gender;
    private String address;
    private String occupation;
    private String emergencyContactName;
    private Long emergencyContactNo;
    
    //Medical information
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