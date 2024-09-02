package com.example.Spring.Back_end.domain.embedded;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class ProductStorageEmbedded {
    private Integer idProduct;
    private Integer idStorage;
}
