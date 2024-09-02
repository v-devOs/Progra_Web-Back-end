package com.example.Spring.Back_end.logic.service;

import com.example.Spring.Back_end.domain.entity.Direction;
import com.example.Spring.Back_end.domain.repository.IDirectionRepository;
import com.example.Spring.Back_end.infraestructure.repository.IDirectionService;
import com.example.Spring.Back_end.presentation.dto.DirectionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectionService implements IDirectionService {
    IDirectionRepository directionRepository;

    @Override
    public DirectionDTO save(Direction direction) {

        DirectionDTO directionRes;

        directionRepository.save(direction);

        directionRes = new DirectionDTO(direction);

        return directionRes;
    }

    public DirectionService(
            @Autowired
            IDirectionRepository directionRepository
    ){
        this.directionRepository = directionRepository;
    }
}
