package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Long>{
    
}