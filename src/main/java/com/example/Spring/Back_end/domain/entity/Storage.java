package com.example.Spring.Back_end.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Storage {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer idStorage;

    @ManyToOne( targetEntity = Branch.class )
    private Branch branch;
}
