package com.uq.sample.thefxapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Gestion_Estudiante {

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
        Parent paginaCrearPrestamo = fxmlLoader.load(getClass().getResource(""));
        Scene scene = new Scene(paginaCrearPrestamo, 500, 500);
        stagePasarACrearEstudiante.setScene(scene);
        stagePasarACrearEstudiante.show();
    }

    public void pasar_a_actualizar_estudiante(ActionEvent actionEvent) {
    }

    public static class Borrar_Estudiante {
    }
}
