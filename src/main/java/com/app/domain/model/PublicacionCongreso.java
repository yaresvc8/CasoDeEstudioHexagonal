package com.app.domain.model;

import java.sql.Timestamp;
import java.util.List;

public class PublicacionCongreso extends Publicacion {
    private String tipo;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private String lugarCelebracion;
    private String PaisCelebracion;
    private String editorialActas;

    public PublicacionCongreso (String nombre, String tipo, Timestamp fechaInicio, Timestamp fechaFin, String lugarCelebracion, String paisCelebracion, List<Profesor> autores, List<LineasDeInvestigacion> lineasDeInvestigacion) {
        super(nombre, autores, lineasDeInvestigacion);
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.lugarCelebracion = lugarCelebracion;
        PaisCelebracion = paisCelebracion;
    }

}
