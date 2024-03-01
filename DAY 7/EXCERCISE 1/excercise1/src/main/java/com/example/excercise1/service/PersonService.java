package com.example.excercise1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.excercise1.model.Person;
import com.example.excercise1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    private PersonRepo rep;

    public boolean post(Person person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Person> getAll()
    {
        return rep.findAll();
    }

    public List<Person> getbyAge(int age)
    {
        return rep.findByAge(age);
    }
    
}
