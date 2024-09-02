package com.example.Spring.Back_end.domain.entity;

import com.example.Spring.Back_end.domain.embedded.SaleDetailsEmbedded;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@Entity
public class SaleDetails {
    @EmbeddedId
    private SaleDetailsEmbedded saleDetailsId;

    private Integer quantity;

    private Timestamp date;

    @MapsId("idEmployee")
    @ManyToOne( targetEntity = Employee.class )
    @JoinColumn( name = "id_employee")
    private Employee employee;

    @MapsId("idProduct")
    @ManyToOne( targetEntity = Product.class )
    @JoinColumn( name = "id_product" )
    private Product product;
}
