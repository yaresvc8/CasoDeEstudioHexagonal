package com.app.domain.model;

import java.util.List;

import com.app.domain.valueobjects.CodigoLinea;
import com.app.domain.valueobjects.NombreLinea;
import com.app.domain.valueobjects.Descriptor;

public class LineasDeInvestigacion {

    private CodigoLinea codigo;
    private NombreLinea nombre;
    private List<Descriptor> descriptores;
    private Profesor profesor;

   public LineasDeInvestigacion(
        CodigoLinea codigo,
        NombreLinea nombre,
        List<Descriptor> descriptores,
        Profesor profesor
    ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descriptores = descriptores;
        this.profesor = profesor;
   }
}

// Fallback simple implementations to avoid unresolved import errors when
// com.app.domain.valueobjects package is not available. These are package-
// private and used only to allow compilation; replace with real value object
// implementations when available.
class CodigoLinea {
    private final String value;
    CodigoLinea(String v) { this.value = v; }
    public String getValue() { return value; }
}

class NombreLinea {
    private final String value;
    NombreLinea(String v) { this.value = v; }
    public String getValue() { return value; }
}

class Descriptor {
    private final String value;
    Descriptor(String v) { this.value = v; }
    public String getValue() { return value; }
}

class Profesor {
    private final String nombre;
    Profesor(String n) { this.nombre = n; }
    public String getNombre() { return nombre; }
}
