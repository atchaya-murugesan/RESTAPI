package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.project.model.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products,Long>{
    
}