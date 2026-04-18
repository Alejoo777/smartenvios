package com.example.application.views.envios;

public interface ICalculo {

    String nombre();

    String categoria();

    double calcular(double valor);

    default String etiqueta() {
        return nombre() + " - " + categoria();
    }
}