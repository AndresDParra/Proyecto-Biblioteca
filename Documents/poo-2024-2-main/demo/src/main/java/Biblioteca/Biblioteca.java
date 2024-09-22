package Biblioteca;

import Bibllioteca.Prestamo;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.List;

public class Biblioteca {
    private StringProperty nombre;
    private static List<Bibliotecario> bibliotecarios;
    private List<Libro> libros;
    private List<Estudiante> estudiantes;
    private List<DetallePrestamo> detallePrestamos;
    private List<Prestamo> prestamos;

    public StringProperty nombreBibliotecaProperty() {
        return nombre;
    }

    public void setNombre(StringProperty nombre) {
        this.nombre = nombre;
    }

    public List<Bibliotecario> bibliotecariosProperty() {
        return bibliotecarios;
    }

    public void setBibliotecarios(List<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public List<Libro> librosProperty() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Estudiante> estudiantesProperty() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<DetallePrestamo> detallePrestamosProperty() {
        return detallePrestamos;
    }

    public void setDetallePrestamos(List<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    public List<Prestamo> prestamosProperty() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Biblioteca(StringProperty nombre, List<Bibliotecario> bibliotecarios, List<Libro> libros, List<Estudiante> estudiantes, List<DetallePrestamo> detallePrestamos, List<Prestamo> prestamos) {
        this.nombre = nombre;
        this.bibliotecarios = bibliotecarios;
        this.libros = libros;
        this.estudiantes = estudiantes;
        this.detallePrestamos = detallePrestamos;
        this.prestamos = prestamos;
    }

    public static void agregarBibliotecario(StringProperty nombre, StringProperty correo, StringProperty cedula, StringProperty telefono, FloatProperty salario, LocalDate tiempoEnLaEmpresa) {

        Bibliotecario bibliotecario = new Bibliotecario(nombre, cedula, correo, telefono, salario, tiempoEnLaEmpresa);
        bibliotecarios.add(bibliotecario);

    }

    public void eliminarBibliotecario(Bibliotecario bibliotecario) {
        if (bibliotecarios.isEmpty()) {
            System.out.println("No hay bibliotecarios que borrar");
            return;
        }
        if (!bibliotecarios.contains(bibliotecario)) {
            System.out.println("El bibliotecario no se encuentra en la lista.");
        } else {
            bibliotecarios.remove(bibliotecario);
            System.out.println("Bibliotecario eliminado con éxito.");
        }
    }


    public void agregarLibro(StringProperty codigo, StringProperty isbn, StringProperty autor, StringProperty titulo, StringProperty editorial, LocalDate fechaPublicación, StringProperty unidadesDisponibles) {
        Libro libro = new Libro(codigo, isbn, titulo, autor, editorial, fechaPublicación, unidadesDisponibles);
        libros.add(libro);

    }

    public void eliminarLibro(Libro libro) {
        if (libros.isEmpty() || libros.equals(null)) {
            System.out.println("No hay libros que borrar");
            return;
        }
        if (!libros.contains(libro)) {
            System.out.println("el libro deseado no esta en la lista");
            return;
        }
        else{
            System.out.println("el libro ha sido borrado");
            libros.remove(libro);}
    }

    public void agregarEstudiante(StringProperty nombre, StringProperty cedula, StringProperty correo, StringProperty telefono){
        Estudiante estudiante = new Estudiante( nombre, cedula,correo, telefono);
        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        if (estudiantes.isEmpty() || estudiantes.equals(null)) {
            System.out.println("No hay libros que borrar");
            return;
        }
        if (!estudiantes.contains(estudiante)) {
            System.out.println("el libro deseado no esta en la lista");
        }
        estudiantes.remove(estudiante);
    }

    public void actualizarLibro(Libro libro, StringProperty autor, StringProperty codigo, StringProperty isbn, StringProperty editorial, StringProperty titulo, LocalDate fechaPublicación, StringProperty unidadesDisponibles){
        libro.setAutor(autor);
        libro.setCodigo(codigo);
        libro.setEditorial(editorial);
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setFechaPublicación(fechaPublicación);
        libro.setUnidadesDisponibles(unidadesDisponibles);
    }

    public Libro buscarLibro(Libro libro){
        String codigoAux = String.valueOf(libro.getCodigo());
        for (Libro libro1: libros){
            if (libro1.getCodigo().equals(codigoAux)){
                System.out.println(libro1);
                return libro1;
            }
        }


        return libro;
    }

}

