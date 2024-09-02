package com.example.Spring.Back_end.domain.entity;

import com.example.Spring.Back_end.domain.embedded.ProductStorageEmbedded;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProductStorage {
    @EmbeddedId
    ProductStorageEmbedded productStorageId;

    private Integer stock;

    @MapsId("idProduct")
    @ManyToOne( targetEntity = Product.class )
    @JoinColumn( name = "id_product")
    private Product product;

    @MapsId("idStorage")
    @ManyToOne( targetEntity = Storage.class )
    @JoinColumn( name = "id_storage")
    private Storage storage;
}
