package com.uq.sample.thefxapp.controllers;

import com.uq.sample.thefxapp.model.Biblioteca.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class My_Controller {

    public TextField Espacio_Titulo;
    public Button Button_para_buscar_libro;
    public Button Button_;
    public Button Reemplazar_Libro;
    public Button Prestamos_Por_Libro;
    public Button button1;
    public Button Button_Para_Borrar_libro;
    public Button button3;
    public TextField Espacio_Editorial;
    @FXML
    private TextField Espacio_ISBN;

    @FXML
    private TextField Espacio_autor;

    @FXML
    private TextField Espacio_nombre;

    @FXML
    private TextField Fecha_de_publicacion;

    @FXML
    private TextField Espacio_codigo;

    @FXML
    private TextField Espacio_unidades_existentes;

    @FXML
    private Button Guardar_libro;
    @FXML
    private TextArea Area_Del_Libro;


    // No-argument constructor
    public My_Controller() {
    }

    public My_Controller(TextField espacio_Titulo, Button button_para_buscar_libro, Button button_, Button reemplazar_Libro, Button prestamos_Por_Libro, Button button1, Button button_Para_Borrar_libro, Button button3, TextField espacio_Editorial, TextField espacio_ISBN, TextField espacio_autor, TextField espacio_nombre, TextField fecha_de_publicacion, TextField espacio_codigo, TextField espacio_unidades_existentes, Button guardar_libro, TextArea area_Del_Libro) {
        Espacio_Titulo = espacio_Titulo;
        Button_para_buscar_libro = button_para_buscar_libro;
        Button_ = button_;
        Reemplazar_Libro = reemplazar_Libro;
        Prestamos_Por_Libro = prestamos_Por_Libro;
        this.button1 = button1;
        Button_Para_Borrar_libro = button_Para_Borrar_libro;
        this.button3 = button3;
        Espacio_Editorial = espacio_Editorial;
        Espacio_ISBN = espacio_ISBN;
        Espacio_autor = espacio_autor;
        Espacio_nombre = espacio_nombre;
        Fecha_de_publicacion = fecha_de_publicacion;
        Espacio_codigo = espacio_codigo;
        Espacio_unidades_existentes = espacio_unidades_existentes;
        Guardar_libro = guardar_libro;
        Area_Del_Libro = area_Del_Libro;
    }

    public TextField getEspacio_Titulo() {
        return Espacio_Titulo;
    }

    public void setEspacio_Titulo(TextField espacio_Titulo) {
        Espacio_Titulo = espacio_Titulo;
    }

    public Button getButton_para_buscar_libro() {
        return Button_para_buscar_libro;
    }

    public void setButton_para_buscar_libro(Button button_para_buscar_libro) {
        Button_para_buscar_libro = button_para_buscar_libro;
    }

    public Button getButton_() {
        return Button_;
    }

    public void setButton_(Button button_) {
        Button_ = button_;
    }

    public Button getReemplazar_Libro() {
        return Reemplazar_Libro;
    }

    public void setReemplazar_Libro(Button reemplazar_Libro) {
        Reemplazar_Libro = reemplazar_Libro;
    }

    public Button getPrestamos_Por_Libro() {
        return Prestamos_Por_Libro;
    }

    public void setPrestamos_Por_Libro(Button prestamos_Por_Libro) {
        Prestamos_Por_Libro = prestamos_Por_Libro;
    }

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button button1) {
        this.button1 = button1;
    }

    public Button getButton_Para_Borrar_libro() {
        return Button_Para_Borrar_libro;
    }

    public void setButton_Para_Borrar_libro(Button button_Para_Borrar_libro) {
        Button_Para_Borrar_libro = button_Para_Borrar_libro;
    }

    public Button getButton3() {
        return button3;
    }

    public void setButton3(Button button3) {
        this.button3 = button3;
    }

    public TextField getEspacio_Editorial() {
        return Espacio_Editorial;
    }

    public void setEspacio_Editorial(TextField espacio_Editorial) {
        Espacio_Editorial = espacio_Editorial;
    }

    public TextField getEspacio_ISBN() {
        return Espacio_ISBN;
    }

    public void setEspacio_ISBN(TextField espacio_ISBN) {
        Espacio_ISBN = espacio_ISBN;
    }

    public TextField getEspacio_autor() {
        return Espacio_autor;
    }

    public void setEspacio_autor(TextField espacio_autor) {
        Espacio_autor = espacio_autor;
    }

    public TextField getEspacio_nombre() {
        return Espacio_nombre;
    }

    public void setEspacio_nombre(TextField espacio_nombre) {
        Espacio_nombre = espacio_nombre;
    }

    public TextField getFecha_de_publicacion() {
        return Fecha_de_publicacion;
    }

    public void setFecha_de_publicacion(TextField fecha_de_publicacion) {
        Fecha_de_publicacion = fecha_de_publicacion;
    }

    public TextField getEspacio_codigo() {
        return Espacio_codigo;
    }

    public void setEspacio_codigo(TextField espacio_codigo) {
        Espacio_codigo = espacio_codigo;
    }

    public TextField getEspacio_unidades_existentes() {
        return Espacio_unidades_existentes;
    }

    public void setEspacio_unidades_existentes(TextField espacio_unidades_existentes) {
        Espacio_unidades_existentes = espacio_unidades_existentes;
    }

    public Button getGuardar_libro() {
        return Guardar_libro;
    }

    public void setGuardar_libro(Button guardar_libro) {
        Guardar_libro = guardar_libro;
    }

    public TextArea getArea_Del_Libro() {
        return Area_Del_Libro;
    }

    public void setArea_Del_Libro(TextArea area_Del_Libro) {
        Area_Del_Libro = area_Del_Libro;
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

    public void pasar_a_opciones_libro(ActionEvent actionEvent) throws IOException {
        Stage stagePasarGuardarLibro = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_libros.fxml"));
        Parent paginaGuardarLibro = fxmlLoader.load();
        Scene scene = new Scene(paginaGuardarLibro, 500, 500);
        stagePasarGuardarLibro.setScene(scene);
        stagePasarGuardarLibro.show();
    }

    public void buscar_Libro(ActionEvent actionEvent) {
        String codigo = Espacio_codigo.getText();
        String titulo = Espacio_Titulo.getText();
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

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public void reemplazar_Libro(ActionEvent actionEvent) {
        // Implementation needed
    }

    public void prestamos_Por_Libro(ActionEvent actionEvent) {
        // Implementation needed
    }

    @FXML
    public void pasar_a_eliminar_libro(ActionEvent actionEvent) throws IOException {
        Stage stagePasarBorrarLibro = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaBorrarLibro = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_Borrar_Libro.fxml")));
        Scene scene = new Scene(paginaBorrarLibro, 500, 500);
        stagePasarBorrarLibro.setScene(scene);
        stagePasarBorrarLibro.show();
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
    public void pasar_a_revisar_historial_prestamos(ActionEvent actionEvent) throws IOException {
        Stage stageARevisarHistorial = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent paginaBorrarLibro = fxmlLoader.load(getClass().getResource("/com/uq/sample/thefxapp/view/FrontEnd/Pagina_Borrar_Libro.fxml"));
        Scene scene = new Scene(paginaBorrarLibro, 500, 500);
        stageARevisarHistorial.setScene(scene);
        stageARevisarHistorial.show();
    }

    @FXML
    public void pasar_a_inventario(ActionEvent actionEvent) {
        // Implementation needed
    }

    @FXML
    public void guardar_libro(ActionEvent event) {
        try {
            String codigo_libro = Espacio_codigo.getText();
            String ISBN_libro = Espacio_ISBN.getText();
            String autor_libro = Espacio_autor.getText();
            String Titulo_libro = Espacio_Titulo.getText();
            String editorial_libro = Espacio_Editorial.getText();
            String fecha_publicacion_text = Fecha_de_publicacion.getText();
            String cantidad_libro = Espacio_unidades_existentes.getText();

            if (Stream.of(codigo_libro, ISBN_libro, autor_libro, Titulo_libro, editorial_libro, fecha_publicacion_text, cantidad_libro).anyMatch(String::isEmpty)) {
                showAlert(Alert.AlertType.ERROR, "Error", "All fields must be filled out");
                return;
            }

            // Log the values to check for null or empty fields
            System.out.println("Codigo: " + codigo_libro);
            System.out.println("ISBN: " + ISBN_libro);
            System.out.println("Autor: " + autor_libro);
            System.out.println("Titulo: " + Titulo_libro);
            System.out.println("Editorial: " + editorial_libro);
            System.out.println("Fecha de Publicacion: " + fecha_publicacion_text);
            System.out.println("Cantidad: " + cantidad_libro);


            LocalDate fecha_publicacion_libro = LocalDate.parse(fecha_publicacion_text);

            Biblioteca.agregarLibro(codigo_libro, ISBN_libro, autor_libro, Titulo_libro, editorial_libro, fecha_publicacion_libro, cantidad_libro);

            showAlert(Alert.AlertType.INFORMATION, "Success", "Libro guardado");
        } catch (DateTimeParseException e) {
            // showAlert(Alert.AlertType.ERROR, "Error", "Error: Fecha de publicación debe ser una fecha válida (yyyy-MM-dd).");
            e.printStackTrace();
        } catch (Exception e) {
            //showAlert(Alert.AlertType.ERROR, "Error", "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    public void borrar_Libro(ActionEvent event) {
        Biblioteca.getLibros().remove(Espacio_codigo.getText());
        showAlert(Alert.AlertType.INFORMATION, "Success", "Libro eliminado");
    }
}