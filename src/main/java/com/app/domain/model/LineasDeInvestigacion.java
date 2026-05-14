package com.app.domain.model;

import java.util.List;

public class LineasDeInvestigacion {
    private String codigo;
    private String nombre;
    private List<String> descriptores;
    private Profesor profesor;

    public LineasDeInvestigacion (String codigo, String nombre, List<String> descriptores, Profesor profesor){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descriptores = descriptores;
        this.profesor = profesor;
    }
}
