package com.example.excercise5.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.excercise5.model.Student;

@RestController

public class StudentController {
    @GetMapping("/student")
     public ArrayList<Student> student() {
        ArrayList<Student> details=new ArrayList<>();
        Student st=new Student("John", "Welcome, John!");
        details.add(st);
        return details;
     }
}