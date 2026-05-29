package com.app.domain.model;

import java.util.List;

import com.app.domain.valueobjects.EditorialActas;
import com.app.domain.valueobjects.FechaFinal;
import com.app.domain.valueobjects.FechaInicio;
import com.app.domain.valueobjects.LugarCelebracion;
import com.app.domain.valueobjects.NombrePublicacion;
import com.app.domain.valueobjects.PaisCelebracion;
import com.app.domain.valueobjects.TipoPublicacion;

public class PublicacionCongreso extends Publicacion {

    private TipoPublicacion tipo;
    private FechaInicio fechaInicio;
    private FechaFinal fechaFin;
    private LugarCelebracion lugarCelebracion;
    private PaisCelebracion paisCelebracion;
    private EditorialActas editorialActas;

    public PublicacionCongreso(
            NombrePublicacion nombre,
            TipoPublicacion tipo,
            FechaInicio fechaInicio,
            FechaFinal fechaFin,
            LugarCelebracion lugarCelebracion,
            PaisCelebracion paisCelebracion,
            EditorialActas editorialActas,
            List<Profesor> autores,
            List<LineasDeInvestigacion> lineasDeInvestigacion
    ) {

        super(nombre, autores, lineasDeInvestigacion);

        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.lugarCelebracion = lugarCelebracion;
        this.paisCelebracion = paisCelebracion;
        this.editorialActas = editorialActas;
    }
}
