package com.uq.sample.thefxapp.model.Biblioteca;

import javafx.beans.property.StringProperty;

public class Estudiante extends Persona {
    public Estudiante(String nombre, String cedula, String correo, String telefono) {
        super(nombre, cedula, correo, telefono);
    }

    public static Estudiante getSampleEstudiante() {
        return new Estudiante("Pedro", "23456", "mike@cakc", "234567");
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", cedula='" + getCedula() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                '}';
    }
    }
