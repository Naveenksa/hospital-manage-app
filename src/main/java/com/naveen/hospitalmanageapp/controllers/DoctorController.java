package com.naveen.hospitalmanageapp.controllers;

import com.naveen.hospitalmanageapp.models.Doctor;
import com.naveen.hospitalmanageapp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("/add")
    public Doctor addDonctor(@RequestBody Doctor doctor){
        Doctor doctor1=doctorService.saveDoctor(doctor);
return doctor;
    }
}
