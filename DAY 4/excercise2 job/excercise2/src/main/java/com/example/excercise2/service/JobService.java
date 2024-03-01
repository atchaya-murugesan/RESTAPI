package com.example.excercise2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.excercise2.model.Job;
import com.example.excercise2.repository.JobRepo;


@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;
    public Job addJob(Job job)
    {
        return jobRepo.save(job);
    }
    public List<Job> getJob()
    {
        return jobRepo.findAll();
    }
    public Optional<Job> getById(Long jobId)
    {
        return jobRepo.findById(jobId);
    }
   
    
}