package com.interrait.HealthCare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interrait.HealthCare.Entity.Patient;


@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

	public Patient findByFullname(String name);
}
