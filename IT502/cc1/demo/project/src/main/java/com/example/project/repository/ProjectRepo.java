package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Long>{
    
}