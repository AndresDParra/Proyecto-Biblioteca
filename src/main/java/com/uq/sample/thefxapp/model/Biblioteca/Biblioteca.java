package com.uq.sample.thefxapp.model.Biblioteca;

import javafx.beans.property.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private ArrayList<Bibliotecario> bibliotecarios;
    private static ArrayList<Libro> libros;
    private static ArrayList<Estudiante> estudiantes;
    private ArrayList<DetallePrestamo> detallePrestamos;
    private ArrayList<Prestamo> prestamos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Bibliotecario> getBibliotecarios() {
        return (ArrayList<Bibliotecario>) bibliotecarios;
    }

    public void setBibliotecarios(ArrayList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public static ArrayList<Libro> getLibros() { return (ArrayList<Libro>) libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public static ArrayList<Estudiante> getEstudiantes() {
        return (ArrayList<Estudiante>) estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<DetallePrestamo> getDetallePrestamos() {
        return (ArrayList<DetallePrestamo>) detallePrestamos;
    }

    public void setDetallePrestamos(ArrayList<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return (ArrayList<Prestamo>) prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Biblioteca(String nombre, ArrayList<Bibliotecario> bibliotecarios, ArrayList<Libro> libros, ArrayList<Estudiante> estudiantes, ArrayList<DetallePrestamo> detallePrestamos, ArrayList<Prestamo> prestamos) {
        this.nombre = nombre;
        this.bibliotecarios = bibliotecarios;
        this.libros = libros;
        this.estudiantes = estudiantes;
        this.detallePrestamos = detallePrestamos;
        this.prestamos = prestamos;
    }

    public void agregarBibliotecario(String nombre, String correo, String cedula, String telefono, Float salario, String tiempoEnLaEmpresa) {

        Bibliotecario bibliotecario = new Bibliotecario(nombre, correo, cedula, telefono, salario, tiempoEnLaEmpresa);
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


    public static void agregarLibro(String codigo, String isbn, String titulo, String autor , String editorial, LocalDate fechaPublicación, String unidadesDisponibles) {
        Libro libro = new Libro(codigo, isbn, titulo, autor, editorial, fechaPublicación, unidadesDisponibles);
        Biblioteca.getLibros().add(libro);

    }

    public void eliminarLibro(Libro libro) {
        if (libros.isEmpty() || libros.equals(null)) {
            System.out.println("No hay libros que borrar");
            return;
        }
        if (!libros.contains(libro)) {
            System.out.println("el libro deseado no esta en la lista");
            return;
        } else {
            System.out.println("el libro ha sido borrado");
            libros.remove(libro);
        }
    }

    public static void agregarEstudiante(String nombre, String cedula, String correo, String telefono) {
        Estudiante estudiante = new Estudiante(nombre, cedula, correo, telefono);
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

    public void actualizarLibro(Libro libro, String autor, String codigo, String isbn, String editorial, String titulo, LocalDate fechaPublicación, String unidadesDisponibles) {
        libro.setAutor(autor);
        libro.setCodigo(codigo);
        libro.setEditorial(editorial);
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setFechaPublicación(fechaPublicación);
        libro.setUnidadesDisponibles(unidadesDisponibles);
    }

    public Object buscarLibro(Libro libro) {
        String codigoAux = String.valueOf(libro.getCodigo());
        for (Libro libro1 : libros) {
            if (libro1.getCodigo().equals(codigoAux)) {
                System.out.println(libro1);
                return libro1;
            }
        }


        return "";
    }

    public Object buscarEstudiantesMasPrestamos(Estudiante estudiante, ListProperty<Estudiante> estudiantesRegistrados) {

        String codigoAux = String.valueOf(estudiante.nombreProperty());
        for (Estudiante estudiante1 : estudiantesRegistrados) {
            if (estudiante1.nombreProperty().equals(codigoAux)) {
                System.out.println(estudiante1);
                return estudiante1;
            }

        }
        return "";
    }

    public Object calcularPrecioFinalPrestamo(LocalDate fechaInicio, LocalDate fechaFinal){
        long diferenciaDeFechas = ChronoUnit.DAYS.between(fechaInicio, fechaFinal);
        return diferenciaDeFechas;
    }

    public Float obtenerPrecioTotal(DetallePrestamo detallePrestamo, LocalDate fechaInicio, LocalDate fechaFinal){
        Float diasTotales = (Float) calcularPrecioFinalPrestamo(fechaFinal, fechaInicio);
        Float valorTotal =  detallePrestamo.getPrecioPorDia()*(diasTotales);
        return valorTotal;
    }

   public FloatProperty obtenerTotalRecaudo(FloatProperty valorTotal) {
    // Get the float value from valorTotal
    float total = valorTotal.get();

    // Multiply the total by the size of prestamos
    float totalRecaudoValue = total * prestamos.size();

    // Create a new FloatProperty with the calculated value
    FloatProperty totalRecaudo = new SimpleFloatProperty(totalRecaudoValue);

    return totalRecaudo;
    }

    public Float calcularPorcentajeDeAumento(LocalDate fechaInicio, LocalDate fechaFinal){
        Float diferenciaDeFechas = (float) ChronoUnit.YEARS.between(fechaInicio, fechaFinal);

        return diferenciaDeFechas;
    }

    public Float calcularBonusEmpleado(Bibliotecario bibliotecario, LocalDate fechaInicio, LocalDate fechaFinal){
       Float bonuses = (float) (bibliotecario.salario + bibliotecario.salario * 0.02 * calcularPorcentajeDeAumento(fechaInicio, fechaFinal));

        return bonuses;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", bibliotecarios=" + bibliotecarios +
                ", estudiantes=" + estudiantes +
                ", detallePrestamos=" + detallePrestamos +
                ", prestamos=" + prestamos +
                '}';
    }
}

