package com.example.Spring.Back_end.infraestructure.repository;

import com.example.Spring.Back_end.domain.entity.Product;
import com.example.Spring.Back_end.presentation.dto.ProductDTO;

public interface IProductService {
    public ProductDTO save(Product product);
}
