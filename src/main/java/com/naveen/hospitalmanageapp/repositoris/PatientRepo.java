package com.naveen.hospitalmanageapp.repositoris;

import com.naveen.hospitalmanageapp.models.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patients,Long> {
}
