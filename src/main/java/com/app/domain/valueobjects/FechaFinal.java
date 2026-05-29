package com.app.domain.valueobjects;

import java.time.LocalDate;

public record FechaFinal(LocalDate value) {

    public FechaFinal {

        if (value == null) {
            throw new IllegalArgumentException(
                "La fecha final no puede ser nula"
            );
        }
    }
}