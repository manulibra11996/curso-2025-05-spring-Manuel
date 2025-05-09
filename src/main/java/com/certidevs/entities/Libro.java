package com.certidevs.entities;

import jakarta.persistence.*;

@Entity // indica que esta clase es una tabla
@Table(name = "libros") // personaliza el nombre de la tabla
public class Libro {

    @Id // indica que este atributo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String titulo;

    private String autor;

    private Integer numeroPaginas;

    private Boolean disponible;

    // constructor vacío
    public Libro () {}

    // contructor con valores
    public Libro(String titulo, String autor, Integer numeroPaginas, Boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponible = disponible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "El libro con id: " + id + " se llama " + titulo +
                " y fue escrito por " + autor + ". Tiene " + numeroPaginas +
                " paginas y " + (disponible?"esta disponible":"no esta disponible");
    }
}
