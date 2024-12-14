package com.example.project_milkvita.TayyibaUser6;

import com.example.project_milkvita.TayyibaUser5.print;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class StockAlertController {

    @FXML
    private ComboBox<String> alertStatusCombobox;

    @FXML
    private TableColumn<stockalert,String> alertstatusColumn;

    @FXML
    private TableColumn<stockalert,Integer> currentstockColumn;

    @FXML
    private TextField currentstockTextfield;

    @FXML
    private TableColumn<stockalert,String> productnameColumn;

    @FXML
    private ComboBox<String> productnameCombobox;

    @FXML
    private Label showMessage;

    @FXML
    private TableView<stockalert> stockalerttableview;

    @FXML
    private TableColumn<stockalert,Integer> totalStockColumn;

    @FXML
    private TextField totalstockTextfield;


    @FXML
    void restockproductButton(ActionEvent event) {
        showMessage.setText("Restock is Successful");

    }
    ArrayList<stockalert> alert = new ArrayList<>();
    @FXML
    void showthestockButton(ActionEvent event) {
        String productname=productnameCombobox.getValue();
        int totalstock =Integer.parseInt(totalstockTextfield.getText());
        int currentstock =Integer.parseInt(currentstockTextfield.getText());
        String alertstatus=alertStatusCombobox.getValue();

        stockalert record =new stockalert (productname,totalstock, currentstock,alertstatus);
        alert.add(record);
        stockalerttableview.getItems().clear();
        stockalerttableview.getItems().addAll(alert);

    }
    @FXML
    void initialize(){
        productnameCombobox.getItems().addAll("Butter", "Milk");
        alertStatusCombobox.getItems().addAll("Low Stock","Out of Stock" );

        productnameColumn.setCellValueFactory(new PropertyValueFactory<stockalert,String>("productname"));
        totalStockColumn.setCellValueFactory(new PropertyValueFactory<stockalert,Integer>("totalstock"));
        currentstockColumn.setCellValueFactory(new PropertyValueFactory<stockalert,Integer>("currentstock"));
        alertstatusColumn.setCellValueFactory(new PropertyValueFactory<stockalert,String>("alertstatus"));

        showMessage.setText("");


    }

}

