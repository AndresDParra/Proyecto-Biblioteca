package com.uq.sample.thefxapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Gestion_Estudiante {

    public Button Button_Borrar_Estudiante;
    public Button Button_Crear_Estudiante;

    public void pasar_a_crear_estudiante(ActionEvent actionEvent)throws IOException {
        Stage stagePasarACrearEstudiante = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaCrearPrestamo = fxmlLoader.load(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_Crear_Estudiante.fxml"));
        Scene scene = new Scene(paginaCrearPrestamo, 500, 500);
        stagePasarACrearEstudiante.setScene(scene);
        stagePasarACrearEstudiante.show();
    }


    public void pasar_a_borrar_estudiante(ActionEvent actionEvent) throws IOException {
        Stage stagePasarACrearEstudiante = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaCrearPrestamo = fxmlLoader.load(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_Borrar_Estudiante.fxml"));
        Scene scene = new Scene(paginaCrearPrestamo, 500, 500);
        stagePasarACrearEstudiante.setScene(scene);
        stagePasarACrearEstudiante.show();
    }


    public void pasar_a_actualizar_estudiante(ActionEvent actionEvent) {
    }
}

