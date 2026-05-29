package com.app.domain.model;

import java.util.List;

import com.app.domain.valueobjects.NombrePublicacion;

public class Publicacion {

    private NombrePublicacion nombre;
    private List<Profesor> autores;
    private List<LineasDeInvestigacion> lineasDeInvestigacion;

    public Publicacion(
            NombrePublicacion nombre,
            List<Profesor> autores,
            List<LineasDeInvestigacion> lineasDeInvestigacion
    ) {

        this.nombre = nombre;
        this.autores = autores;
        this.lineasDeInvestigacion = lineasDeInvestigacion;
    }
}