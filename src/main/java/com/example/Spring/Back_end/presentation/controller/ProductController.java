package com.example.Spring.Back_end.presentation.controller;

import com.example.Spring.Back_end.domain.entity.Product;
import com.example.Spring.Back_end.infraestructure.repository.IProductService;
import com.example.Spring.Back_end.presentation.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ProductController {

    IProductService productService;

    @PostMapping("")
    public ProductDTO home(@RequestBody Product product) {
        return productService.save(product);
    }

    public ProductController(
            @Autowired
            IProductService productService
    ){
        this.productService = productService;
    }
}
