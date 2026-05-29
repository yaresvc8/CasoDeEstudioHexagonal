package com.app.domain.valueobjects;

public record PaginaFin(String value) {

    public PaginaFin {

        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(
                "La pagina final no puede estar vacia"
            );
        }
    }
}