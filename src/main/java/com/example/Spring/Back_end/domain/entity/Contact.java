package com.example.Spring.Back_end.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Contact {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer idContact;

    @Column(nullable = false)
    private String tel;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String instagram;

    @Column(nullable = false)
    private String facebook;
}
