package com.example.application.views.envios;

import java.util.List;

public class CalculosPredefinidos {

    public static List<ICalculo> obtenerCalculos() {
        return List.of(
                new EnvioUrbano(),
                new EnvioNacional(),
                new EnvioInternacional()
        );
    }
}