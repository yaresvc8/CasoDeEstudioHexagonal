package com.app.domain.model;

import com.app.domain.valueobjects.ApellidoProfesor;
import com.app.domain.valueobjects.Despacho;
import com.app.domain.valueobjects.NombreProfesor;
import com.app.domain.valueobjects.Telefono;

public class Profesor {

    private NombreProfesor nombre;
    private ApellidoProfesor apellido;
    private Despacho despacho;
    private Telefono telefono;
    private boolean esDoctor;

    public Profesor(
            NombreProfesor nombre,
            ApellidoProfesor apellido,
            Despacho despacho,
            Telefono telefono
    ) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.despacho = despacho;
        this.telefono = telefono;
        this.esDoctor = false;
    }

    public NombreProfesor getNombre() {
        return nombre;
    }

    public ApellidoProfesor getApellido() {
        return apellido;
    }

    public Despacho getDespacho() {
        return despacho;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public boolean isEsDoctor() {
        return esDoctor;
    }
}