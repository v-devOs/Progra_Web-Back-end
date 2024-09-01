package com.example.Spring.Back_end.infraestructure.repository;

import com.example.Spring.Back_end.domain.entity.Contact;
import com.example.Spring.Back_end.presentation.dto.ContactDTO;

public interface IContactService {
    public ContactDTO save(Contact contact);
}
