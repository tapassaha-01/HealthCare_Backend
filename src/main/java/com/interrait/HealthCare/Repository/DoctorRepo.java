package com.interrait.HealthCare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interrait.HealthCare.Entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {

	public Doctor findByName(String name);
}
