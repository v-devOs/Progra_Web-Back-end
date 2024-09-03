package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepository extends JpaRepository<User, Integer> {

    @Query(" select idUser from User order by idUser desc limit 1")
    public Integer findLatestSave();
}
