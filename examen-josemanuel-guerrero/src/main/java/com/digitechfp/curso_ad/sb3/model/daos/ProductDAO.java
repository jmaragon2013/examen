package com.digitechfp.curso_ad.sb3.model.daos;

import com.digitechfp.curso_ad.sb3.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductDAO extends JpaRepository<Product, Integer> {

    // Buscar producto por nombre
    Optional<Product> findByNombre(String nombre);

    // Buscar productos con precio menor a un valor dado
    @Query("SELECT p FROM Product p WHERE p.precio < :precioMax")
    List<Product> findByPrecioLessThan(int precioMax);
}

