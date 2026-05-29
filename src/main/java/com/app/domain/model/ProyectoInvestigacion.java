package com.app.domain.model;

import java.util.List;

import com.app.domain.valueobjects.Acronimo;
import com.app.domain.valueobjects.CodigoProyecto;
import com.app.domain.valueobjects.DescripcionProyecto;
import com.app.domain.valueobjects.FechaFinal;
import com.app.domain.valueobjects.FechaInicio;
import com.app.domain.valueobjects.NombreProyecto;
import com.app.domain.valueobjects.Presupuesto;
import com.app.domain.valueobjects.Programa;

public class ProyectoInvestigacion {

    private CodigoProyecto codigo;
    private NombreProyecto nombre;
    private Acronimo acronimo;
    private Presupuesto presupuestoTotal;
    private Programa programa;
    private FechaInicio fechaInicio;
    private FechaFinal fechaFin;
    private DescripcionProyecto descripcion;

    private final Profesor investigadorPrincipal;

    private List<Publicacion> listaDePublicaciones;
    private List<Profesor> investigadores;

    public ProyectoInvestigacion(
            CodigoProyecto codigo,
            NombreProyecto nombre,
            Acronimo acronimo,
            Presupuesto presupuestoTotal,
            Programa programa,
            FechaInicio fechaInicio,
            FechaFinal fechaFin,
            DescripcionProyecto descripcion,
            Profesor investigadorPrincipal
    ) {

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