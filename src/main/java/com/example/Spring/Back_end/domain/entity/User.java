package com.example.Spring.Back_end.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class User {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer idUser;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private Boolean active;

    @Column(nullable = false)
    private String rol;

    @OneToOne
    @JoinColumn( name = "id_employee")
    private Employee employee;

}
