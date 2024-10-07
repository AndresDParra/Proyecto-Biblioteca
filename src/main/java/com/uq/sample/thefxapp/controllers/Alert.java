package com.uq.sample.thefxapp.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Alert {

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
    public Alert() {
    }

    public Alert(TextField espacio_Titulo, Button button_para_buscar_libro, Button button_, Button reemplazar_Libro, Button prestamos_Por_Libro, Button button1, Button button_Para_Borrar_libro, Button button3, TextField espacio_Editorial, TextField espacio_ISBN, TextField espacio_autor, TextField espacio_nombre, TextField fecha_de_publicacion, TextField espacio_codigo, TextField espacio_unidades_existentes, Button guardar_libro, TextArea area_Del_Libro) {
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
    static void showAlert(javafx.scene.control.Alert.AlertType alertType, String title, String content) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }




    }
