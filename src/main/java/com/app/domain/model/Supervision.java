package com.app.domain.model;

import java.sql.Timestamp;

public class Supervision {
    private final Profesor supervisor;
    private final Profesor supervisado;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;

    public Supervision (Profesor supervisor, Profesor supervisado, Timestamp fechaInicio, Timestamp fechaFin){
        this.supervisor = supervisor;
        this.supervisado = supervisado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

    }
}
