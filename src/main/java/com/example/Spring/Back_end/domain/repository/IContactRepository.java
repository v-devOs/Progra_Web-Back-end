package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IContactRepository extends JpaRepository<Contact, Integer> {

    @Query("select idContact from Contact order by idContact desc limit 1")
    public Integer findLatestSave();
}
