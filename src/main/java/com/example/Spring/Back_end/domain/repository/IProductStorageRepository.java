package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.embedded.ProductStorageEmbedded;
import com.example.Spring.Back_end.domain.entity.ProductStorage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductStorageRepository extends JpaRepository<ProductStorage, ProductStorageEmbedded> {
}
