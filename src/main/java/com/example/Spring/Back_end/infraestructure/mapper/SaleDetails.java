package com.example.Spring.Back_end.infraestructure.mapper;

import com.example.Spring.Back_end.presentation.dto.SaleDetailsDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaleDetails {

    ModelMapper modelMapper;

    SaleDetailsDTO toSaleDetailsDTO( SaleDetails saleDetails ) {
        return modelMapper.map(saleDetails, SaleDetailsDTO.class);
    }

    public SaleDetails(
            @Autowired ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

}
