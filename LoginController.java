package com.example.boxnewsfinalproject;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    private Stage stage;
    private Scene scene;
    @FXML
    private Label BoxNewsTitle;
    @FXML
    private ImageView BoxnewsLogo;
    @FXML
    private BorderPane LayOutMain;
    @FXML
    private Button Login1Button;
    @FXML
    private TextField EmailTextF;
    @FXML
    private PasswordField PasswordFill;
    @FXML
    private ImageView PasswordLogo;
    @FXML
    private Button SignUpButton;
    @FXML
    private ImageView UserLogo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    @FXML
    private void SignupToRegister(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void submit2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Market.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        try {
            // รับค่า email
            String username = EmailTextF.getText();
            System.out.println("Username : " + username);

            // รับค่าเกี่ยวกับอายุ
            String pass = PasswordFill.getText();
            System.out.println("Password : " + pass);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
