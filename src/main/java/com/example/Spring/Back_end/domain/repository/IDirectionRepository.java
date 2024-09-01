package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDirectionRepository extends JpaRepository<Direction, Integer> {
}
