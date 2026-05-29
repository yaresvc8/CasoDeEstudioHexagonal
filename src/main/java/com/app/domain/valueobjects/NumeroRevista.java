package com.app.domain.valueobjects;

public record NumeroRevista(String value) {

    public NumeroRevista {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El numero de la revista no puede estar vacio"
            );
        }
    }
}