package com.app.domain.model;

import java.sql.Timestamp;

public class Supervision {
    private final Profesor supervisor;
    private final Profesor supervisado;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;

    public Supervision (Profesor supervisor, Profesor supervisado, Timestamp fechaInicio, Timestamp fechaFin) throws Exception {
        if(supervisor.isEsDoctor() && !supervisado.isEsDoctor()){
            this.supervisor = supervisor;
            this.supervisado = supervisado;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;

        }else{
            throw new Exception("El supervisor debe ser un profesor con título de doctor y el supervisado no debe ser un profesor con título de doctor.");
        }
    }

    // Obtener los días de supervisión
    public int getDiasDeSupervision(){
        return (int) ((fechaFin.getTime() - fechaInicio.getTime()) / (1000 * 60 * 60 * 24));
    }
}
