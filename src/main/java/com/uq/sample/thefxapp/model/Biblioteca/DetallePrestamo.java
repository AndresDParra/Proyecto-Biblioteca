package com.uq.sample.thefxapp.model.Biblioteca;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.StringProperty;

public class DetallePrestamo {
    private String cantidadLibros;
    private float precioPorDia;

    public String getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(String cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public Float getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(Float precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public DetallePrestamo(String cantidadLibros, float precioPorDia) {
        this.cantidadLibros = cantidadLibros;
        this.precioPorDia = precioPorDia;
    }

    @Override
    public String toString() {
        return "DetallePrestamo{" +
                "cantidadLibros=" + cantidadLibros +
                ", precioPorDia=" + precioPorDia +
                '}';
    }
    public static DetallePrestamo getSampleDetallePrestamo() {
        return new DetallePrestamo("3", 24.4f);
    }
}
