package com.example.excercise4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.excercise4.model.Patient;



public interface PatientRepo extends JpaRepository<Patient,Integer>{

    
    
}