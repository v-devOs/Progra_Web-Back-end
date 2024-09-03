package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
