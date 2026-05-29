package com.app.domain.valueobjects;

public record LugarCelebracion(String value) {

    public LugarCelebracion {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El lugar de celebracion no puede estar vacio"
            );
        }
    }
}