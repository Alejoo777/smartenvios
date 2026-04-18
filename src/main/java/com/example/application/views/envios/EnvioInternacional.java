package com.example.application.views.envios;

public class EnvioInternacional extends Calculo implements ICalculo {

    private double tarifaBase;

    public EnvioInternacional() {
        super("Envío Internacional", "Exterior");
        this.tarifaBase = 20000;
    }

    @Override
    public String nombre() {
        return getNombre();
    }

    @Override
    public String categoria() {
        return getCategoria();
    }

    @Override
    public double calcular(double peso) {

        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
        }

        return tarifaBase + (peso * 3000) + 5000;
    }
}