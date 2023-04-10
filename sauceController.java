package com.example.boxnewsfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
public class sauceController implements Initializable {
    @FXML
    private Button SauceBackMarket;
    @FXML
    private ScrollPane Skoll;
    @FXML
    private Label sauceText;
    @FXML
    private ComboBox<String> cb1;
    private String[] c1 = {"1","2","3"};
    @FXML
    private ComboBox<String> cb2;
    private String[] c2 = {"1","2","3"};
    @FXML
    private ComboBox<String> cb3;
    private String[] c3 = {"1","2","3"};
    @FXML
    private ComboBox<String> cb4;
    private String[] c4 = {"1","2","3"};
    @FXML
    private ComboBox<String> cb5;
    private String[] c5 = {"1","2","3"};
    @FXML
    private ComboBox<String> cb6;
    private String[] c6 = {"1","2","3"};
    @FXML
    private ComboBox<String> cb7;
    private String[] c7 = {"1","2","3"};
    @FXML
    private ComboBox<String> cb8;
    private String[] c8 = {"1","2","3"};
    @FXML
    private CheckBox nj1;
    @FXML
    private CheckBox nj2;
    @FXML
    private CheckBox nj3;
    @FXML
    private CheckBox nj4;
    @FXML
    private CheckBox nj5;
    @FXML
    private CheckBox nj6;
    @FXML
    private CheckBox nj7;
    @FXML
    private Button save4;
    @FXML
    private CheckBox nj8;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cb1.getItems().addAll(c1);
        cb2.getItems().addAll(c2);
        cb3.getItems().addAll(c3);
        cb4.getItems().addAll(c4);
        cb5.getItems().addAll(c5);
        cb6.getItems().addAll(c6);
        cb7.getItems().addAll(c7);
        cb8.getItems().addAll(c8);
    }
    @FXML
    void sauceBackMarket(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Market.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    private String selectedItems = "";
    private void handleCheckBoxAction(CheckBox checkBox) {
        if (checkBox.isSelected()) {
            selectedItems += checkBox.getText() + "\n";
        } else {
            selectedItems = selectedItems.replace(checkBox.getText() + "\n", "");
        }
    }
    public void initialize() {
        nj1.setOnAction(e -> handleCheckBoxAction(nj1));
        nj2.setOnAction(e -> handleCheckBoxAction(nj2));
        nj3.setOnAction(e -> handleCheckBoxAction(nj3));
        nj4.setOnAction(e -> handleCheckBoxAction(nj4));
        nj5.setOnAction(e -> handleCheckBoxAction(nj5));
        nj6.setOnAction(e -> handleCheckBoxAction(nj6));
        nj7.setOnAction(e -> handleCheckBoxAction(nj7));
        nj8.setOnAction(e -> handleCheckBoxAction(nj8));
    }
    @FXML
    public void saveDataSauce(ActionEvent event) throws IOException {
        // อ่านค่า CheckBox แต่ละตัว
        String S1 = "";
        String S2 = "";
        String S3 = "";
        String S4 = "";
        String S5 = "";
        String S6 = "";
        String S7 = "";
        String S8 = "";

        if (nj1.isSelected()) {
            S1 = nj1.getText() + " : " + cb1.getValue();
        }
        if (nj2.isSelected()) {
            S2 = nj2.getText()  + " : " + cb2.getValue();;
        }
        if (nj3.isSelected()) {
            S3 = nj3.getText()  + " : " + cb3.getValue();;
        }
        if (nj4.isSelected()) {
            S4 = nj4.getText() + " : " + cb4.getValue();;
        }
        if (nj5.isSelected()) {
            S5 = nj5.getText() + " : " + cb5.getValue();;
        }
        if (nj6.isSelected()) {
            S6 = nj6.getText() + " : " + cb6.getValue();;
        }
        if (nj7.isSelected()) {
            S7 = nj7.getText() + " : " + cb7.getValue();;
        }
        if (nj8.isSelected()) {
            S8 = nj8.getText() + " : " + cb8.getValue();;
        }

        // แสดงผลในหน้า MenuChoose.fxml
        Label label1 = new Label("\t_____________________");
        Label label = new Label("     \n\t" + S1 + "     \n\t"+ S2 + "    \n\t"+ S3+ "    \n\t"+ S4 +
                "     \n\t"+ S5 + "    \n\t"+ S6+ "    \n\t"+ S7+ "    \n\t"+ S8);
        label.setFont(new Font(24));
        VBox layout = new VBox(50);
        layout.getChildren().addAll(label,label1);
        Scene scene = new Scene(layout, 300, 500);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("รายการที่เลือก");
        stage.show();
    }
}
