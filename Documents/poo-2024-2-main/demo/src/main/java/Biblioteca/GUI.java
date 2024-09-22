package Biblioteca;
import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;

public class BibliotecaFX extends Application {
    private TableView<Bibliotecario> bibliotecariosTable;
    private ObservableList<Bibliotecario> bibliotecariosList;

    private TextField nombreField;
    private TextField cedulaField;
    private TextField correoField;
    private TextField telefonoField;
    private TextField salarioField;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Library Management System");

        // Initialize the bibliotecarios list and table
        bibliotecariosList = FXCollections.observableArrayList();
        bibliotecariosTable = new TableView<>(bibliotecariosList);
        bibliotecariosTable.setMinWidth(600);

        // Define columns for the table
        TableColumn<Bibliotecario, String> nombreColumn = new TableColumn<>("Nombre");
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());

        TableColumn<Bibliotecario, String> cedulaColumn = new TableColumn<>("Cedula");
        cedulaColumn.setCellValueFactory(cellData -> cellData.getValue().cedulaProperty());

        TableColumn<Bibliotecario, String> correoColumn = new TableColumn<>("Correo");
        correoColumn.setCellValueFactory(cellData -> cellData.getValue().correoProperty());

        TableColumn<Bibliotecario, String> telefonoColumn = new TableColumn<>("Telefono");
        telefonoColumn.setCellValueFactory(cellData -> cellData.getValue().telefonoProperty());

        TableColumn<Bibliotecario, String> salarioColumn = new TableColumn<>("Salario");
        salarioColumn.setCellValueFactory(cellData -> cellData.getValue().salarioProperty().asString());

        bibliotecariosTable.getColumns().addAll(nombreColumn, cedulaColumn, correoColumn, telefonoColumn, salarioColumn);

        // Create input fields
        nombreField = new TextField();
        cedulaField = new TextField();
        correoField = new TextField();
        telefonoField = new TextField();
        salarioField = new TextField();

        // Create and configure the grid pane for input fields
        GridPane inputGrid = new GridPane();
        inputGrid.setPadding(new Insets(10));
        inputGrid.setHgap(10);
        inputGrid.setVgap(10);

        inputGrid.add(new Label("Nombre:"), 0, 0);
        inputGrid.add(nombreField, 1, 0);

        inputGrid.add(new Label("Cedula:"), 0, 1);
        inputGrid.add(cedulaField, 1, 1);

        inputGrid.add(new Label("Correo:"), 0, 2);
        inputGrid.add(correoField, 1, 2);

        inputGrid.add(new Label("Telefono:"), 0, 3);
        inputGrid.add(telefonoField, 1, 3);

        inputGrid.add(new Label("Salario:"), 0, 4);
        inputGrid.add(salarioField, 1, 4);

        // Create buttons
        Button addButton = new Button("Add Bibliotecario");
        Button deleteButton = new Button("Delete Selected Bibliotecario");

        // Set button actions
        addButton.setOnAction(e -> addBibliotecario());
        deleteButton.setOnAction(e -> deleteSelectedBibliotecario());

        // Arrange buttons in a horizontal box layout
        VBox buttonBox = new VBox(10);
        buttonBox.setPadding(new Insets(10));
        buttonBox.getChildren().addAll(addButton, deleteButton);

        // Main layout with VBox
        VBox mainLayout = new VBox(10);
        mainLayout.setPadding(new Insets(10));
        mainLayout.getChildren().addAll(inputGrid, buttonBox, bibliotecariosTable);

        // Set the scene and show the stage
        Scene scene = new Scene(mainLayout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to add a bibliotecario to the list
    private void addBibliotecario() {
        String nombre = nombreField.getText();
        String cedula = cedulaField.getText();
        String correo = correoField.getText();
        String telefono = telefonoField.getText();
        String salarioText = salarioField.getText();

        if (nombre.isEmpty() || cedula.isEmpty() || correo.isEmpty() || telefono.isEmpty() || salarioText.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Invalid Input", "Please fill all fields.");
            return;
        }

        try {
            double salario = Double.parseDouble(salarioText);
            Bibliotecario bibliotecario = new Bibliotecario(nombre, cedula, correo, telefono, salario, LocalDate.now());
            bibliotecariosList.add(bibliotecario);

            clearFields();
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Invalid Input", "Please enter a valid salary.");
        }
    }

    // Method to delete the selected bibliotecario
    private void deleteSelectedBibliotecario() {
        Bibliotecario selectedBibliotecario = bibliotecariosTable.getSelectionModel().getSelectedItem();
        if (selectedBibliotecario != null) {
            bibliotecariosList.remove(selectedBibliotecario);
        } else {
            showAlert(Alert.AlertType.WARNING, "No Selection", "Please select a bibliotecario to delete.");
        }
    }

    // Utility method to clear input fields
    private void clearFields() {
        nombreField.clear();
        cedulaField.clear();
        correoField.clear();
        telefonoField.clear();
        salarioField.clear();
    }

    // Utility method to show alerts
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}


