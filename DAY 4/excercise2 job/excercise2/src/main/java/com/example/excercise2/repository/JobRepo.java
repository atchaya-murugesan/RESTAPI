package com.example.excercise2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.excercise2.model.Job;




@Repository
public interface  JobRepo extends JpaRepository<Job,Long>{

    Job jobId(Long id);  //long is datatype of primarykey 
    
   
}