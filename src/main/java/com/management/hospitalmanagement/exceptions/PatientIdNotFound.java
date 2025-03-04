package com.management.hospitalmanagement.exceptions;

public class PatientIdNotFound extends RuntimeException {
    @Override
    public String getMessage() {
        return "Patient Id Not Found";
    }
}
