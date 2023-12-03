package com.naveen.hospitalmanageapp.service;

import com.naveen.hospitalmanageapp.models.Doctor;
import com.naveen.hospitalmanageapp.repositoris.DoctorRepo;
import com.naveen.hospitalmanageapp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorSecviceIpls implements DoctorService {

    @Autowired
    DoctorRepo doctorRepo;

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepo.save(doctor);
    }
}
