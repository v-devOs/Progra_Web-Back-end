package com.example.Spring.Back_end.presentation.controller;

import com.example.Spring.Back_end.domain.entity.Employee;
import com.example.Spring.Back_end.infraestructure.repository.IEmployeeService;
import com.example.Spring.Back_end.presentation.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    IEmployeeService employeeService;


    @PostMapping("/employee")
    EmployeeDTO saveEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    public EmployeeController(
            @Autowired IEmployeeService employeeService
    ) {
        this.employeeService = employeeService;
    }
}
