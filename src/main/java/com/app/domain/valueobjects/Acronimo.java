package com.app.domain.valueobjects;

public record Acronimo(String value) {

    public Acronimo {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El acronimo no puede estar vacio"
            );
        }
    }
}
