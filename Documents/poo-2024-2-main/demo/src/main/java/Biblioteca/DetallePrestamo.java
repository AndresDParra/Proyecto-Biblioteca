package Biblioteca;

import javafx.beans.property.FloatProperty;

public class DetallePrestamo {
    private String cantidadLibros;
    private float precioPorDia;

    public String getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(String cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public FloatProperty getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(float precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public DetallePrestamo(String cantidadLibros, float precioPorDia) {
        this.cantidadLibros = cantidadLibros;
        this.precioPorDia = precioPorDia;
    }
}
