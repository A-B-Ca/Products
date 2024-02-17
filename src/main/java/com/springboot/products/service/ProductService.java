package com.springboot.products.service;

import com.springboot.products.ProductsApplication;
import com.springboot.products.model.Product;
import com.springboot.products.repository.ProductRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    private List<Product> list= new ArrayList<>();




    public List<Product> findAll(){
        return productRepo.findAll();

    }

    public Product add(Product product){
        return productRepo.save(product);
    }

}
