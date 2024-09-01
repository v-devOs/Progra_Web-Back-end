package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}
