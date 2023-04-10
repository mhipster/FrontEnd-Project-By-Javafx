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
public class VegetableController implements Initializable {
    @FXML
    private ImageView Veg1;
    @FXML
    private ImageView Veg2;
    @FXML
    private Button VegBackMarket;
    @FXML
    private Label VegTitle;
    @FXML
    private CheckBox c1;
    @FXML
    private CheckBox c10;
    @FXML
    private CheckBox c11;
    @FXML
    private CheckBox c12;
    @FXML
    private CheckBox c2;
    @FXML
    private CheckBox c3;
    @FXML
    private CheckBox c4;
    @FXML
    private CheckBox c5;
    @FXML
    private CheckBox c6;
    @FXML
    private CheckBox c7;
    @FXML
    private CheckBox c8;
    @FXML
    private CheckBox c9;
    @FXML
    private ComboBox<String> combo1;
    private String[] pak1 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo10;
    private String[] pak10 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo11;
    private String[] pak11 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo12;
    private String[] pak12 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo2;
    private String[] pak2 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo3;
    private String[] pak3 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo4;
    private String[] pak4 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo5;
    private String[] pak5 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo6;
    private String[] pak6 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo7;
    private String[] pak7 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo8;
    private String[] pak8 = {"1","2","3","4","5"};
    @FXML
    private ComboBox<String> combo9;
    private String[] pak9 = {"1","2","3","4","5"};
    @FXML
    private Button save2;
    private String selectedItems = "";

    public void initialize() {
        c1.setOnAction(e -> handleCheckBoxAction(c1));
        c2.setOnAction(e -> handleCheckBoxAction(c2));
        c3.setOnAction(e -> handleCheckBoxAction(c3));
        c4.setOnAction(e -> handleCheckBoxAction(c4));
        c5.setOnAction(e -> handleCheckBoxAction(c5));
        c6.setOnAction(e -> handleCheckBoxAction(c6));
        c7.setOnAction(e -> handleCheckBoxAction(c7));
        c8.setOnAction(e -> handleCheckBoxAction(c8));
        c9.setOnAction(e -> handleCheckBoxAction(c9));
        c10.setOnAction(e -> handleCheckBoxAction(c10));
        c11.setOnAction(e -> handleCheckBoxAction(c11));
        c12.setOnAction(e -> handleCheckBoxAction(c12));
    }
    private void handleCheckBoxAction(CheckBox checkBox) {
        if (checkBox.isSelected()) {
            selectedItems += checkBox.getText() + "\n";
        } else {
            selectedItems = selectedItems.replace(checkBox.getText() + "\n", "");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        combo1.getItems().addAll(pak1);
        combo2.getItems().addAll(pak2);
        combo3.getItems().addAll(pak3);
        combo4.getItems().addAll(pak4);
        combo5.getItems().addAll(pak5);
        combo6.getItems().addAll(pak6);
        combo7.getItems().addAll(pak7);
        combo8.getItems().addAll(pak8);
        combo9.getItems().addAll(pak9);
        combo10.getItems().addAll(pak10);
        combo11.getItems().addAll(pak11);
        combo12.getItems().addAll(pak12);
    }
    @FXML
    public void VegBackMarket(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Market.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void saveDataVeg(ActionEvent event) throws IOException {
        // อ่านค่า CheckBox แต่ละตัว
        String C1 = "";
        String C2 = "";
        String C3 = "";
        String C4 = "";
        String C5 = "";
        String C6 = "";
        String C7 = "";
        String C8 = "";
        String C9 = "";
        String C10 = "";
        String C11 = "";
        String C12 = "";

        if (c1.isSelected()) {
            C1 = c1.getText() + " : " + combo1.getValue();
        }
        if (c2.isSelected()) {
            C2 = c2.getText() + " : " + combo2.getValue();
        }
        if (c3.isSelected()) {
            C3 = c3.getText() + " : " + combo3.getValue();
        }
        if (c4.isSelected()) {
            C4 = c4.getText() + " : " + combo4.getValue();
        }
        if (c5.isSelected()) {
            C5 = c5.getText() + " : " + combo5.getValue();
        }
        if (c6.isSelected()) {
            C6 = c6.getText() + " : " + combo6.getValue();
        }
        if (c7.isSelected()) {
            C7 = c7.getText() + " : " + combo7.getValue();
        }
        if (c8.isSelected()) {
            C8 = c8.getText() + " : " + combo8.getValue();
        }
        if (c9.isSelected()) {
            C9 = c9.getText() + " : " + combo9.getValue();
        }
        if (c10.isSelected()) {
            C10 = c10.getText() + " : " + combo10.getValue();
        }
        if (c11.isSelected()) {
            C11 = c11.getText() + " : " + combo11.getValue();
        }
        if (c12.isSelected()) {
            C12 = c12.getText() + " : " + combo12.getValue();
        }
        // แสดงผลในหน้า MenuChoose.fxml
        Label label1 = new Label("\t__________________________________");
        Label label = new Label("     \n\t\t" + C1 + "     \n\t\t"+ C2 + "    " +
                "\n\t\t"+ C3 + "     \n\t\t" + C4 + "     \n\t\t"+ C5 + "    " +
                "\n\t\t"+ C6 +"     \n\t\t" + C7 + "     \n\t\t"+ C8 + "    \n\t\t"+ C9 +"     " +
                "\n\t\t" + C10 + "     \n\t\t"+ C11 + "    \n\t\t"+ C12);
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
