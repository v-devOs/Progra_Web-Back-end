package com.example.Spring.Back_end.infraestructure.repository;

import com.example.Spring.Back_end.domain.entity.Employee;
import com.example.Spring.Back_end.presentation.dto.EmployeeDTO;

public interface IEmployeeService {
    public EmployeeDTO save(Employee employee);
}
