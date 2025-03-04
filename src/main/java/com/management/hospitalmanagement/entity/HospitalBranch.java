package com.management.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class HospitalBranch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bname;
    private String baddress;
    private String bphone;

    @OneToMany
    private List<Patient> patients;

}
