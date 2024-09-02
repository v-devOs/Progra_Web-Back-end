package com.example.Spring.Back_end.domain.entity;

import com.example.Spring.Back_end.domain.embedded.OrderDetailsEmbedded;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class OrderDetails {
    @EmbeddedId
    private OrderDetailsEmbedded idOrderDetails;

    @Column( nullable = false )
    private Integer quantity;

    @MapsId("idOrder")
    @ManyToOne()
    @JoinColumn( name = "id_order", insertable = false, updatable = false )
    private Order order;

    @MapsId("idProduct")
    @ManyToOne( targetEntity = Product.class )
    @JoinColumn( name = "id_product", insertable = false, updatable = false )
    private Product product;

    @MapsId("idEmployee")
    @ManyToOne( targetEntity = Employee.class )
    @JoinColumn( name = "id_employee", insertable = false, updatable = false )
    private Employee employee;
}
