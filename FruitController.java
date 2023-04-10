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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FruitController implements Initializable {
    @FXML
    private Button FruitBackMarket;
    @FXML
    private ImageView FruitImage;
    @FXML
    private CheckBox f1;
    @FXML
    private CheckBox f2;
    @FXML
    private CheckBox f3;
    @FXML
    private CheckBox f4;
    @FXML
    private CheckBox f5;
    @FXML
    private CheckBox f6;
    @FXML
    private ComboBox<String> t1;
    private String[] i1 = {"1","2","3"};
    @FXML
    private ComboBox<String> t2;
    private String[] i2 = {"1","2","3"};
    @FXML
    private ComboBox<String> t3;
    private String[] i3 = {"1","2","3"};
    @FXML
    private ComboBox<String> t4;
    private String[] i4 = {"1","2","3"};
    @FXML
    private ComboBox<String> t5;
    private String[] i5 = {"1","2","3"};
    @FXML
    private ComboBox<String> t6;
    private String[] i6 = {"1","2","3"};
    @FXML
    private Button save8;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        t1.getItems().addAll(i1);
        t2.getItems().addAll(i2);
        t3.getItems().addAll(i3);
        t4.getItems().addAll(i4);
        t5.getItems().addAll(i5);
        t6.getItems().addAll(i6);
    }
    @FXML
    private void FruitBackMarket(ActionEvent event) throws IOException {
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
        f1.setOnAction(e -> handleCheckBoxAction(f1));
        f2.setOnAction(e -> handleCheckBoxAction(f2));
        f3.setOnAction(e -> handleCheckBoxAction(f3));
        f4.setOnAction(e -> handleCheckBoxAction(f4));
        f5.setOnAction(e -> handleCheckBoxAction(f5));
        f6.setOnAction(e -> handleCheckBoxAction(f6));
    }
    @FXML
    public void saveDataFruits(ActionEvent event) throws IOException {
        // อ่านค่า CheckBox แต่ละตัว
        String S1 = "";
        String S2 = "";
        String S3 = "";
        String S4 = "";
        String S5 = "";
        String S6 = "";

        if (f1.isSelected()) {
            S1 = f1.getText() + " : " + t1.getValue();
        }
        if (f2.isSelected()) {
            S2 = f2.getText() + " : " + t2.getValue();
        }
        if (f3.isSelected()) {
            S3 = f3.getText() + " : " + t3.getValue();
        }
        if (f4.isSelected()) {
            S4 = f4.getText() + " : " + t4.getValue();
        }
        if (f5.isSelected()) {
            S5 = f5.getText() + " : " + t5.getValue();
        }
        if (f6.isSelected()) {
            S6 = f6.getText() + " : " + t6.getValue();
        }
        // แสดงผลในหน้า MenuChoose.fxml
        Label label1 = new Label("\t_____________________");
        Label label = new Label("     \n\t" + S1 + "     \n\t"+ S2 + "    \n\t"+ S3+ "    \n\t"+ S4 +
                "     \n\t"+ S5 + "    \n\t"+ S6);
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
