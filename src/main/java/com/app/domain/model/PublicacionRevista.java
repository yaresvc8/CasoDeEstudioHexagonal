package com.app.domain.model;

import java.util.List;

public class PublicacionRevista extends Publicacion{
    private String editorial;
    private String volumen;
    private String numero;
    private String paginasInicio;
    private String paginasFin;

    public PublicacionRevista(String nombre, String editorial, String volumen, String numero, String paginasInicio, String paginasFin, List<Profesor> autores, List<LineasDeInvestigacion> lineasDeInvestigacion){
        super(nombre, autores, lineasDeInvestigacion);
        this.editorial = editorial;
        this.volumen = volumen;
        this.numero = numero;
        this.paginasInicio = paginasInicio;
        this.paginasFin = paginasFin;
    }
}
