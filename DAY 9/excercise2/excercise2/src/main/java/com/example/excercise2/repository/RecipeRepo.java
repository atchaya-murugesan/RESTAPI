package com.example.excercise2.repository;

import java.util.Optional;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.excercise2.model.Recipe;

import jakarta.transaction.Transactional;
@Repository
public interface RecipeRepo extends JpaRepository<Recipe,Integer>
{
    @Modifying
    @Transactional

    List<Recipe> findByRecipeName(String recipeName);
    @Query("select p from Recipe p where p.recipeId= ?1")
    Optional<Recipe>findById(int recipeId);

    
}