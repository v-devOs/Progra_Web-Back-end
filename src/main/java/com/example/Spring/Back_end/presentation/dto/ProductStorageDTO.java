package com.example.Spring.Back_end.presentation.dto;

import com.example.Spring.Back_end.domain.embedded.ProductStorageEmbedded;
import com.example.Spring.Back_end.domain.entity.Product;
import com.example.Spring.Back_end.domain.entity.ProductStorage;
import com.example.Spring.Back_end.domain.entity.Storage;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductStorageDTO {
    ProductStorageEmbedded productStorageId;
    private Integer stock;
    private Product product;
    private Storage storage;

    public ProductStorageDTO(ProductStorage productStorage) {
        this.productStorageId = productStorage.getProductStorageId();
        this.stock = productStorage.getStock();
        this.product = productStorage.getProduct();
        this.storage = productStorage.getStorage();
    }
}
