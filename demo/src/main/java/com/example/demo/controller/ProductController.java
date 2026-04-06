package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepository;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }
    
    
    @PostMapping
    public Product addPro(@RequestBody Product pro)
    {
    	return repository.save(pro);
    }
    
    @GetMapping("/Allget")
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
    
//suresh push




}
