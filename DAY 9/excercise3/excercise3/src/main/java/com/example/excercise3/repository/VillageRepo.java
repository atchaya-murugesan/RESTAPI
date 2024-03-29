package com.example.excercise3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import org.springframework.stereotype.Repository;

import com.example.excercise3.model.Village;

import jakarta.transaction.Transactional;
@Repository
public interface VillageRepo extends JpaRepository<Village,Integer>
{
    @Modifying
    @Transactional
    

    
    
    List<Village> findByVillagePopulation(int population);
    
    
    Village findByVillageName(String villageName);

    
}