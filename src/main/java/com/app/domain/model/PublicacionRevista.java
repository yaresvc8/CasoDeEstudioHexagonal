package com.app.domain.model;

import java.util.List;

import com.app.domain.valueobjects.Editorial;
import com.app.domain.valueobjects.NombrePublicacion;
import com.app.domain.valueobjects.NumeroRevista;
import com.app.domain.valueobjects.PaginaFin;
import com.app.domain.valueobjects.PaginaInicio;
import com.app.domain.valueobjects.Volumen;

public class PublicacionRevista extends Publicacion {

    private Editorial editorial;
    private Volumen volumen;
    private NumeroRevista numero;
    private PaginaInicio paginaInicio;
    private PaginaFin paginaFin;

    public PublicacionRevista(
            NombrePublicacion nombre,
            Editorial editorial,
            Volumen volumen,
            NumeroRevista numero,
            PaginaInicio paginaInicio,
            PaginaFin paginaFin,
            List<Profesor> autores,
            List<LineasDeInvestigacion> lineasDeInvestigacion) {

        super(nombre, autores, lineasDeInvestigacion);

        this.editorial = editorial;
        this.volumen = volumen;
        this.numero = numero;
        this.paginaInicio = paginaInicio;
        this.paginaFin = paginaFin;
    }
}
