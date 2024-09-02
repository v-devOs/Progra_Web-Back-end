package com.example.Spring.Back_end.logic.service;

import com.example.Spring.Back_end.domain.repository.IProductStorageRepository;
import com.example.Spring.Back_end.infraestructure.repository.IProductStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductStorageService implements IProductStorageService {

    IProductStorageRepository productStorageRepository;

    public ProductStorageService(
            @Autowired IProductStorageRepository productStorageRepository
    ) { this.productStorageRepository = productStorageRepository; }


}
