package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Project;
import com.example.project.repository.ProjectRepo;

@Service
public class ProjectService {
    @Autowired
    ProjectRepo projectRepo;

    public Project addProject(Project project)
    {
        return projectRepo.save(project);
    }
    public List<Project> getProjects()
    {
        return projectRepo.findAll();
    }
    public Optional<Project> getProjectById(Long id)
    {
     return projectRepo.findById(id);
    }
    public Project edituser(Long id,Project project)
    {
        Project ProjectAvail = projectRepo.findById(id).orElse(null);
        if(ProjectAvail !=null)
        {    
              ProjectAvail.setProductName(project.getProductName());
              ProjectAvail.setProductFor(project.getProductFor());
              ProjectAvail.setProductBrand(project.getProductBrand());
              ProjectAvail.setManufacturedIn(project.getManufacturedIn());
              ProjectAvail.setProductPrice(project.getProductPrice());
              ProjectAvail.setExpiryDate(project.getExpiryDate());
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