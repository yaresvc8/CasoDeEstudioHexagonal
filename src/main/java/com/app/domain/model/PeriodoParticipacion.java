package com.app.domain.model;

import com.app.domain.valueobjects.FechaFinal;
import com.app.domain.valueobjects.FechaInicio;
import com.app.domain.valueobjects.Periodo;

public class PeriodoParticipacion {

    private FechaInicio fechaInicio;
    private FechaFinal fechaFinal;
    private Periodo periodo;

    public PeriodoParticipacion(
            FechaInicio fechaInicio,
            FechaFinal fechaFinal,
            Periodo periodo
    ) {

        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.periodo = periodo;
    }
}