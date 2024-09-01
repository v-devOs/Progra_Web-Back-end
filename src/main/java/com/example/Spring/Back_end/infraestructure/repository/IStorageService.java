package com.example.Spring.Back_end.infraestructure.repository;

import com.example.Spring.Back_end.domain.entity.Storage;
import com.example.Spring.Back_end.presentation.dto.StorageDTO;

public interface IStorageService {
    public StorageDTO save(Storage storage);
}
