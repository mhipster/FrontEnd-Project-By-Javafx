package com.example.boxnewsfinalproject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextArea;
public class BillController implements Initializable {
    @FXML
    private TextArea selectedItemList;
    @FXML
    private Button BillBackMarket;
    @FXML
    private Button ScanQR;
    @FXML
    private TableColumn<Promotion, String> promotion2;
    @FXML
    private TableColumn<Promotion, Double> price;
    @FXML
    private TableView<Promotion> Pro;
    @FXML
    private Button checkMoney;
    @FXML
    private TextField promotionText;
    @FXML
    private TextField Total;
    @FXML
    private TextField RealPrice;
    @FXML
    private TextField People;
    ObservableList<Promotion> lists = FXCollections.observableArrayList(
            new Promotion("                 มา 1 ท่าน จ่าย                                     ",279.00),
            new Promotion("                 มา 3 ท่าน ลด 5% จากปกติ  837  เหลือ....                              ",795.15),
            new Promotion("                 มา 5 ท่าน ลด 7% จากปกติ  1395  เหลือ....                             ",1297.35),
            new Promotion("                 มา 10 ท่าน ลด 10% จากปกติ  2790  เหลือ....                           ",2511.00),
            new Promotion("                 มา 15 ท่าน ลด 12% จากปกติ  4185  เหลือ....                           ",3682.80),
            new Promotion("                 มา 20 ท่าน ลด 15% จากปกติ  5580  เหลือ....                           ",4743.00));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TableColumn<Promotion, String> promotionColumn = new TableColumn<>("   โปรโมชั่น   "); // หัวข้อตาราง
        promotionColumn.setCellValueFactory(new PropertyValueFactory<>("promotion2"));
        Pro.getColumns().add(promotionColumn);
        TableColumn<Promotion, Double> priceColumn = new TableColumn<>("   ราคา   ");
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        Pro.getColumns().add(1, priceColumn);
        Pro.setItems(lists);
    }
    @FXML
    private void BillBackMarket(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Market.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // ปุ่มคิดเงิน
    @FXML
    public void calculateTotal(ActionEvent event) {
        double realPriceValue = Double.parseDouble(RealPrice.getText());
        int peopleValue = Integer.parseInt(People.getText());
        double discountPercentage = Double.parseDouble(promotionText.getText());
        double discountAmount = realPriceValue * discountPercentage / 100;
        double discountedPrice = realPriceValue - discountAmount;
        double totalValue = discountedPrice * peopleValue;
        Total.setText(String.format("%.2f", totalValue));
    }
    @FXML
    private void BillToQR(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("QR.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
