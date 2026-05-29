package com.app.domain.valueobjects;

public record Editorial(String value) {

    public Editorial {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "La editorial no puede estar vacia"
            );
        }
    }
}
