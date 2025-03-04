package com.management.hospitalmanagement.exceptions;

public class HospitalIdNotFound extends RuntimeException {
    @Override
    public String getMessage() {
        return "Hospital Id Not Found";
    }
}
