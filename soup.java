package com.example.boxnewsfinalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class soup extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Soup.fxml"));
        primaryStage.setTitle("Shark Shabu");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
