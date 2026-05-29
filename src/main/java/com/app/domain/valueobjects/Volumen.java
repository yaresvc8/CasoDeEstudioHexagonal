package com.app.domain.valueobjects;

public record Volumen(String value) {

    public Volumen {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El volumen no puede estar vacio"
            );
        }
    }
}
