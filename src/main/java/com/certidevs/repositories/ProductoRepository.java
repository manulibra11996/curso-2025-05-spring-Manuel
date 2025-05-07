package com.certidevs.repositories;

import com.certidevs.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // spring boot implementa métodos básicos:
    // findAll(), findById(), save(), delete(), etc...

}