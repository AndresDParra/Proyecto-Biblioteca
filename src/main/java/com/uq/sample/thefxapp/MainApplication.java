package com.uq.sample.thefxapp;

import com.uq.sample.thefxapp.model.Biblioteca.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Biblioteca biblioteca = new Biblioteca(
                "biblioteca", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        primaryStage.setTitle("Library Management System");
        FXMLLoader fxmlLoader = new FXMLLoader();
        URL fxmlLocation = getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/PrimeraPagina.fxml");
        if (fxmlLocation == null) {
            throw new IOException("FXML file not found: /com/uq/sample/thefxapp/view/FrontEnd/PrimeraPagina.fxml");
        }
        Parent root = fxmlLoader.load(fxmlLocation);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        biblioteca.setLibros(Biblioteca.getLibros());
    }

    public static void main(String[] args) {
        launch(args);
    }
}