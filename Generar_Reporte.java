package com.uq.sample.thefxapp.controllers;

import javafx.scene.control.TextField;

public class Generar_Reporte {
    public TextField espacio_estudiante_mas_prestamos;
    public TextField espacio_dinero_recaudado;
    public TextField espacio_salario_empleado_total;

    public Generar_Reporte(TextField espacio_estudiante_mas_prestamos, TextField espacio_dinero_recaudado, TextField espacio_salario_empleado_total) {
        this.espacio_estudiante_mas_prestamos = espacio_estudiante_mas_prestamos;
        this.espacio_dinero_recaudado = espacio_dinero_recaudado;
        this.espacio_salario_empleado_total = espacio_salario_empleado_total;
    }

    public TextField getEspacio_estudiante_mas_prestamos() {
        return espacio_estudiante_mas_prestamos;
    }

    public void setEspacio_estudiante_mas_prestamos(TextField espacio_estudiante_mas_prestamos) {
        this.espacio_estudiante_mas_prestamos = espacio_estudiante_mas_prestamos;
    }

    public TextField getEspacio_dinero_recaudado() {
        return espacio_dinero_recaudado;
    }

    public void setEspacio_dinero_recaudado(TextField espacio_dinero_recaudado) {
        this.espacio_dinero_recaudado = espacio_dinero_recaudado;
    }

    public TextField getEspacio_salario_empleado_total() {
        return espacio_salario_empleado_total;
    }

    public void setEspacio_salario_empleado_total(TextField espacio_salario_empleado_total) {
        this.espacio_salario_empleado_total = espacio_salario_empleado_total;
    }

    public Generar_Reporte() {
    }
    public void generarReporte(){

    }
}
