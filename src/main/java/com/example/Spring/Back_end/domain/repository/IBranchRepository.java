package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBranchRepository  extends JpaRepository<Branch, Integer> {
}
