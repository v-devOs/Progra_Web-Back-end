package com.example.Spring.Back_end.domain.repository;

import com.example.Spring.Back_end.domain.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactRepository extends JpaRepository<Contact, Integer> {
}
