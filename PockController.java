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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
public class PockController implements Initializable {
    @FXML
    private Label PockTitle;

    @FXML
    private Button PockToMarket;

    @FXML
    private Button nextPock;

    @FXML
    private ImageView pock1;

    @FXML
    private ImageView pock2;

    @FXML
    private ImageView pock3;

    @FXML
    private GridPane skroll;
    @FXML
    private ComboBox<String> B1;
    private String[] moo1 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B10;
    private String[] moo2 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B11;
    private String[] moo3 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B12;
    private String[] moo4 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B13;
    private String[] moo5 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B14;
    private String[] moo6 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B15;
    private String[] moo7 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B16;
    private String[] moo8 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B17;
    private String[] moo9 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B18;
    private String[] moo10 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B2;
    private String[] moo11 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B3;
    private String[] moo12 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B4;
    private String[] moo13 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B5;
    private String[] moo14 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B6;
    private String[] moo15 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B7;
    private String[] moo16 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B8;
    private String[] moo17 = {"1","2","3","4","5"};

    @FXML
    private ComboBox<String> B9;
    private String[] moo18 = {"1","2","3","4","5"};

    @FXML
    private CheckBox a1;

    @FXML
    private CheckBox a10;

    @FXML
    private CheckBox a11;

    @FXML
    private CheckBox a12;

    @FXML
    private CheckBox a13;

    @FXML
    private CheckBox a14;

    @FXML
    private CheckBox a15;

    @FXML
    private CheckBox a16;

    @FXML
    private CheckBox a17;

    @FXML
    private CheckBox a18;

    @FXML
    private CheckBox a2;

    @FXML
    private CheckBox a3;

    @FXML
    private CheckBox a4;

    @FXML
    private CheckBox a5;

    @FXML
    private CheckBox a6;

    @FXML
    private CheckBox a7;

    @FXML
    private CheckBox a8;

    @FXML
    private CheckBox a9;
    @FXML
    private Button save5;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        B1.getItems().addAll(moo1);
        B2.getItems().addAll(moo2);
        B3.getItems().addAll(moo3);
        B4.getItems().addAll(moo4);
        B5.getItems().addAll(moo5);
        B6.getItems().addAll(moo6);
        B7.getItems().addAll(moo7);
        B8.getItems().addAll(moo8);
        B9.getItems().addAll(moo9);
        B10.getItems().addAll(moo10);
        B11.getItems().addAll(moo11);
        B12.getItems().addAll(moo12);
        B13.getItems().addAll(moo13);
        B14.getItems().addAll(moo14);
        B15.getItems().addAll(moo15);
        B16.getItems().addAll(moo16);
        B17.getItems().addAll(moo17);
        B18.getItems().addAll(moo18);
    }
    @FXML
    public void PockBackMarket(ActionEvent event) throws IOException {
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
        a1.setOnAction(e -> handleCheckBoxAction(a1));
        a2.setOnAction(e -> handleCheckBoxAction(a2));
        a3.setOnAction(e -> handleCheckBoxAction(a3));
        a4.setOnAction(e -> handleCheckBoxAction(a4));
        a5.setOnAction(e -> handleCheckBoxAction(a5));
        a6.setOnAction(e -> handleCheckBoxAction(a6));
        a7.setOnAction(e -> handleCheckBoxAction(a7));
        a8.setOnAction(e -> handleCheckBoxAction(a8));
        a9.setOnAction(e -> handleCheckBoxAction(a9));
        a10.setOnAction(e -> handleCheckBoxAction(a10));
        a11.setOnAction(e -> handleCheckBoxAction(a11));
        a12.setOnAction(e -> handleCheckBoxAction(a12));
        a13.setOnAction(e -> handleCheckBoxAction(a13));
        a14.setOnAction(e -> handleCheckBoxAction(a14));
        a15.setOnAction(e -> handleCheckBoxAction(a15));
        a16.setOnAction(e -> handleCheckBoxAction(a16));
        a17.setOnAction(e -> handleCheckBoxAction(a17));
        a18.setOnAction(e -> handleCheckBoxAction(a18));
    }
    @FXML
    public void saveDataPock(ActionEvent event) throws IOException {
        // อ่านค่า CheckBox แต่ละตัว
        String A1 = "";
        String A2 = "";
        String A3 = "";
        String A4 = "";
        String A5 = "";
        String A6 = "";
        String A7 = "";
        String A8 = "";
        String A9 = "";
        String A10 = "";
        String A11 = "";
        String A12 = "";
        String A13 = "";
        String A14 = "";
        String A15 = "";
        String A16 = "";
        String A17 = "";
        String A18 = "";

        if (a1.isSelected()) {
            A1 = a1.getText()+ " : " + B1.getValue();
        }
        if (a2.isSelected()) {
            A2 = a2.getText()+ " : " + B2.getValue();
        }
        if (a3.isSelected()) {
            A3 = a3.getText()+ " : " + B3.getValue();
        }
        if (a4.isSelected()) {
            A4 = a4.getText()+ " : " + B4.getValue();
        }
        if (a5.isSelected()) {
            A5 = a5.getText()+ " : " + B5.getValue();
        }
        if (a6.isSelected()) {
            A6 = a6.getText()+ " : " + B6.getValue();
        }
        if (a7.isSelected()) {
            A7 = a7.getText()+ " : " + B7.getValue();
        }
        if (a8.isSelected()) {
            A8 = a8.getText()+ " : " + B8.getValue();
        }
        if (a9.isSelected()) {
            A9 = a9.getText()+ " : " + B9.getValue();
        }
        if (a10.isSelected()) {
            A10 = a10.getText()+ " : " + B10.getValue();
        }
        if (a11.isSelected()) {
            A11 = a11.getText()+ " : " + B11.getValue();
        }
        if (a12.isSelected()) {
            A12 = a12.getText()+ " : " + B12.getValue();
        }
        if (a13.isSelected()) {
            A13 = a13.getText()+ " : " + B13.getValue();
        }
        if (a14.isSelected()) {
            A14 = a14.getText()+ " : " + B14.getValue();
        }
        if (a15.isSelected()) {
            A15 = a15.getText()+ " : " + B15.getValue();
        }
        if (a16.isSelected()) {
            A16 = a16.getText()+ " : " + B16.getValue();
        }
        if (a17.isSelected()) {
            A17 = a17.getText()+ " : " + B17.getValue();
        }
        if (a18.isSelected()) {
            A18 = a18.getText()+ " : " + B18.getValue();
        }

        // แสดงผลในหน้า MenuChoose.fxml
        Label label1 = new Label("\t_______________________");
        Label label = new Label("     \n\t" + A1 + "     \n\t"+ A2 + "    \n\t"+ A3+ "    \n\t"+ A4 +
                "     \n\t"+ A5 + "    \n\t"+ A6+ "    \n\t"+ A7+ "    \n\t"+ A8 +
                "     \n\t"+ A9 + "    \n\t"+ A10+ "    \n\t"+ A11+ "    \n\t"+ A12 +
                "     \n\t"+ A13 + "    \n\t"+ A14+ "    \n\t"+ A15+ "    \n\t"+ A16+
                "     \n\t"+ A17 + "    \n\t"+ A18);
        label.setFont(new Font(17));
        VBox layout = new VBox(50);
        layout.getChildren().addAll(label,label1);
        Scene scene = new Scene(layout, 300, 500);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("รายการที่เลือก");
        stage.show();
    }
}
