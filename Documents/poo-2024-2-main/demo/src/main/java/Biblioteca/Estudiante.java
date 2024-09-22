package Biblioteca;

import javafx.beans.property.StringProperty;

public class Estudiante extends Persona {
    public Estudiante(StringProperty nombre, StringProperty cedula, StringProperty correo, StringProperty telefono) {
        super(nombre, cedula, correo, telefono);
    }

}
