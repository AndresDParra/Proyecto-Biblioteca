package Biblioteca;

import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Libro {
    private StringProperty codigo;
    private StringProperty isbn;
    private StringProperty autor;
    private StringProperty titulo;
    private StringProperty editorial;
    private LocalDate fechaPublicación;
    private StringProperty unidadesDisponibles;

    public Libro(StringProperty codigo, StringProperty isbn, StringProperty autor, StringProperty titulo, StringProperty editorial, LocalDate fechaPublicación, StringProperty unidadesDisponibles) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fechaPublicación = fechaPublicación;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public StringProperty getCodigo() {
        return codigo;
    }

    public void setCodigo(StringProperty codigo) {
        this.codigo = codigo;
    }

    public StringProperty getIsbn() {
        return isbn;
    }

    public void setIsbn(StringProperty isbn) {
        this.isbn = isbn;
    }

    public StringProperty getAutor() {
        return autor;
    }

    public void setAutor(StringProperty autor) {
        this.autor = autor;
    }

    public StringProperty getTitulo() {
        return titulo;
    }

    public void setTitulo(StringProperty titulo) {
        this.titulo = titulo;
    }

    public StringProperty getEditorial() {
        return editorial;
    }

    public void setEditorial(StringProperty editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicación() {
        return fechaPublicación;
    }

    public void setFechaPublicación(LocalDate fechaPublicación) {
        this.fechaPublicación = fechaPublicación;
    }

    public StringProperty getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(StringProperty unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
}
