package com.uq.sample.thefxapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Pagina_Libros {

    private TextField Espacio_codigo;

    @FXML
    public void pasar_a_gestionar_libro(ActionEvent actionEvent) throws IOException {
        Stage stagePasarBorrarLibro = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaBorrarLibro = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_Gestionar_Libro.fxml")));
        Scene scene = new Scene(paginaBorrarLibro, 500, 500);
        stagePasarBorrarLibro.setScene(scene);
        stagePasarBorrarLibro.show();
    }
    @FXML
    public void pasar_a_guardar_libro(ActionEvent actionEvent) throws IOException {
        Stage stagePasarGuardarLibro = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaGuardarLibro = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_GuardarLibro.fxml")));
        Scene scene = new Scene(paginaGuardarLibro, 500, 500);
        stagePasarGuardarLibro.setScene(scene);
        stagePasarGuardarLibro.show();
    }

    public void reemplazar_Libro(ActionEvent actionEvent) {
        // Implementation needed
    }

    public void prestamos_Por_Libro(ActionEvent actionEvent) {
        // Implementation needed
    }
}
