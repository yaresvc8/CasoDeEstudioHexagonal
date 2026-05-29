package com.app.domain.valueobjects;

public record EditorialActas(String value) {

    public EditorialActas {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "La editorial de actas no puede estar vacia"
            );
        }
    }
}