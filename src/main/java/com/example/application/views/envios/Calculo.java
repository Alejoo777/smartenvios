package com.example.application.views.envios;

public abstract class Calculo {

    private String nombre;
    private String categoria;

    public Calculo(String nombre, String categoria) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    protected String formatearResultado(double valor) {
        return String.format("$ %,.2f", valor);
    }
}