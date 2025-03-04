package com.management.hospitalmanagement.repository;

import com.management.hospitalmanagement.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepo extends JpaRepository<Hospital, Integer> {
}
