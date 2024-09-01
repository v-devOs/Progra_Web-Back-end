package com.example.Spring.Back_end.application.service;

import com.example.Spring.Back_end.domain.entity.Storage;
import com.example.Spring.Back_end.domain.repository.IStorageRepository;
import com.example.Spring.Back_end.infraestructure.repository.IStorageService;
import com.example.Spring.Back_end.presentation.dto.StorageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageService implements IStorageService {

    private final IStorageRepository storageRepository;

    @Override
    public StorageDTO save(Storage storage) {
        StorageDTO storageRes;

        storageRepository.save(storage);

        storageRes = new StorageDTO(storage);
        return storageRes;
    }

    public StorageService(
            @Autowired IStorageRepository storageRepository
    ){ this.storageRepository = storageRepository; }
}
