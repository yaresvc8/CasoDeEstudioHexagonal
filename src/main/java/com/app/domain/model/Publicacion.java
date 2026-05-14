package com.app.domain.model;

import java.util.List;

public class Publicacion {
    private String nombre;
    private List<Profesor> autores;
    private List<LineasDeInvestigacion> lineasDeInvestigacion;

    public Publicacion(String nombre, List<Profesor> autores, List<LineasDeInvestigacion> lineasDeInvestigacion) {
        this.nombre = nombre;
        this.autores = autores;
        this.lineasDeInvestigacion = lineasDeInvestigacion;
    }
}
