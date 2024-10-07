package com.uq.sample.thefxapp.controllers;

import com.uq.sample.thefxapp.model.Biblioteca.Biblioteca;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.stream.Stream;

import static com.uq.sample.thefxapp.controllers.Alert.showAlert;

public class Guardar_Libro {
    public Button Guardar_libro;
    @FXML
    private TextField Espacio_codigo;
    @FXML
    private TextField Espacio_ISBN;
    @FXML
    private TextField Espacio_autor;
    @FXML
    private TextField Espacio_Titulo;
    @FXML
    private TextField Espacio_Editorial;
    @FXML
    private TextField Fecha_de_publicacion;
    @FXML
    private TextField Espacio_unidades_existentes;

    @FXML
    public void guardar_libro(ActionEvent event) {
        try {
            String codigo_libro = Espacio_codigo.getText();
            String ISBN_libro = Espacio_ISBN.getText();
            String autor_libro = Espacio_autor.getText();
            String Titulo_libro = Espacio_Titulo.getText();
            String editorial_libro = Espacio_Editorial.getText();
            String fecha_publicacion_text = Fecha_de_publicacion.getText();
            String cantidad_libro = Espacio_unidades_existentes.getText();

            if (Stream.of(codigo_libro, ISBN_libro, autor_libro, Titulo_libro, editorial_libro, fecha_publicacion_text, cantidad_libro).anyMatch(String::isEmpty)) {
                showAlert(Alert.AlertType.ERROR, "Error", "All fields must be filled out");
                return;
            }

            // Log the values to check for null or empty fields
            System.out.println("Codigo: " + codigo_libro);
            System.out.println("ISBN: " + ISBN_libro);
            System.out.println("Autor: " + autor_libro);
            System.out.println("Titulo: " + Titulo_libro);
            System.out.println("Editorial: " + editorial_libro);
            System.out.println("Fecha de Publicacion: " + fecha_publicacion_text);
            System.out.println("Cantidad: " + cantidad_libro);


            LocalDate fecha_publicacion_libro = LocalDate.parse(fecha_publicacion_text);

            Biblioteca.agregarLibro(codigo_libro, ISBN_libro, autor_libro, Titulo_libro, editorial_libro, fecha_publicacion_libro, cantidad_libro);

            showAlert(Alert.AlertType.INFORMATION, "Success", "Libro guardado");
        } catch (DateTimeParseException e) {
             showAlert(Alert.AlertType.ERROR, "Error", "Error: Fecha de publicación debe ser una fecha válida (yyyy-MM-dd).");
            //e.printStackTrace();
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Error: " + e.getMessage());
            //e.printStackTrace();
        }


    }


}
