package com.example.Spring.Back_end.logic.service;

import com.example.Spring.Back_end.domain.entity.Employee;
import com.example.Spring.Back_end.domain.repository.IEmployeeRepository;
import com.example.Spring.Back_end.infraestructure.mapper.EmployeeMapper;
import com.example.Spring.Back_end.infraestructure.repository.IEmployeeService;
import com.example.Spring.Back_end.presentation.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    IEmployeeRepository employeeRepository;
    EmployeeMapper employeeMapper;

    @Override
    public EmployeeDTO save(Employee employee) {
        employeeRepository.save(employee);
        return employeeMapper.toDTO(employee);
    }

    public EmployeeService(
            @Autowired IEmployeeRepository employeeRepository,
            @Autowired EmployeeMapper employeeMapper
    ){
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }
}
