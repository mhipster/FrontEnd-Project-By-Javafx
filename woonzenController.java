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
public class woonzenController implements Initializable {
    @FXML
    private ImageView WoonzenImage;
    @FXML
    private Label Zentitle;
    @FXML
    private Button backButtonWoonzen;
    @FXML
    private CheckBox Mama;
    @FXML
    private CheckBox Mhiyok;
    @FXML
    private CheckBox Woonsen;
    @FXML
    private CheckBox Zenkaew;
    @FXML
    private Button save3;
    @FXML
    private ComboBox<String> comb1;
    private String[] sen1 = {"1","2","3"};
    @FXML
    private ComboBox<String> comb2;
    private String[] sen2 = {"1","2","3"};
    @FXML
    private ComboBox<String> comb3;
    private String[] sen3 = {"1","2","3"};
    @FXML
    private ComboBox<String> comb4;
    private String[] sen4 = {"1","2","3"};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comb1.getItems().addAll(sen1);
        comb2.getItems().addAll(sen2);
        comb3.getItems().addAll(sen3);
        comb4.getItems().addAll(sen4);
    }
    @FXML
    public void WoonzenBackMarket(ActionEvent event) throws IOException {
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
        Mama.setOnAction(e -> handleCheckBoxAction(Mama));
        Mhiyok.setOnAction(e -> handleCheckBoxAction(Mhiyok));
        Woonsen.setOnAction(e -> handleCheckBoxAction(Woonsen));
        Zenkaew.setOnAction(e -> handleCheckBoxAction(Zenkaew));
    }
    @FXML
    public void saveDataWoonzen(ActionEvent event) throws IOException {
        // อ่านค่า CheckBox แต่ละตัว
        String mama = "";
        String mhiyok = "";
        String woonsen = "";
        String zenkaew = "";

        if (Mama.isSelected()) {
            mama = Mama.getText() + " : " + comb1.getValue();
        }
        if (Mhiyok.isSelected()) {
            mhiyok = Mhiyok.getText() + " : " + comb2.getValue();
        }
        if (Woonsen.isSelected()) {
            woonsen = Woonsen.getText() + " : " + comb3.getValue();
        }
        if (Zenkaew.isSelected()) {
            zenkaew = Zenkaew.getText() + " : " + comb4.getValue();
        }

        // แสดงผลในหน้า MenuChoose.fxml
        Label label1 = new Label("\t_____________________");
        Label label = new Label("     \n\t" + mama + "     \n\t"+ mhiyok + "    \n\t"+ woonsen+ "    \n\t"+ zenkaew);
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
