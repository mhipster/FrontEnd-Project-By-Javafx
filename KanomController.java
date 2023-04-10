package com.example.boxnewsfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class KanomController implements Initializable {

    @FXML
    private Button KanomBackMarket;

    @FXML
    private Button DL7;

    @FXML
    private Label KanomTitle;

    @FXML
    private Button SM8;

    @FXML
    private ImageView pic1;

    @FXML
    private ImageView pic2;

    @FXML
    private CheckBox k1;

    @FXML
    private CheckBox k10;

    @FXML
    private CheckBox k11;

    @FXML
    private CheckBox k12;

    @FXML
    private CheckBox k2;

    @FXML
    private CheckBox k3;

    @FXML
    private CheckBox k4;

    @FXML
    private CheckBox k5;

    @FXML
    private CheckBox k6;

    @FXML
    private CheckBox k7;

    @FXML
    private CheckBox k8;

    @FXML
    private CheckBox k9;

    @FXML
    private ComboBox<String> w1;
    private String[] w = {"1","2","3"};

    @FXML
    private ComboBox<String> w10;
    private String[] ww = {"1","2","3"};

    @FXML
    private ComboBox<String> w11;
    private String[] www = {"1","2","3"};

    @FXML
    private ComboBox<String> w12;
    private String[] wwww = {"1","2","3"};

    @FXML
    private ComboBox<String> w2;
    private String[] wwwwww = {"1","2","3"};

    @FXML
    private ComboBox<String> w3;
    private String[] ww2 = {"1","2","3"};

    @FXML
    private ComboBox<String> w4;
    private String[] ww3 = {"1","2","3"};

    @FXML
    private ComboBox<String> w5;
    private String[] ww4 = {"1","2","3"};

    @FXML
    private ComboBox<String> w6;
    private String[] ww5 = {"1","2","3"};

    @FXML
    private ComboBox<String> w7;
    private String[] ww6 = {"1","2","3"};

    @FXML
    private ComboBox<String> w8;
    private String[] ww7 = {"1","2","3"};
    @FXML
    private ComboBox<String> w9;
    private String[] ww8 = {"1","2","3"};
    @FXML
    private Button save7;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        w1.getItems().addAll(w);
        w2.getItems().addAll(ww);
        w3.getItems().addAll(www);
        w4.getItems().addAll(wwww);
        w5.getItems().addAll(wwwwww);
        w6.getItems().addAll(ww2);
        w7.getItems().addAll(ww3);
        w8.getItems().addAll(ww8);
        w9.getItems().addAll(ww7);
        w10.getItems().addAll(ww4);
        w11.getItems().addAll(w);
        w12.getItems().addAll(ww6);
    }
    @FXML
    private void KanomBackMarket(ActionEvent event) throws IOException {
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
        k1.setOnAction(e -> handleCheckBoxAction(k1));
        k2.setOnAction(e -> handleCheckBoxAction(k2));
        k3.setOnAction(e -> handleCheckBoxAction(k3));
        k4.setOnAction(e -> handleCheckBoxAction(k4));
        k5.setOnAction(e -> handleCheckBoxAction(k5));
        k6.setOnAction(e -> handleCheckBoxAction(k6));
        k7.setOnAction(e -> handleCheckBoxAction(k7));
        k8.setOnAction(e -> handleCheckBoxAction(k8));
        k9.setOnAction(e -> handleCheckBoxAction(k9));
        k10.setOnAction(e -> handleCheckBoxAction(k10));
        k11.setOnAction(e -> handleCheckBoxAction(k11));
        k12.setOnAction(e -> handleCheckBoxAction(k12));
    }
    @FXML
    public void saveDataKanom(ActionEvent event) throws IOException {

        // อ่านค่า CheckBox แต่ละตัว
        String S1 = "";
        String S2 = "";
        String S3 = "";
        String S4 = "";
        String S5 = "";
        String S6 = "";
        String S7 = "";
        String S8 = "";
        String S9 = "";
        String S10 = "";
        String S11 = "";
        String S12 = "";

        if (k1.isSelected()) {
            S1 = k1.getText()+ " : " + w1.getValue();
        }
        if (k2.isSelected()) {
            S2 = k2.getText()+ " : " + w2.getValue();
        }
        if (k3.isSelected()) {
            S3 = k3.getText()+ " : " + w3.getValue();
        }
        if (k4.isSelected()) {
            S4 = k4.getText()+ " : " + w4.getValue();
        }
        if (k5.isSelected()) {
            S5 = k5.getText()+ " : " + w5.getValue();
        }
        if (k6.isSelected()) {
            S6 = k6.getText()+ " : " + w6.getValue();
        }
        if (k7.isSelected()) {
            S7 = k7.getText()+ " : " + w7.getValue();
        }
        if (k8.isSelected()) {
            S8 = k8.getText()+ " : " + w8.getValue();
        }
        if (k9.isSelected()) {
            S9 = k9.getText()+ " : " + w9.getValue();
        }
        if (k10.isSelected()) {
            S10 = k10.getText()+ " : " + w10.getValue();
        }
        if (k11.isSelected()) {
            S11 = k11.getText()+ " : " + w11.getValue();
        }
        if (k12.isSelected()) {
            S12 = k12.getText()+ " : " + w12.getValue();
        }

        // แสดงผลในหน้า MenuChoose.fxml
        Label label1 = new Label("\t_____________________");
        Label label = new Label("     \n\t" + S1 + "     \n\t"+ S2 + "    \n\t"+ S3+ "    \n\t"+ S4 +
                "     \n\t"+ S5 + "    \n\t"+ S6+ "    \n\t"+ S7+ "    \n\t"+ S8+ "    \n\t"+ S9
                + "    \n\t"+ S10+ "    \n\t"+ S11+ "    \n\t"+ S12);
        label.setFont(new Font(20));

        VBox layout = new VBox(50);
        layout.getChildren().addAll(label,label1);
        Scene scene = new Scene(layout, 300, 500);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("รายการที่เลือก");
        stage.show();
    }
}
