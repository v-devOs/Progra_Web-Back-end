package com.example.Spring.Back_end.presentation.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDTO {
    private Integer idProduct;
    private Double price;
    private String type;
    private Boolean active;
    private String flavor;
    private String presentacion;
    private String product;
}
