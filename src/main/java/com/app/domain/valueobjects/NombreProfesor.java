package com.app.domain.valueobjects;

public record NombreProfesor(String value) {

    public NombreProfesor {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El nombre del profesor no puede estar vacio"
            );
        }
    }
}
