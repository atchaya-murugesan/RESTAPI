package com.example.excercise1.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Apicontroller {
    @GetMapping("/Welcome")
    public String getMethodName() {
        return new String("Welcome Spring Boot!");
    }
    
    
}
