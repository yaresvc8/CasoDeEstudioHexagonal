package com.app.domain.valueobjects;

public record PaginaInicio(String value) {

    public PaginaInicio {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "La pagina de inicio no puede estar vacia"
            );
        }
    }
}
