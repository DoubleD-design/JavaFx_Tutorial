package com.example.javafx_tutorial.Eventtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Event_Test extends Application {

    private static final Logger LOGGER = Logger.getLogger(Event_Test.class.getName());

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            URL fxmlLocation = getClass().getResource("/Users/duy/IdeaProjects/JavaFx_Tutorial/src/main/java/com/example/javafx_tutorial/Eventtest/view.fxml");
            if (fxmlLocation == null) {
                throw new IllegalArgumentException("Cannot find view.fxml");
            }
            Parent root = FXMLLoader.load(fxmlLocation);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Failed to load the FXML view.", e);
        }
    }
}