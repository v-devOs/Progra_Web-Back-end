package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.embedded.OrderDetailsEmbedded;
import com.example.Spring.Back_end.domain.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderDetailsRepository extends JpaRepository<OrderDetails, OrderDetailsEmbedded> {
}
