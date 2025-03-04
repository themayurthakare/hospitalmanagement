package com.management.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String hname;
    private String haddress;
    private String hphone;
    private String hemail;

    @OneToMany
    private List<HospitalBranch> branches;
}
