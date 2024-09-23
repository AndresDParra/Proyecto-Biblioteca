package Biblioteca;

import javafx.beans.property.ListProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

import java.time.LocalDate;

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

    public static class Prestamo {
        private StringProperty codigo;
        private LocalDate fechaInicio;
        private LocalDate fechaFinal;
        private ListProperty<Estudiante> estudiantesRegistrados;

        public String getCodigo() {
            return codigo.get();
        }

        public StringProperty codigoProperty() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo.set(codigo);
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

        public ObservableList<Estudiante> getEstudiantesRegistrados() {
            return estudiantesRegistrados.get();
        }

        public ListProperty<Estudiante> estudiantesRegistradosProperty() {
            return estudiantesRegistrados;
        }

        public void setEstudiantesRegistrados(ObservableList<Estudiante> estudiantesRegistrados) {
            this.estudiantesRegistrados.set(estudiantesRegistrados);
        }

        public Prestamo(StringProperty codigo, LocalDate fechaInicio, LocalDate fechaFinal, ListProperty<Estudiante> estudiantesRegistrados) {
            this.codigo = codigo;
            this.fechaInicio = fechaInicio;
            this.fechaFinal = fechaFinal;
            this.estudiantesRegistrados = estudiantesRegistrados;
        }

        public Prestamo(StringProperty codigo, LocalDate fechaInicio, LocalDate fechaFinal) {
            this.codigo = codigo;
            this.fechaInicio = fechaInicio;
            this.fechaFinal = fechaFinal;
        }
    }
}
