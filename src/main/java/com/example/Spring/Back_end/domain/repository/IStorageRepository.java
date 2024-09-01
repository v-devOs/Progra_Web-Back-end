package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStorageRepository extends JpaRepository<Storage, Integer> {
}
