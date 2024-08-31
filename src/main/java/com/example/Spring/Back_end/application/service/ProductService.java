package com.example.Spring.Back_end.application.service;

import com.example.Spring.Back_end.infraestructure.repository.IProductService;
import com.example.Spring.Back_end.domain.entity.Product;
import com.example.Spring.Back_end.domain.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    IProductRepository productRepository;

    @Override
    public Product save(Product product) {

        productRepository.save(product);

        return product;
    }

    public ProductService(
            @Autowired
            IProductRepository productRepository
    ){
        this.productRepository = productRepository;
    }
}
