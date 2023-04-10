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
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MarketController implements Initializable {

    @FXML
    private Button BillButton;

    @FXML
    private ImageView BillImage;

    @FXML
    private Button DrinkButton;

    @FXML
    private ImageView DrinkImage;

    @FXML
    private Button FruitButton;

    @FXML
    private ImageView FruitImage;

    @FXML
    private Button KanomButton;

    @FXML
    private Button LogoutMarket;

    @FXML
    private Label MenuTitle;

    @FXML
    private Button NamjimButton;

    @FXML
    private ImageView NamjimImage;

    @FXML
    private Label ShabuTitle;

    @FXML
    private Button SoupButton;

    @FXML
    private ImageView SoupImage;

    @FXML
    private ImageView kanomImage;

    @FXML
    private Button meetButton;

    @FXML
    private ImageView meetImage;

    @FXML
    private Button noodButton;

    @FXML
    private ImageView noodImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    // Logout แล้ว Confirm
    @FXML
    public void LogoutToConfirm(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ConfirmPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // เลือกเส้น
    @FXML
    public void MarketToWoonzen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Woonzen.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // เลือกน้ำซุป
    @FXML
    public void MarketToSoup(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Soup.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // เลือกผลไม้
    @FXML
    public void MarketToFruits(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Fruits.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // เลือกน้ำจิ้ม
    @FXML
    public void MarketToSauce(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sauce.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // เลือกเนื้อ
    @FXML
    public void MarketToPock(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pock.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // เลือกเครื่องดื่ม
    @FXML
    public void MarketToDrink(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Drink.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // เลือกผัก
    @FXML
    public void MarketToVegetable(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Vegetable.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // เลือกขนม
    @FXML
    public void MarketToKanom(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Kanom.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // เช็คบิล
    @FXML
    public void MarketToBill(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CheckBill.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
