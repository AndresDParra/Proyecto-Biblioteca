package Biblioteca;

import java.time.LocalDate;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Bibliotecario> bibliotecarios;
    private List<Libro> libros;
    private List<Estudiante> estudiantes;
    private List<DetallePrestamo> detallePrestamos;
    private List<Prestamo> prestamos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(List<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    public void setDetallePrestamos(List<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Biblioteca(String nombre, List<Bibliotecario> bibliotecarios, List<Libro> libros, List<Estudiante> estudiantes, List<DetallePrestamo> detallePrestamos, List<Prestamo> prestamos) {
        this.nombre = nombre;
        this.bibliotecarios = bibliotecarios;
        this.libros = libros;
        this.estudiantes = estudiantes;
        this.detallePrestamos = detallePrestamos;
        this.prestamos = prestamos;
    }

    public void agregarBibliotecario(String nombre, String correo, String cedula, String telefono, Float salario, LocalDate tiempoEnLaEmpresa) {

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


    public void agregarLibro(String codigo, String isbn, String autor, String titulo, String editorial, LocalDate fechaPublicación, String unidadesDisponibles) {
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
        }
        libros.remove(libro);
    }

    public void agregarEstudiante(String nombre, String cedula, String correo, String telefono){
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

    public void actualizarLibro(Libro libro, String autor, String codigo, String isbn, String editorial, String titulo, LocalDate fechaPublicación, String unidadesDisponibles){
        libro.setAutor(autor);
        libro.setCodigo(codigo);
        libro.setEditorial(editorial);
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setFechaPublicación(fechaPublicación);
        libro.setUnidadesDisponibles(unidadesDisponibles);
    }

}

