package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Branch;
import com.example.Spring.Back_end.domain.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IStorageRepository extends JpaRepository<Storage, Integer> {
    public List<Storage> findByBranch( Branch branch );
}
