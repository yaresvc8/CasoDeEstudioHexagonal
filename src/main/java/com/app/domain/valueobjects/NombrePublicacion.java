package com.app.domain.valueobjects;

public record NombrePublicacion(String value) {

    public NombrePublicacion {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El nombre de la publicacion no puede estar vacio"
            );
        }
    }
}