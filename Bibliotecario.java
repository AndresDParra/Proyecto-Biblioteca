package Biblioteca;

import java.time.LocalDate;

public class Bibliotecario extends Persona {
    public Float salario;
    public LocalDate tiempoEnLaEmpresa;

    public Bibliotecario(String nombre, String cedula, String correo, String telefono) {
        super(nombre, cedula, correo, telefono);
    }


    public void agregarPrestamo(){

    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public LocalDate getTiempoEnLaEmpresa() {
        return tiempoEnLaEmpresa;
    }

    public void setTiempoEnLaEmpresa(LocalDate tiempoEnLaEmpresa) {
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
    }

    public Bibliotecario(String nombre, String cedula, String correo, String telefono, Float salario, LocalDate tiempoEnLaEmpresa) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
        this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
    }
}
