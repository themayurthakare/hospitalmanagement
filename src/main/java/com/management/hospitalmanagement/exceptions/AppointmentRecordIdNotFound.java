package com.management.hospitalmanagement.exceptions;

public class AppointmentRecordIdNotFound extends RuntimeException {
    @Override
    public String getMessage() {
        return "Appointment Record id not found";
    }
}
