package Biblioteca;

import javafx.beans.property.StringProperty;

public class Persona {
    private StringProperty nombre;
    private StringProperty cedula;
    private StringProperty correo;
    private StringProperty telefono;

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void  setNombre(StringProperty nombre) {
        this.nombre = nombre;
    }

    public StringProperty cedulaProperty() {
        return cedula;
    }

    public void setCedula(StringProperty cedula) {
        this.cedula = cedula;
    }

    public StringProperty correoProperty() {
        return correo;
    }

    public void setCorreo(StringProperty correo) {
        this.correo = correo;
    }

    public StringProperty telefonoProperty() {
        return telefono;
    }

    public void setTelefono(StringProperty telefono) {
        this.telefono = telefono;
    }

    public Persona(StringProperty nombre, StringProperty cedula, StringProperty correo, StringProperty telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }
}
