package com.app.domain.valueobjects;

public record NombreProyecto(String value) {

    public NombreProyecto {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El nombre del proyecto no puede estar vacio"
            );
        }
    }
}
