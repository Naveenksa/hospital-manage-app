package com.naveen.hospitalmanageapp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "patients")
public class Patients extends Person{

    @Column(name = "age")
    @Digits(fraction = 0,integer = 3)
    private int age;

    @Column(name = "weight")
    private double weight;

    @Column(name = "height")
   private double height;


    @Column(name = "address")
    @NotEmpty
    private String address;

    @Column(name = "city")
    @NotEmpty
    private String city;

    @Column(name = "telephone")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String telephone;

    @ManyToOne
    @JoinTable(name = "doctor_id")
    private  Doctor doctor;

}
