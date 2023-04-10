package com.example.boxnewsfinalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class woonzen extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Woonzen.fxml"));
        stage.setTitle("Shark Shabu");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
