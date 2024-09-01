package com.example.Spring.Back_end.domain.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@Entity
public class Branch {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer idBranch;

    private String name;

    private Integer hour_start;

    private Integer hour_end;

    private Timestamp date_start;

    private Boolean active;

    @OneToOne( targetEntity = Contact.class, cascade = {CascadeType.PERSIST})
    @JoinColumn( name = "id_contact")
    private Contact contact;

    @OneToOne( targetEntity = Direction.class, cascade = {CascadeType.PERSIST})
    @JoinColumn( name = "id_direction")
    private Direction direction;
}
