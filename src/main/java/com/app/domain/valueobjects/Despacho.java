package com.app.domain.valueobjects;

public record Despacho(String value) {

    public Despacho {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El despacho no puede estar vacio"
            );
        }
    }
}