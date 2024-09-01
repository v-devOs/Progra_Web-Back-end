package com.example.Spring.Back_end.presentation.dto;

import com.example.Spring.Back_end.domain.entity.Branch;
import com.example.Spring.Back_end.domain.entity.Storage;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StorageDTO {
    private Integer idStorage;
    private Branch branch;

    public StorageDTO(Storage storage) {
        this.idStorage = storage.getIdStorage();
        this.branch = storage.getBranch();
    }
}
