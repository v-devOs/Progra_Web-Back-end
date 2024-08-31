package com.example.Spring.Back_end.infraestructure.repository;

import com.example.Spring.Back_end.domain.entity.Product;

public interface IProductService {
    public Product save(Product product);
}
