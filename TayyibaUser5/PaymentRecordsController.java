package com.example.project_milkvita.TayyibaUser5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class PaymentRecordsController {

    @FXML
    private Label messegelabel;
    @FXML
    private DatePicker paymentDateDatepicker;

    @FXML
    private TextField paymentamountTextfield;

    @FXML
    private ComboBox<String> paymentmethodCombobox;


    @FXML
    void confirmButton(ActionEvent event) {
        if (paymentamountTextfield.getText().isEmpty()||
                paymentDateDatepicker.getValue().isBefore(LocalDate.now())||
                paymentmethodCombobox.getValue().isEmpty()){
            messegelabel.setText("Fill up properly");
        }


        else {
            messegelabel.setText("Recording Payment is Successful");
        }

        int paymentamount = Integer.parseInt(paymentamountTextfield.getText());
        LocalDate paymentdate = paymentDateDatepicker.getValue();
        String paymentMethod = paymentmethodCombobox.getValue();



    }
    @FXML
    void initialize() {

        paymentmethodCombobox.getItems().addAll("Cash", "Credit Card");
    }

}
