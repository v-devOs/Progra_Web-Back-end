package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Direction;
import com.example.Spring.Back_end.presentation.dto.DirectionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IDirectionRepository extends JpaRepository<Direction, Integer> {

    @Query("select idDirection from Direction order by idDirection desc limit 1")
    public Integer findLatestSave();

}
