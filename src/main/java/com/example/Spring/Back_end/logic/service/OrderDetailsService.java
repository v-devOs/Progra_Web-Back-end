package com.example.Spring.Back_end.logic.service;

import com.example.Spring.Back_end.domain.repository.IOrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsService {

    IOrderDetailsRepository orderDetailsRepository;

    public OrderDetailsService(
            @Autowired IOrderDetailsRepository orderDetailsRepository
    ) { this.orderDetailsRepository = orderDetailsRepository; }
}
