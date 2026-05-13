package com.app.domain.model;

public class Profesor {
    private String nombre;
    private String apellido;
    private String despacho;
    private String telefono;
    private boolean esDoctor;

    public Profesor (String nombre, String apellido, String despacho, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.despacho = despacho;
        this.telefono = telefono;
        esDoctor = false;
    }
}
