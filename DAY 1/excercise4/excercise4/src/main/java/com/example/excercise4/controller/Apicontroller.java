package com.example.excercise4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Address;

@RestController
public class Apicontroller {
    @GetMapping("/address")
    public Address getMethodName() {
        Address address=new Address("atchaya",16/17,"bank Street", 030, "Kovaipudur", "Coimbatore", "TamilNadu", "India");
        return address;
    }
}
