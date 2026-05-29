package com.app.domain.valueobjects;

public record PaisCelebracion(String value) {

    public PaisCelebracion {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El pais de celebracion no puede estar vacio"
            );
        }
    }
}

