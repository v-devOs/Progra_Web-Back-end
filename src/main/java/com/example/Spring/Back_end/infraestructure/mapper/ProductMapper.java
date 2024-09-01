package com.example.Spring.Back_end.infraestructure.mapper;

import com.example.Spring.Back_end.domain.entity.Product;
import com.example.Spring.Back_end.presentation.dto.ProductDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    ModelMapper modelMapper;

    public ProductDTO toProductDTO(Product product) {
        return modelMapper.map(product, ProductDTO.class);
    }

    public ProductMapper(
            @Autowired ModelMapper modelMapper
    ){ this.modelMapper = modelMapper; }
}
