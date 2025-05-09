package com.certidevs.repositories;

import com.certidevs.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    // spring boot implementa métodos básicos:
    // findAll(), findById(), save(), delete(), etc...

}
