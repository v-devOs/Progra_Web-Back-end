package com.example.Spring.Back_end.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Product {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer idProduct;

    private Double price;

    private String type;

    private Boolean active;

    @Column(nullable = false)
    private String flavor;

    @Column(nullable = false)
    private String presentacion;

    @Column(nullable = false)
    private String product;

}
