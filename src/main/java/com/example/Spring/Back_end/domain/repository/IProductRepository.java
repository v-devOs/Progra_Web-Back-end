package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
