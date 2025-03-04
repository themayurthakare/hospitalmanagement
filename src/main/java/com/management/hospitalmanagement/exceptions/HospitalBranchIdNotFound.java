package com.management.hospitalmanagement.exceptions;

public class HospitalBranchIdNotFound extends RuntimeException {
    @Override
    public String getMessage() {
        return "Hospital Branch Id Not Found";
    }
}
