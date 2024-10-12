package com.uq.sample.thefxapp.controllers;

import com.uq.sample.thefxapp.model.Biblioteca.Biblioteca;
import com.uq.sample.thefxapp.model.Biblioteca.Estudiante;
import com.uq.sample.thefxapp.model.Biblioteca.Libro;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static com.uq.sample.thefxapp.controllers.Alert.showAlert;

public class Borrar_Estudiante {
    public TextField espacio_nombre_estudiante;
    public TextField espacio_cedula_estudiante;
    public Button Button_buscar_Estudiante;
    public Button Button_Borrar_Estudiante;
    public TextArea Area_Info_Estudiante;

    public Borrar_Estudiante(TextField espacio_nombre_estudiante, TextField espacio_cedula_estudiante, Button button_buscar_Estudiante, Button button_Borrar_Estudiante, TextArea area_Info_Estudiante) {
        this.espacio_nombre_estudiante = espacio_nombre_estudiante;
        this.espacio_cedula_estudiante = espacio_cedula_estudiante;
        Button_buscar_Estudiante = button_buscar_Estudiante;
        Button_Borrar_Estudiante = button_Borrar_Estudiante;
        Area_Info_Estudiante = area_Info_Estudiante;
    }

    public Borrar_Estudiante() {
    }

    public void buscar_Estudiante(ActionEvent actionEvent) {
        String nombre = espacio_nombre_estudiante.getText();
        String cedula = espacio_cedula_estudiante.getText();
        boolean libroEncontrado = false;

        if (nombre == null || cedula == null || nombre.isEmpty() || cedula.isEmpty()) {
            showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "Codigo and Titulo must not be empty");
            return;
        }

        try {
            for (Estudiante estudiante : Biblioteca.getEstudiantes()) {
                if (estudiante.getNombre().equals(nombre) && estudiante.getCedula().equals(cedula)) {
                    libroEncontrado = true;
                    if (Area_Info_Estudiante != null) {
                        Area_Info_Estudiante.setText(estudiante.toString());
                    }
                    break;
                }
            }
        } catch (Exception e) {
            showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "An error occurred: " + e.getMessage());
            return;
        }

        showAlert(libroEncontrado ? javafx.scene.control.Alert.AlertType.INFORMATION : javafx.scene.control.Alert.AlertType.ERROR,
                libroEncontrado ? "Success" : "Error",
                libroEncontrado ? "Estudiante encontrado" : "Estudiante no encontrado");
    }


    public void borrar_Estudiante(ActionEvent actionEvent) {
         if (espacio_nombre_estudiante.getText() == null || espacio_nombre_estudiante.getText().isEmpty()||espacio_cedula_estudiante.getText() == null || espacio_cedula_estudiante.getText().isEmpty()) {
            showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", "Codigo and Titulo must not be empty");
            return;
        }
        for (Estudiante estudiante : Biblioteca.getEstudiantes()) {
            if (estudiante.getNombre().equals(espacio_nombre_estudiante.getText())) {
                Biblioteca.getEstudiantes().remove(estudiante);
                showAlert(javafx.scene.control.Alert.AlertType.INFORMATION, "Success", "Estudiante eliminado");
                return;
            }
        }
    }
}
