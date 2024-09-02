package com.example.Spring.Back_end.presentation.dto;

import com.example.Spring.Back_end.domain.entity.Branch;
import com.example.Spring.Back_end.domain.entity.Order;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
public class OrderDTO {
    private Integer idOrder;
    private Timestamp date;
    private Boolean status;
    private Branch branch;

    public OrderDTO(Order order) {
        this.idOrder = order.getIdOrder();
        this.date = order.getDate();
        this.status = order.getStatus();
        this.branch = order.getBranch();
    }
}
