package com.app.domain.valueobjects;

public record NombreLinea(String value) {

    public NombreLinea {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El nombre de la linea no puede estar vacio"
            );
        }
    }
}