package com.example.Spring.Back_end.presentation.dto;

import com.example.Spring.Back_end.domain.embedded.SaleDetailsEmbedded;
import com.example.Spring.Back_end.domain.entity.Employee;
import com.example.Spring.Back_end.domain.entity.Product;
import lombok.Getter;
import lombok.Setter;


import java.sql.Timestamp;

@Setter
@Getter
public class SaleDetailsDTO {
    private SaleDetailsEmbedded saleDetailsId;
    private Integer quantity;
    private Timestamp date;
    private Employee employee;
    private Product product;
}
