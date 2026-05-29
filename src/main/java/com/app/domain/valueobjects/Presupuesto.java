package com.app.domain.valueobjects;

public record Presupuesto(double value) {

    public Presupuesto {

        if (value <= 0) {
            throw new IllegalArgumentException(
                "El presupuesto debe ser mayor que cero"
            );
        }
    }
}