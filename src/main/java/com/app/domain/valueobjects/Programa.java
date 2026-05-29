package com.app.domain.valueobjects;

public record Programa(String value) {

    public Programa {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El programa no puede estar vacio"
            );
        }
    }
}