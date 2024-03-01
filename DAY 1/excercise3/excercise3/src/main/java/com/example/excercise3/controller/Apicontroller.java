package com.example.excercise3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller 
{
    @GetMapping("/favouriteColor")
    public String getMethodName(@RequestParam String favouriteColor)
    {
        return new String("My favourite color is "+favouriteColor+"!");
    }
}