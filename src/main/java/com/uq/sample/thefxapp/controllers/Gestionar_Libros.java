package com.uq.sample.thefxapp.controllers;

import com.uq.sample.thefxapp.model.Biblioteca.Biblioteca;
import com.uq.sample.thefxapp.model.Biblioteca.Libro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static com.uq.sample.thefxapp.controllers.Alert.showAlert;

public class Gestionar_Libros {
    public Button Button_para_borrar_libro;
    @FXML
    private TextArea Area_Del_Libro;
    @FXML
    private TextField espacio_codigo;
    @FXML
    private TextField espacio_Titulo;

    public Gestionar_Libros(TextArea area_Del_Libro, TextField espacio_codigo, TextField espacio_Titulo) {
        Area_Del_Libro = area_Del_Libro;
        this.espacio_codigo = espacio_codigo;
        this.espacio_Titulo = espacio_Titulo;
    }

    public Gestionar_Libros() {
    }

    public void buscar_Libro(ActionEvent actionEvent) {
        String codigo = espacio_codigo.getText();
        String titulo = espacio_Titulo.getText();
        boolean libroEncontrado = false;

        if (codigo == null || titulo == null || codigo.isEmpty() || titulo.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error", "Codigo and Titulo must not be empty");
            return;
        }

        try {
            for (Libro libro : Biblioteca.getLibros()) {
                if (libro.getCodigo().equals(codigo) && libro.getTitulo().equals(titulo)) {
                    libroEncontrado = true;
                    if (Area_Del_Libro != null) {
                        Area_Del_Libro.setText(libro.toString());
                    }
                    break;
                }
            }
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred: " + e.getMessage());
            return;
        }

        showAlert(libroEncontrado ? Alert.AlertType.INFORMATION : Alert.AlertType.ERROR,
                libroEncontrado ? "Success" : "Error",
                libroEncontrado ? "Libro encontrado" : "Libro no encontrado");
    }

    @FXML
    public void borrar_Libro(ActionEvent event) {
        if (espacio_codigo.getText() == null || espacio_codigo.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error", "Codigo must not be empty");
            return;
        }
        for (Libro libro : Biblioteca.getLibros()) {
            if (libro.getCodigo().equals(espacio_codigo.getText())) {
                Biblioteca.getLibros().remove(libro);
                showAlert(Alert.AlertType.INFORMATION, "Success", "Libro eliminado");
                return;
            }
        }


    }
}
