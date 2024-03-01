package com.example.excercise1.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.excercise1.model.Product;
import com.example.excercise1.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo rep;

    public boolean add(Product pro)
    {
        try{
            rep.save(pro);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    
    public List<Product> find()
    {
        return rep.findAll();
    }

    public Optional<Product> findId(int id)
    {
        return rep.findById(id);
    }
}
