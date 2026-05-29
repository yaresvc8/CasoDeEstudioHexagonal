package com.app.domain.valueobjects;

public record Periodo(String value) {

    public Periodo {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El periodo no puede estar vacio"
            );
        }
    }
}