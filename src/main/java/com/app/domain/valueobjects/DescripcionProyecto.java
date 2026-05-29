package com.app.domain.valueobjects;

public record DescripcionProyecto(String value) {

    public DescripcionProyecto {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "La descripcion no puede estar vacia"
            );
        }
    }
}