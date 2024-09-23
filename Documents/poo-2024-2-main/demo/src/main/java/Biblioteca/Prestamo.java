package Biblioteca;

import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Prestamo {
    private StringProperty codigo;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    public StringProperty getCodigo() {
        return codigo;
    }

    public void setCodigo(StringProperty codigo) {
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

    public Prestamo(StringProperty codigo, LocalDate fechaInicio, LocalDate fechaFinal) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }
}