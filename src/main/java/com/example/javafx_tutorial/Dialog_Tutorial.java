package com.example.javafx_tutorial;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import kotlin.Pair;

public class Dialog_Tutorial extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Login Dialog");
        dialog.setHeaderText("Sign up");

        ButtonType loginButtonType = new ButtonType("Login", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField username = new TextField();
        username.setPromptText("Username");
        TextField password = new TextField();
        password.setPromptText("Password");

        grid.add(new Label("Username"), 0,0);
        grid.add(username, 1,0);
        grid.add(new Label("Password"), 0,1);
        grid.add(password, 1,1);
    }
    public static void main(String[] args) {
        launch();
    }
}
