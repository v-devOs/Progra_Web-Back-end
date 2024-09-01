package com.example.Spring.Back_end.presentation.dto;

import com.example.Spring.Back_end.domain.entity.Contact;
import com.example.Spring.Back_end.domain.entity.Direction;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
public class BranchDTO {
    private Integer idBranch;
    private String name;
    private Integer hour_start;
    private Integer hour_end;
    private Timestamp date_start;
    private Boolean active;
    private Contact contact;
    private Direction direction;
}
