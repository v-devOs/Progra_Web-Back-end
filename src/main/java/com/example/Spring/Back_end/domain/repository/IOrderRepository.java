package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order, Integer> {
}
