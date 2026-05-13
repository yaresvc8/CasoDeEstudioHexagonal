package com.app.domain.model;

import java.sql.Timestamp;

public class Proyecto {
    private String codigo;
    private String nombre;
    private String acronimo;
    private double presupuestoTotal;
    private String programa;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private String descripcion;
    private final Profesor investigadorPrincipal;

    public Proyecto(String codigo, String nombre, String acronimo, double presupuestoTotal, String programa, Timestamp fechaInicio, Timestamp fechaFin, String descripcion, Profesor investigadorPrincipal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.acronimo = acronimo;
        this.presupuestoTotal = presupuestoTotal;
        this.programa = programa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.investigadorPrincipal = investigadorPrincipal;
    }

}
