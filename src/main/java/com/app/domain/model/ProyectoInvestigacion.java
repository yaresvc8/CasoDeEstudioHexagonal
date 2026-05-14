package com.app.domain.model;

import java.sql.Timestamp;
import java.util.List;

public class ProyectoInvestigacion {
    private String codigo;
    private String nombre;
    private String acronimo;
    private double presupuestoTotal;
    private String programa;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private String descripcion;
    private final Profesor investigadorPrincipal;
    private List<Publicacion> ListaDePublicaciones;
    private List<Profesor> Investigadores;

    public ProyectoInvestigacion(String codigo, String nombre, String acronimo, double presupuestoTotal, String programa, Timestamp fechaInicio, Timestamp fechaFin, String descripcion, Profesor investigadorPrincipal) {
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
