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
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
public class DrinkController implements Initializable {
    @FXML
    private ImageView Drink1;
    @FXML
    private ImageView Drink2;
    @FXML
    private Button DrinkBackMarket;
    @FXML
    private Label drink2;
    @FXML
    private Button DL7;
    @FXML
    private Button SM8;
    @FXML
    private CheckBox e1;
    @FXML
    private CheckBox e2;
    @FXML
    private CheckBox e3;
    @FXML
    private CheckBox e4;
    @FXML
    private CheckBox e5;
    @FXML
    private CheckBox e6;
    @FXML
    private ComboBox<String> h1;
    private String[] h = {"1","2","3"};
    @FXML
    private ComboBox<String> h2;
    private String[] hh = {"1","2","3"};
    @FXML
    private ComboBox<String> h3;
    private String[] hhh = {"1","2","3"};
    @FXML
    private ComboBox<String> h4;
    private String[] hhhh = {"1","2","3"};
    @FXML
    private ComboBox<String> h5;
    private String[] hhhhh = {"1","2","3"};
    @FXML
    private ComboBox<String> h6;
    private String[] hhhhhh = {"1","2","3"};
    @FXML
    private Button save6;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        h1.getItems().addAll(h);
        h2.getItems().addAll(hh);
        h3.getItems().addAll(hhh);
        h4.getItems().addAll(hhhh);
        h5.getItems().addAll(hhhhh);
        h6.getItems().addAll(hhhhhh);
    }
    @FXML
    private void DrinkBackMarket(ActionEvent event) throws IOException {
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
        e1.setOnAction(e -> handleCheckBoxAction(e1));
        e2.setOnAction(e -> handleCheckBoxAction(e2));
        e3.setOnAction(e -> handleCheckBoxAction(e3));
        e4.setOnAction(e -> handleCheckBoxAction(e4));
        e5.setOnAction(e -> handleCheckBoxAction(e5));
        e6.setOnAction(e -> handleCheckBoxAction(e6));
    }
    @FXML
    public void saveDataDrink(ActionEvent event) throws IOException {
        // อ่านค่า CheckBox แต่ละตัว
        String S1 = "";
        String S2 = "";
        String S3 = "";
        String S4 = "";
        String S5 = "";
        String S6 = "";

        if (e1.isSelected()) {
            S1 = e1.getText()+ " : " + h1.getValue();
        }
        if (e2.isSelected()) {
            S2 = e2.getText()+ " : " + h2.getValue();
        }
        if (e3.isSelected()) {
            S3 = e3.getText()+ " : " + h3.getValue();
        }
        if (e4.isSelected()) {
            S4 = e4.getText()+ " : " + h4.getValue();
        }
        if (e5.isSelected()) {
            S5 = e5.getText()+ " : " + h5.getValue();
        }
        if (e6.isSelected()) {
            S6 = e6.getText()+ " : " + h6.getValue();
        }

        // แสดงผลในหน้า MenuChoose.fxml
        Label label1 = new Label("\t_____________________");
        Label label = new Label("     \n\t" + S1 + "     \n\t"+ S2 + "    \n\t"+ S3+ "    \n\t"+ S4 +
                "     \n\t"+ S5 + "    \n\t"+ S6);
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
