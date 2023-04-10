package com.example.boxnewsfinalproject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.io.IOException;
public class Confirm extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ConfirmPage.fxml"));
        primaryStage.setTitle("ออกจากระบบ - Shark Shabu");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
