module com.uq.sample.thefxapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.uq.sample.thefxapp to javafx.fxml;
    opens com.uq.sample.thefxapp.controllers to javafx.fxml;

    exports com.uq.sample.thefxapp;
    exports com.uq.sample.thefxapp.controllers;
}