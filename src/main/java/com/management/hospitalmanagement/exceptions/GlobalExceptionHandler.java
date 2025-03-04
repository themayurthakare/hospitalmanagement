package com.management.hospitalmanagement.exceptions;

import com.management.hospitalmanagement.utils.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ResponseStructure<String>> HospitalIdNotFound(HospitalIdNotFound exception) {
        ResponseStructure<String> response = new ResponseStructure<>();
        response.setStatusCode(HttpStatus.NOT_FOUND.value());
        response.setMessage("Hospital Does Not Exist");
        response.setData("Hospital Id not found");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ResponseStructure<String>> HospitalBranchIdNotFound(HospitalBranchIdNotFound exception) {
        ResponseStructure<String> response = new ResponseStructure<>();
        response.setStatusCode(HttpStatus.NOT_FOUND.value());
        response.setMessage("Hospital Branch Does Not Exist");
        response.setData("Hospital Branch Id Not Found");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ResponseStructure<String>> PatientIdNotFound(PatientIdNotFound exception) {
        ResponseStructure<String> response = new ResponseStructure<>();
        response.setStatusCode(HttpStatus.NOT_FOUND.value());
        response.setMessage("Patient Does Not Exist");
        response.setData("Patient Id not found");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ResponseStructure<String>> AppointmentRecordIdNotFound(AppointmentRecordIdNotFound exception) {
        ResponseStructure<String> response = new ResponseStructure<>();
        response.setStatusCode(HttpStatus.NOT_FOUND.value());
        response.setMessage("Appointment Record Does Not Exist");
        response.setData("Appointment Record Id not found");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
