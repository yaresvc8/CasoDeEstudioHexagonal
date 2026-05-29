package com.app.domain.valueobjects;

public record ApellidoProfesor(String value) {

    public ApellidoProfesor {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El apellido del profesor no puede estar vacio"
            );
        }
    }
}
