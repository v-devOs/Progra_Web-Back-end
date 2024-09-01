package com.example.Spring.Back_end.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Direction {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer idDirection;

    @Column( nullable = false )
    private String zone;

    @Column( nullable = false )
    private String street;
}
