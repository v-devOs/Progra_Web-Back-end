package com.example.Spring.Back_end.presentation.controller;

import com.example.Spring.Back_end.domain.entity.Contact;
import com.example.Spring.Back_end.infraestructure.repository.IContactService;
import com.example.Spring.Back_end.presentation.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/contact")
public class ContactController {

    IContactService contactService;

    @PostMapping("/contact")
    public ContactDTO saveContact(@RequestBody Contact contact) {

        return contactService.save(contact);
    }

    public ContactController(
            @Autowired
            IContactService contactService
    ){
        this.contactService = contactService;
    }
}
