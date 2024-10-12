package com.uq.sample.thefxapp.controllers;

import com.uq.sample.thefxapp.model.Biblioteca.Biblioteca;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.stream.Stream;

import static com.uq.sample.thefxapp.controllers.Alert.showAlert;

public class Crear_Estudiante {
    @FXML
    public Button Button_Crear_Estudiante;
    @FXML
    private TextField espacio_Nombre;
    @FXML
    private TextField espacio_Cedula;
    @FXML
    private TextField espacio_Correo;
    @FXML
    private TextField espacio_Telefono;

    public Crear_Estudiante(TextField espacio_Nombre, TextField espacio_Cedula, TextField espacio_Correo, TextField espacio_Telefono) {
        this.espacio_Nombre = espacio_Nombre;
        this.espacio_Cedula = espacio_Cedula;
        this.espacio_Correo = espacio_Correo;
        this.espacio_Telefono = espacio_Telefono;
    }

    public Crear_Estudiante() {
    }

    public TextField getEspacio_Nombre() {
        return espacio_Nombre;
    }

    public void setEspacio_Nombre(TextField espacio_Nombre) {
        this.espacio_Nombre = espacio_Nombre;
    }

    public TextField getEspacio_Cedula() {
        return espacio_Cedula;
    }

    public void setEspacio_Cedula(TextField espacio_Cedula) {
        this.espacio_Cedula = espacio_Cedula;
    }

    public TextField getEspacio_Correo() {
        return espacio_Correo;
    }

    public void setEspacio_Correo(TextField espacio_Correo) {
        this.espacio_Correo = espacio_Correo;
    }

    public TextField getEspacio_Telefono() {
        return espacio_Telefono;
    }

    public void setEspacio_Telefono(TextField espacio_Telefono) {
        this.espacio_Telefono = espacio_Telefono;
    }

    public void crear_estudiante() {
        try {
            String nombre = espacio_Nombre.getText();
            String cedula = espacio_Cedula.getText();
            String correo = espacio_Correo.getText();
            String telefono = espacio_Telefono.getText();

            if (Stream.of(nombre, cedula, correo, telefono).anyMatch(String::isEmpty)) {
                showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "All fields must be filled out");
                return;
            }

            // Log the values to check for null or empty fields
            System.out.println("Nombre: " + nombre);
            System.out.println("Cedula: " + cedula);
            System.out.println("Correo: " + correo);
            System.out.println("Telefono: " + telefono);


            Biblioteca.agregarEstudiante(nombre, cedula, correo, telefono);

            showAlert(javafx.scene.control.Alert.AlertType.INFORMATION, "Success", "Estudiante guardado");
        }  catch (Exception e) {
            showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "Error: " + e.getMessage());
            //e.printStackTrace();
        }
    }
}
