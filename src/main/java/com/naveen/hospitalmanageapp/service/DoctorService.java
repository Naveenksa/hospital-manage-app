package com.naveen.hospitalmanageapp.service;

import com.naveen.hospitalmanageapp.models.Doctor;
import com.naveen.hospitalmanageapp.repositoris.DoctorRepo;
import org.springframework.stereotype.Service;
public interface DoctorService {

public Doctor saveDoctor(Doctor doctor);
}
