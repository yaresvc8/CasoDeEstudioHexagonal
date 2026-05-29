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

