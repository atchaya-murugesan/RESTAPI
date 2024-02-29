package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.project.model.Category;
import com.example.project.repository.CategoryRepo;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo projectRepo;

    public Page<Category> getProjects(Pageable pageable){
        return projectRepo.findAll(pageable);
    }

    public Category addProject(Category project)
    {
        return projectRepo.save(project);
    }
    public List<Category> getProjects()
    {
        return projectRepo.findAll();
    }
    public Optional<Category> getProjectById(Long id)
    {
     return projectRepo.findById(id);
    }
    public Category edituser(Long id,Category project)
    {
        Category ProjectAvail = projectRepo.findById(id).orElse(null);
        if(ProjectAvail !=null)
        {    
              ProjectAvail.setCategoryId(project.getCategoryId());
              ProjectAvail.setCategoryName(project.getCategoryName());
              ProjectAvail.setCategoryFor(project.getCategoryFor());
             return projectRepo.saveAndFlush(ProjectAvail);
        }
        else
        return null;
    }

    public void deluser(Long projectid)
    {
         projectRepo.deleteById(projectid);
    }
}