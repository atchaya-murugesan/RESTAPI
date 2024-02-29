
package com.example.project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Category;
import com.example.project.service.CategoryService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CategoryController {
    @Autowired
    CategoryService projectService;

    @PostMapping("/product")
    public Category addProduct(@RequestBody Category project) {
        return projectService.addProject(project);
    }

    @GetMapping("/getproj")
   public ResponseEntity<List<Category>> getProjects(Pageable pageable) {
        Page<Category> projects = projectService.getProjects(pageable);
        return ResponseEntity.ok(projects.getContent());
    }

    @GetMapping("/project/{Id}")
    public Optional<Category> getProjectById(@PathVariable Long Id) {
        return projectService.getProjectById(Id);
    }
    @PutMapping("/editproj/{id}")
    public Category edituser(@PathVariable Long id, @RequestBody Category project) {
        
        
        return projectService.edituser(id,project);
    }

    @DeleteMapping("/delproj/{id}")
    public void deluser(@PathVariable Long id)
    {
         projectService.deluser(id);
    }
}