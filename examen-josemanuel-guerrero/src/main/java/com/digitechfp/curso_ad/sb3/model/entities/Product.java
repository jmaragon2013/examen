package com.digitechfp.curso_ad.sb3.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "products", indexes = {
        @Index(name = "product_name_idx", columnList = "nombre", unique = true),
})
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_id_gen")
    @SequenceGenerator(name = "products_id_gen", sequenceName = "products_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, unique = true)
    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @Column(name = "precio", nullable = false)
    @Min(value = 0, message = "El precio no puede ser negativo")
    private int precio;

    @Column(name = "stock", nullable = false)
    @Min(value = 0, message = "El stock no puede ser negativo")
    private int stock;

    public int getPrice() {
        return precio;
    }
}
