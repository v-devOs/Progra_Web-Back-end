package com.example.Spring.Back_end.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
@Entity
public class Order {
    @Id @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer idOrder;

    @Column(nullable = false)
    private Timestamp date;

    private Boolean status;

    @ManyToOne( targetEntity = Branch.class )
    @JoinColumn(name = "id_branch")
    private Branch branch;
}
