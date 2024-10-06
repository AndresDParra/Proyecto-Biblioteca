package com.uq.sample.thefxapp.model.Biblioteca;

import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.List;

public class Prestamo {
    private String codigo;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private List<Estudiante> estudiantesRegistrados;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Prestamo(String codigo, LocalDate fechaInicio, LocalDate fechaFinal, List<Estudiante> estudiantesRegistrados) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estudiantesRegistrados = estudiantesRegistrados;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "codigo='" + codigo + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                ", estudiantesRegistrados=" + estudiantesRegistrados +
                '}';
    }
    public static Prestamo getPrestamoSample(){
        return new Prestamo("123", LocalDate.now(), LocalDate.now().plusDays(7), List.of(Estudiante.getSampleEstudiante()));
    }
}