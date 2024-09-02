package com.example.Spring.Back_end.domain.embedded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class SaleDetailsEmbedded {

    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer idSale;
    private Integer idEmployee;
    private Integer idProduct;
}
