package com.digitechfp.curso_ad.sb3.controllers;

import com.digitechfp.curso_ad.sb3.model.entities.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    // Lista simulada de productos
    private final List<Product> products = new ArrayList<>();



    // Endpoint para listar todos los productos
    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    // Endpoint para listar productos con precio menor a un valor dado
    @GetMapping("/under/{price}")
    public List<Product> getProductsUnderPrice(@PathVariable int price) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < price) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
