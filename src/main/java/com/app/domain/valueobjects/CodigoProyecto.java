package com.app.domain.valueobjects;

public record CodigoProyecto(String value) {

    public CodigoProyecto {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El codigo del proyecto no puede estar vacio"
            );
        }
    }
}
