package com.springboot.products.controller;

import com.springboot.products.model.Product;
import com.springboot.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@RequestMapping("/products")

public class ProductController {
    @Autowired
    private ProductService ps;
    //@Autowired
    private Product p;
    @GetMapping("/findall")
    public List<Product> getProduct(){
        return ps.findAll();


    }
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return ps.add(product);
    }



}
