package com.app.domain.valueobjects;

import java.time.LocalDate;

public record FechaInicio(LocalDate value) {

    public FechaInicio {

        if (value == null) {
            throw new IllegalArgumentException(
                "La fecha de inicio no puede ser nula"
            );
        }
    }
}