package com.example.Spring.Back_end.presentation.dto;

import com.example.Spring.Back_end.domain.entity.Direction;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DirectionDTO {
    private Integer idDirection;
    private String zone;
    private String street;

    public DirectionDTO(Direction direction) {
        this.idDirection = direction.getIdDirection();
        this.zone = direction.getZone();
        this.street = direction.getStreet();
    }
}
