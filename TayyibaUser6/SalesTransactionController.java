package com.example.project_milkvita.TayyibaUser6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class SalesTransactionController {

    @FXML
    private Label messegelabel;

    @FXML
    private TextField productnameTextfield;

    @FXML
    private TextField quantityTextfield;

    @FXML
    private DatePicker saledateDatepicker;

    @FXML
    private TextField salepricetextfield;


    @FXML
    void recordtransactionButton(ActionEvent event) {

        if (productnameTextfield.getText().isEmpty()||
                quantityTextfield.getText().isEmpty()||
                salepricetextfield.getText().isEmpty()){
            messegelabel.setText("Fill up properly");
        }


        else {
            messegelabel.setText("Transaction is Successful");
        }
        String productname = productnameTextfield.getText();
        int quantity = Integer.parseInt(quantityTextfield.getText());
        int saleprice = Integer.parseInt(salepricetextfield.getText());
        LocalDate saledate = saledateDatepicker.getValue();

    }
    @FXML
    void initialize() {
        saledateDatepicker.setValue(LocalDate.now());

    }
}

