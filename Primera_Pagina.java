package com.uq.sample.thefxapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Primera_Pagina {

    public Button Button_Para_Borrar_libro;
    public Button button1;
    public Button button3;
    public Label the_label;
    public Button Button_Reporte;


    public void pasar_a_opciones_libro(ActionEvent actionEvent) throws IOException {
        Stage stagePasarGuardarLibro = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_libros.fxml"));
        Parent paginaGuardarLibro = fxmlLoader.load();
        Scene scene = new Scene(paginaGuardarLibro, 500, 500);
        stagePasarGuardarLibro.setScene(scene);
        stagePasarGuardarLibro.show();
    }


    @FXML
    public void pasar_a_crear_prestamo(ActionEvent actionEvent) throws IOException {
        Stage stagePasarACrearPresatamo = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaCrearPrestamo = fxmlLoader.load(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_Crear_Prestamo.fxml"));
        Scene scene = new Scene(paginaCrearPrestamo, 500, 500);
        stagePasarACrearPresatamo.setScene(scene);
        stagePasarACrearPresatamo.show();
    }
    @FXML
    public void pasar_reporte(ActionEvent actionEvent) throws IOException {
        Stage stageARevisarHistorial = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaBorrarLibro = fxmlLoader.load(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_reporte.fxml"));
        Scene scene = new Scene(paginaBorrarLibro, 500, 500);
        stageARevisarHistorial.setScene(scene);
        stageARevisarHistorial.show();
    }
    
    public void pasar_a_opciones_estudiantes(ActionEvent actionEvent) throws IOException {
        Stage stagePasarGuardarLibro = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_Estudiantes.fxml"));
        Parent paginaGuardarLibro = fxmlLoader.load();
        Scene scene = new Scene(paginaGuardarLibro, 500, 500);
        stagePasarGuardarLibro.setScene(scene);
        stagePasarGuardarLibro.show();
    }
}
