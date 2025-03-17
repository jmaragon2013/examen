package com.digitechfp.curso_ad.sb3.services.dtos;

import com.digitechfp.curso_ad.sb3.model.entities.Product;
import lombok.Data;

@Data
public class ProductDTO {
    private Integer id;
    private String name;
    private int price;
    private int stock;


    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getNombre();
        this.price = product.getPrecio();
        this.stock = product.getStock();
    }
}
