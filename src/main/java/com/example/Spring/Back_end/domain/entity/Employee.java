package com.example.Spring.Back_end.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@Entity
public class Employee {
    @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer idEmployee;

    private String noEmployee;

    private Character gender;

    private String name;

    private String surname;

    private String second_surname;

    private Timestamp date_start;

    private Timestamp date_end;

    private String tel;

    @ManyToOne( targetEntity = Storage.class)
    private Storage storage;
}
