package com.example.Spring.Back_end.presentation.dto;

import com.example.Spring.Back_end.domain.embedded.OrderDetailsEmbedded;
import com.example.Spring.Back_end.domain.entity.OrderDetails;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDetailsDTO {
    private OrderDetailsEmbedded orderDetailsId;
    private Integer quantity;

    public OrderDetailsDTO(OrderDetails orderDetails) {
        this.orderDetailsId = orderDetails.getIdOrderDetails();
        this.quantity = orderDetails.getQuantity();
    }
}

