package com.example.excercise2.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.excercise2.model.Job;
import com.example.excercise2.service.JobService;


@RestController
public class JobController {
      @Autowired
    JobService jobservice;
    @PostMapping("/api/job")
    public Job addJob(@RequestBody Job job) {
        
        return jobservice.addJob(job);
    }
    @GetMapping("/api/jobs")
    public List<Job> getJob() {
        return jobservice.getJob();
    }
    @GetMapping("/api/jobs/{id}")
    public Optional<Job> getJobById(@PathVariable Long id)
    {
        return jobservice.getById(id);
    }
    
}