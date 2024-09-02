package com.example.Spring.Back_end.presentation.dto;

import com.example.Spring.Back_end.domain.entity.Contact;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContactDTO {
    private Integer idContact;
    private String email;
    private String instagram;
    private String facebook;

    public ContactDTO(Contact contact) {
        this.idContact = contact.getIdContact();
        this.email = contact.getEmail();
        this.instagram = contact.getInstagram();
        this.facebook = contact.getFacebook();
    }
}
