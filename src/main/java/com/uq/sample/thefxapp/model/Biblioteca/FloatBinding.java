package com.uq.sample.thefxapp.model.Biblioteca;

import javafx.beans.binding.Bindings;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.scene.control.TextField;

public class FloatBinding {
    public static void main(String[] args) {
        // Create a FloatProperty
        FloatProperty salario = new SimpleFloatProperty();

        // Create a TextField
        TextField salarioField = new TextField();

        // Bind the FloatProperty to the TextField
        Bindings.bindBidirectional(
            salarioField.textProperty(),   // Bind to textProperty of TextField
            salario,                       // Bind to the FloatProperty
            new javafx.util.StringConverter<Number>() {
                @Override
                public String toString(Number object) {
                    return object != null ? object.toString() : "";
                }

                @Override
                public Float fromString(String string) {
                    try {
                        return Float.parseFloat(string);
                    } catch (NumberFormatException e) {
                        return 0.0f;  // Default value if parsing fails
                    }
                }
            }
        );

        // Example: set value programmatically
        salario.set(1000.0f); // Updates the TextField as well
    }
}

