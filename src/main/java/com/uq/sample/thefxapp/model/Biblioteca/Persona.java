package com.uq.sample.thefxapp.model.Biblioteca;

import javafx.beans.property.StringProperty;

public class Persona {
    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;

    public String nombreProperty() {
        return nombre;
    }

    public void  setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String cedulaProperty() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String correoProperty() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String telefonoProperty() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona(String nombre, String cedula, String correo, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
