package com.app.domain.valueobjects;

public record Telefono(String value) {

    public Telefono {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El telefono no puede estar vacio"
            );
        }

        if (value.length() < 7) {
            throw new IllegalArgumentException(
                "El telefono debe tener minimo 7 numeros"
            );
        }
    }
}
