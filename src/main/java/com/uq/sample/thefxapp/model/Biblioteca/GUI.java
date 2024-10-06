package com.uq.sample.thefxapp.model.Biblioteca;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
    private TableView<Bibliotecario> bibliotecariosTable;
    private ObservableList<Bibliotecario> bibliotecariosList;

    private TextField nombreField;
    private TextField cedulaField;
    private TextField correoField;
    private TextField telefonoField;
    private TextField salarioField;
    private TextField tiempoEnLaEmpresaField;
    private IntegerProperty tiempoEnLaEmpresa;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Library Management System");

        // Initialize the bibliotecarios list and table
        bibliotecariosList = FXCollections.observableArrayList();
        bibliotecariosTable = new TableView<>(bibliotecariosList);

        // Initialize the text fields
        nombreField = new TextField();
        cedulaField = new TextField();
        correoField = new TextField();
        telefonoField = new TextField();
        salarioField = new TextField();
        tiempoEnLaEmpresaField = new TextField();

        VBox vbox = new VBox(bibliotecariosTable, nombreField, cedulaField, correoField, telefonoField, salarioField, tiempoEnLaEmpresaField);
        Scene scene = new Scene(vbox, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

