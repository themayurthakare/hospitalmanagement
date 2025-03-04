package com.management.hospitalmanagement.repository;

import com.management.hospitalmanagement.entity.AppointmentRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRecordRepo extends JpaRepository<AppointmentRecord, Integer> {
}
