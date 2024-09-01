package com.example.Spring.Back_end.infraestructure.mapper;

import com.example.Spring.Back_end.domain.entity.Employee;
import com.example.Spring.Back_end.presentation.dto.EmployeeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    private final ModelMapper modelMapper;


    public EmployeeDTO toDTO(Employee employee) {
        return modelMapper.map(employee, EmployeeDTO.class);
    }

    public EmployeeMapper(
            @Autowired ModelMapper modelMapper
    ) {
        this.modelMapper = modelMapper;
    }

}
