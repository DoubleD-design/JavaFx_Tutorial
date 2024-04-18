package com.example.javafx_tutorial.Eventtest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Event_TestController {
    @FXML
    private TextField Height;
    public void Submit(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        String height = Height.getText();
        alert.setContentText("Chiều cao của bạn là: " + "cm");
        alert.show();
    }
}
