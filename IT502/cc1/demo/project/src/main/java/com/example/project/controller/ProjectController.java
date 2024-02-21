
package com.example.project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Project;
import com.example.project.service.ProjectService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @PostMapping("/product")
    public Project addProduct(@RequestBody Project project) {
        return projectService.addProject(project);
    }

    @GetMapping("/getproj")
    public List<Project> getProjects() {
        return projectService.getProjects();
    }

    @GetMapping("/project/{Id}")
    public Optional<Project> getProjectById(@PathVariable Long Id) {
        return projectService.getProjectById(Id);
    }
    @PutMapping("/editproj/{id}")
    public Project edituser(@PathVariable Long id, @RequestBody Project project) {
        
        
        return projectService.edituser(id,project);
    }

    @DeleteMapping("/delproj/{id}")
    public void deluser(@PathVariable Long id)
    {
         projectService.deluser(id);
    }
}