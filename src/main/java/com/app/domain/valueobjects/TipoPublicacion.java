package com.app.domain.valueobjects;

public record TipoPublicacion(String value) {

    public TipoPublicacion {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El tipo de publicacion no puede estar vacio"
            );
        }
    }
}