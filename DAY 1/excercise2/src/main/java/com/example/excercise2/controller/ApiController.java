package com.example.excercise2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
    @GetMapping("/studentName")
    public String getMethodName(@RequestParam String studentName) {
        return new String("welcome"+studentName+"!");
    }    
}