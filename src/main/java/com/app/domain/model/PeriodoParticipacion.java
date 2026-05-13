package com.app.domain.model;

import java.sql.Timestamp;


public class PeriodoParticipacion {
    private Timestamp fechaInicio;
    private Timestamp fechaFinal;
    private String periodo;

    public PeriodoParticipacion(Timestamp fechaInicio, Timestamp fechaFinal, String periodo) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.periodo = periodo;
    }
}
