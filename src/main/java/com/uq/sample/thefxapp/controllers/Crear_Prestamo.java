package com.uq.sample.thefxapp.controllers;

import com.uq.sample.thefxapp.model.Biblioteca.Biblioteca;
import com.uq.sample.thefxapp.model.Biblioteca.Estudiante;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;

import static com.uq.sample.thefxapp.controllers.Alert.showAlert;

public class Crear_Prestamo {
    @FXML
    public TextField espacio_Estudiante_Registrado;
    @FXML
    public TextField espacio_Codigo_Prestamo;
    @FXML
    private TextField espacio_Fecha_Inicio;
    @FXML
    private TextField espacio_Fecha_Final;
    @FXML
    private TextField espacio_Cantidad_Libro;
    @FXML
    private TextField espacio_Precio_Por_Dia;

    public void crearPrestamo() {
        String codigo_Prestamo = espacio_Codigo_Prestamo.getText();
        LocalDate fechaInicio = LocalDate.parse(espacio_Fecha_Inicio.getText());
        LocalDate fechaFinal = LocalDate.parse(espacio_Fecha_Final.getText());
        String CantidadLibro = espacio_Cantidad_Libro.getText();
        float precioPorDia = Float.parseFloat(espacio_Precio_Por_Dia.getText());
        String estudianteNombre = espacio_Estudiante_Registrado.getText();
        Estudiante estudiante = Biblioteca.findEstudianteByName(estudianteNombre);

        // Log the values to check for null or empty fields
        System.out.println("Codigo: " + codigo_Prestamo);
        System.out.println("Fecha Inicio: " + fechaInicio);
        System.out.println("Fecha Final : " + fechaFinal);
        System.out.println("Estudiante Registrado: "+ estudiante);
        System.out.println("Cantidad Libro: " + CantidadLibro);
        System.out.println("Precio por Dia: " + precioPorDia);

        try {
            if (codigo_Prestamo.isEmpty() || espacio_Fecha_Inicio.getText().isEmpty() || espacio_Fecha_Final.getText().isEmpty() || CantidadLibro.isEmpty() || espacio_Precio_Por_Dia.getText().isEmpty()) {
                showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "All fields must be filled out");
                return;
            }
        } catch (NullPointerException e) {
            showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "All fields must be filled out");
            return;
        } catch (Exception e) {
            showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "Error: " + e.getMessage());
            return;
        }

        Biblioteca.agregarPrestamo(codigo_Prestamo, fechaInicio, fechaFinal, CantidadLibro, precioPorDia, estudiante);
        showAlert(javafx.scene.control.Alert.AlertType.INFORMATION, "Success", "Prestamo guardado");
    }

}



