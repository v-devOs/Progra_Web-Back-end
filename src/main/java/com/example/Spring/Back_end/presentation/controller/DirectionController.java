package com.example.Spring.Back_end.presentation.controller;

import com.example.Spring.Back_end.domain.entity.Direction;
import com.example.Spring.Back_end.infraestructure.repository.IDirectionService;
import com.example.Spring.Back_end.presentation.dto.DirectionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class DirectionController {
    IDirectionService directionService;


    @PostMapping("/direction")
    DirectionDTO save(@RequestBody Direction direction) {
        return directionService.save(direction);
    }


    public DirectionController(
            @Autowired
            IDirectionService directionService) {
        this.directionService = directionService;
    }


}
