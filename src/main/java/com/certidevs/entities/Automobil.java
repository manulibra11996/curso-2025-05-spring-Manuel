package com.certidevs.entities;

import jakarta.persistence.*;

@Entity // indica que esta clase es una tabla
@Table(name = "Automobiles") // personaliza el nombre de la tabla
public class Automobil {

    @Id // indica que este atributo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String modelo;

    private String marca;

    private Integer caballos;

    private Double  precio;

    private Boolean electrico;

    public Automobil() {

    }

    public Automobil(String modelo, String marca, Integer caballos, Double precio, Boolean electrico) {
        this.modelo = modelo;
        this.marca = marca;
        this.caballos = caballos;
        this.precio = precio;
        this.electrico = electrico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCaballos() {
        return caballos;
    }

    public void setCaballos(Integer caballos) {
        this.caballos = caballos;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getElectrico() {
        return electrico;
    }

    public void setElectrico(Boolean electrico) {
        this.electrico = electrico;
    }

    @Override
    public String toString() {
        return "El automobil con indentificador" + id  + " es el modelo " + modelo + " de la marca " + marca + " .Tiene " + caballos + " caballos de potencia, cuyo precio es "
                + precio + (electrico?" y es electrico.":" y no es electrico.");
    }


}
