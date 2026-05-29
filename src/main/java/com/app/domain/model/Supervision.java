package com.app.domain.model;

import java.time.temporal.ChronoUnit;

import com.app.domain.valueobjects.FechaFinal;
import com.app.domain.valueobjects.FechaInicio;

public class Supervision {

    private final Profesor supervisor;
    private final Profesor supervisado;
    private FechaInicio fechaInicio;
    private FechaFinal fechaFin;

    public Supervision(
            Profesor supervisor,
            Profesor supervisado,
            FechaInicio fechaInicio,
            FechaFinal fechaFin
    ) throws Exception {

        if (supervisor.isEsDoctor() && !supervisado.isEsDoctor()) {

            this.supervisor = supervisor;
            this.supervisado = supervisado;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;

        } else {

            throw new Exception(
                "El supervisor debe ser doctor y el supervisado no debe ser doctor."
            );
        }
    }

    public long getDiasDeSupervision() {

        return ChronoUnit.DAYS.between(
                fechaInicio.value(),
                fechaFin.value()
        );
    }
}
