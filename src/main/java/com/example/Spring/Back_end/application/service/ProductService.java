package com.example.Spring.Back_end.application.service;

import com.example.Spring.Back_end.infraestructure.mapper.ProductMapper;
import com.example.Spring.Back_end.infraestructure.repository.IProductService;
import com.example.Spring.Back_end.domain.entity.Product;
import com.example.Spring.Back_end.domain.repository.IProductRepository;
import com.example.Spring.Back_end.presentation.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    IProductRepository productRepository;
    ProductMapper productMapper;

    @Override
    public ProductDTO save(Product product) {
        productRepository.save(product);
        return productMapper.toProductDTO(product);
    }

    public ProductService(
            @Autowired IProductRepository productRepository,
            @Autowired ProductMapper productMapper
    ){
        this.productRepository = productRepository;
    }
}
