package com.example.Spring.Back_end.infraestructure.repository;

import com.example.Spring.Back_end.domain.entity.Direction;
import com.example.Spring.Back_end.presentation.dto.DirectionDTO;

public interface IDirectionService {
    public DirectionDTO save(Direction direction);
}
