package com.example.Spring.Back_end.presentation.dto;

import com.example.Spring.Back_end.domain.entity.Storage;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
public class EmployeeDTO {
    private Integer idEmployee;
    private String noEmployee;
    private Character gender;
    private String name;
    private String surname;
    private String second_surname;
    private Timestamp date_start;
    private Timestamp date_end;
    private String tel;
    private Storage storage;
}
