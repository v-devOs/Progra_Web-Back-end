package com.example.Spring.Back_end.logic.service;

import com.example.Spring.Back_end.domain.entity.Contact;
import com.example.Spring.Back_end.domain.repository.IContactRepository;
import com.example.Spring.Back_end.domain.repository.IProductRepository;
import com.example.Spring.Back_end.infraestructure.repository.IContactService;
import com.example.Spring.Back_end.presentation.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService implements IContactService {

    IContactRepository contactRepository;

    @Override
    public ContactDTO save(Contact contact) {
      ContactDTO contactRes;

      contactRepository.save(contact);
      contactRes = new ContactDTO(contact);

      return contactRes;
    }

    public ContactService(
            @Autowired
            IContactRepository contactRepository
    ){
        this.contactRepository = contactRepository;
    }

}
