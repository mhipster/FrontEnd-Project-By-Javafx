package com.example.boxnewsfinalproject;
import javafx.scene.layout.VBox;
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
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Font;
public class soupController implements Initializable {
    @FXML
    private ComboBox<String> Com1;
    @FXML
    private ImageView ImageSoup;
    @FXML
    private CheckBox NamDam;
    @FXML
    private CheckBox NamTomyam;
    @FXML
    private CheckBox Namsai;
    @FXML
    private Button SM2;
    @FXML
    private Label soupText;
    @FXML
    private Button BackButtonSoup;
    @FXML
    private Button DL1;
    @FXML
    private Label Namegoods1;
    @FXML
    private Label Namegoods11;
    @FXML
    CheckBox nameCheckBox;
    @FXML
    private Button Save1;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private CheckBox selectedCheckBox;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void soupBackMarket(ActionEvent event) throws IOException {
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
        Namsai.setOnAction(e -> handleCheckBoxAction(Namsai));
        NamTomyam.setOnAction(e -> handleCheckBoxAction(NamTomyam));
        NamDam.setOnAction(e -> handleCheckBoxAction(Namsai));
    }
    public void handleCheckBox(ActionEvent event) {
        CheckBox checkBox = (CheckBox) event.getSource();
        if (checkBox.isSelected()) {
            selectedCheckBox = checkBox;
            NamDam.setSelected(false);
            NamTomyam.setSelected(false);
            Namsai.setSelected(false);
            checkBox.setSelected(true);
        } else {
            selectedCheckBox = null;
        }
    }
    @FXML
    public void saveDataFruits(ActionEvent event) throws IOException {
        // อ่านค่า CheckBox แต่ละตัว
        String S1 = "";
        String S2 = "";
        String S3 = "";

        if (Namsai.isSelected()) {
            S1 = Namsai.getText();
        }
        if (NamTomyam.isSelected()) {
            S2 = NamTomyam.getText();
        }
        if (NamDam.isSelected()) {
            S3 = NamDam.getText();
        }

        // แสดงผลในหน้า MenuChoose.fxml
        Label label1 = new Label("\t_____________________");
        Label label = new Label("     \n\t" + S1 + "     \n\t"+ S2 + "    \n\t"+ S3);
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
