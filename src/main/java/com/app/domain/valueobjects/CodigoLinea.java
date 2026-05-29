package com.app.domain.valueobjects;

public record CodigoLinea(String value) {

    public CodigoLinea {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "El codigo de la linea no puede estar vacio"
            );
        }

        if (value.length() < 3) {
            throw new IllegalArgumentException(
                "El codigo debe tener minimo 3 caracteres"
            );
        }
    }
}
