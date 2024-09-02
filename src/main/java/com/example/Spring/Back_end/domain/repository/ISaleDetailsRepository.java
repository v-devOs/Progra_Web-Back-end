package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.embedded.SaleDetailsEmbedded;
import com.example.Spring.Back_end.domain.entity.SaleDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleDetailsRepository extends JpaRepository<SaleDetails, SaleDetailsEmbedded> {
}
