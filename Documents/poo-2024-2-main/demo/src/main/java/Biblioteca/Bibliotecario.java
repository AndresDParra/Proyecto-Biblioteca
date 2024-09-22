package Biblioteca;
import Bibllioteca.Prestamo;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Bibliotecario extends Persona {
    public FloatProperty salario;
    public LocalDate tiempoEnLaEmpresa;

    public Bibliotecario(StringProperty nombre, StringProperty cedula, StringProperty correo, StringProperty telefono) {
        super(nombre, cedula, correo, telefono);
    }


    public void agregarPrestamo(StringProperty codigo, LocalDate fechaInincio, LocalDate fechaEntrega){
        Prestamo prestamo = new Prestamo(codigo, fechaInincio, fechaEntrega);
    }

    public FloatProperty salarioProperty() {
        return salario;
    }

    public void setSalario(FloatProperty salario) {
        this.salario = salario;
    }

    public LocalDate getTiempoEnLaEmpresa() {
        return tiempoEnLaEmpresa;
    }

    public void setTiempoEnLaEmpresa(LocalDate tiempoEnLaEmpresa) {
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
    }

    public Bibliotecario(StringProperty nombre, StringProperty cedula, StringProperty correo, StringProperty telefono, FloatProperty salario, LocalDate tiempoEnLaEmpresa) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
    }
}
