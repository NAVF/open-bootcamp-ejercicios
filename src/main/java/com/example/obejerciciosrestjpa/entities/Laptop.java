package com.example.obejerciciosrestjpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "ordenadores")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private Float costo;
    private String color;

    public Laptop() {}

    public Laptop(Long id, String marca, Float costo, String color) {
        this.id = id;
        this.marca = marca;
        this.costo = costo;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
