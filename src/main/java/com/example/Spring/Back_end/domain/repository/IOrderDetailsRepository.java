package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.embedded.OrderDetailsEmbedded;
import com.example.Spring.Back_end.domain.entity.Employee;
import com.example.Spring.Back_end.domain.entity.OrderDetails;
import com.example.Spring.Back_end.presentation.dto.OrderDetailsDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOrderDetailsRepository extends JpaRepository<OrderDetails, OrderDetailsEmbedded> {

}
