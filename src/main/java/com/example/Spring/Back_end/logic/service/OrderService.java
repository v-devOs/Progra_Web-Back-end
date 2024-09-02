package com.example.Spring.Back_end.logic.service;

import com.example.Spring.Back_end.domain.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    IOrderRepository repository;

    public OrderService(
            @Autowired IOrderRepository orderRepository
    ) { this.repository = orderRepository; }
}
