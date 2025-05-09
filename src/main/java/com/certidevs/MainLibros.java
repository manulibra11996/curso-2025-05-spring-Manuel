package com.certidevs;

import com.certidevs.entities.Libro;
import com.certidevs.repositories.LibroRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class MainLibros {

    public static void main(String[] args) {
        // inicializar spring
        ApplicationContext spring = SpringApplication.run(Main.class, args);

        // obtener repositorio (lo crea spring)
        LibroRepository libroRepository = spring.getBean(LibroRepository.class);

        // crear libros
        Libro java = new Libro("Curso de programación Java (MANUALES IMPRESCINDIBLES)", "Mariona Nadal", 456, true);
        Libro sql = new Libro("SQL para Principiantes: Libro práctico: Más de 50 ejercicios para aprender programando", "Gabriel Moroni", 215, true);
        Libro html = new Libro("HTML: La guía completa de la programación Web para principiantes. Aprende a programar con ejercicios y ejemplos de código", "Adam J. Smith", 108, true);

        // guardar libros
        libroRepository.save(java);
        libroRepository.save(sql);
        libroRepository.save(html);
    }
}
