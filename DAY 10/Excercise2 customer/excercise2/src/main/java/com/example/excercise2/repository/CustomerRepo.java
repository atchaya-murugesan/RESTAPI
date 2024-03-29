package com.example.excercise2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.excercise2.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {

    List<Customer> findByCity(String City);
    
}