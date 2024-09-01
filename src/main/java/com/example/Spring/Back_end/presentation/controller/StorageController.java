package com.example.Spring.Back_end.presentation.controller;

import com.example.Spring.Back_end.domain.entity.Storage;
import com.example.Spring.Back_end.infraestructure.repository.IStorageService;
import com.example.Spring.Back_end.presentation.dto.StorageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Target;

@RestController("/product")
public class StorageController {

    IStorageService storageService;

    @PostMapping("/product")
    public StorageDTO save(@RequestBody Storage storage) {
        return storageService.save(storage);
    }


    public StorageController(
            @Autowired
            IStorageService storageService) {
        this.storageService = storageService;
    }
}
