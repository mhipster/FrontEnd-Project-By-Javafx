package com.example.boxnewsfinalproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
public class ConfirmController implements Initializable {
    @FXML
    private Button CancleButton;
    @FXML
    private Button YesButton;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    private Stage stage;
    @FXML
    private void LogoutToConfirmPage(ActionEvent event) throws Exception{
        if(event.getSource() == YesButton){
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else if(event.getSource() == CancleButton){
            Parent root = FXMLLoader.load(getClass().getResource("Market.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
}
