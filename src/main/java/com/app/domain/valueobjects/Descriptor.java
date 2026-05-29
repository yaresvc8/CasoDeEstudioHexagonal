package com.app.domain.valueobjects;

public record Descriptor(String value) {

    public Descriptor {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El descriptor no puede estar vacio"
            );
        }
    }
}