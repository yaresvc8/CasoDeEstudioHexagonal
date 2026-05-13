package com.app.domain.model;

import java.sql.Timestamp;

public class PublicacionCongreso extends Publicacion {
    private String Tipo;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private String lugarCelebracion;
    private String PaisCelebracion;
    private String editorialActas;

    public PublicacionCongreso (String nombre, String tipo, Timestamp fechaInicio, Timestamp fechaFin, String lugarCelebracion, String paisCelebracion) {
        super(nombre);
        Tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.lugarCelebracion = lugarCelebracion;
        PaisCelebracion = paisCelebracion;
    }

}
