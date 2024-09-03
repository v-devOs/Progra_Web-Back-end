package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Branch;
import com.example.Spring.Back_end.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOrderRepository extends JpaRepository<Order, Integer> {
    public List<Order> findByBranch(Branch branch);
}
