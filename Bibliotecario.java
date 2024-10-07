package com.uq.sample.thefxapp.model.Biblioteca;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.List;

public class Bibliotecario extends Persona {
    public Float salario;
    public String tiempoEnLaEmpresa;

    public Bibliotecario(String nombre, String cedula, String correo, String telefono) {
        super(nombre, cedula, correo, telefono);
    }

    public Bibliotecario(String nombre, String cedula, String correo, String telefono, Float salario, String tiempoEnLaEmpresa) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
    }

    public static Bibliotecario getSampleBibliotecario() {
        return new Bibliotecario("Juan", "123456", "longthy", "123456", 1000.0f, "2 años");
    }


    public void crearPrestamoYDetallePrestamo(String codigo, LocalDate fechaInicio, LocalDate fechaFinal, List<Estudiante> estudiantesRegistrados, String numeroDeLibros, Float precioPorDia ){
        Prestamo prestamo = new Prestamo(codigo, fechaInicio, fechaFinal, estudiantesRegistrados);
        DetallePrestamo detallePrestamo = new DetallePrestamo(numeroDeLibros, precioPorDia);
    }

    public Float salarioProperty() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String tiempoEnLaEmpresaProperty() {return tiempoEnLaEmpresa;
    }

    public void setTiempoEnLaEmpresa(String tiempoEnLaEmpresa) {
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "salario=" + salario +
                ", tiempoEnLaEmpresa='" + tiempoEnLaEmpresa + '\'' +
                '}';
    }
}
