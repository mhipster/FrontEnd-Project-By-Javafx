package com.example.boxnewsfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class RegisterController implements Initializable {
    @FXML
    private Label CommentText2;
    @FXML
    private Label ConfirmEmail;
    @FXML
    private TextField ConfirmEmailText;
    @FXML
    private Label CountryTitle;
    @FXML
    private Label CreatePassword;
    @FXML
    private ComboBox<String> DayComBo;
    private String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17"
            ,"18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

    @FXML
    private Label DayText;
    @FXML
    private Label HaveAccount;
    @FXML
    private BorderPane LayoutPane;
    @FXML
    private Button LoginButton;
    @FXML
    private ComboBox<String> MonthComBo;
    private String[] months = {"มกราคม","กุมภาพันธ์","มีนาคม","เมษายน","พฤษภาคม",
            "มิถุนายน","กรกฎาคม","สิงหาคม","กันยายน","ตุลาคม","พฤศจิกายน","ธันวาคม"};
    @FXML
    private Label MonthText;
    @FXML
    private TextField PasswordText;
    @FXML
    private Button RegistButton;
    @FXML
    private Label RegistTitle2;
    @FXML
    private Label RegisterTitle;
    @FXML
    private Label TextComment;
    @FXML
    private TextField UserText;
    @FXML
    private Label Username;
    @FXML
    private Label YearsText;
    @FXML
    private Label YourBirthDay;
    @FXML
    private TextField YourEmailField;
    @FXML
    private Label YourEmailTitle;
    @FXML
    private TextField yearFeild;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DayComBo.getItems().addAll(days);
        MonthComBo.getItems().addAll(months);
    }
    @FXML
    private void RegisterToLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void RegistToLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // validate
    int year;
    public void submit(ActionEvent event){
        try{
            // รับค่า email
            String name = UserText.getText();
            System.out.println("ชื่อผู้ใช้ : " + name);

            // รับค่าเกี่ยวกับอายุ
            String email = YourEmailField.getText();
            System.out.println("อีเมล : " + email);

            // รับค่าเกี่ยวกับอายุ
            String pass = PasswordText.getText();
            System.out.println("รหัสผ่าน : " + pass);

            year = Integer.parseInt(yearFeild.getText());
            System.out.println("ปีเกิด : " + year);
            System.out.println("------------------------------------");
        }
        catch (NumberFormatException e){
            System.out.println("ปีเกิด : กรุณากรอกตัวเลข 4 หลักที่เป็น พ.ศ.");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
