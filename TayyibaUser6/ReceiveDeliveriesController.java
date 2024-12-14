package com.example.project_milkvita.TayyibaUser6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ReceiveDeliveriesController {

    @FXML
    private ComboBox<String> deliveryStatuscombobox;

    @FXML
    private DatePicker deliverydateDatepicker;

    @FXML
    private TextField orderQuantityTextfield;

    @FXML
    private TextField productnameTextfield;


    @FXML
    private Label messagelabel;


    @FXML
    void confirmdeliveryButton(ActionEvent event) {

        if (productnameTextfield.getText().isEmpty()||
                orderQuantityTextfield.getText().isEmpty()||
                deliverydateDatepicker.getValue().isBefore(LocalDate.now())||
                deliveryStatuscombobox.getValue().isEmpty()){
            messagelabel.setText("Fill up properly");
        }


        else {
            messagelabel.setText("Delivery is confirmed");
        }
        String productname = productnameTextfield.getText();
        int orderquantity =Integer.parseInt(orderQuantityTextfield.getText());
        LocalDate deliverydate = deliverydateDatepicker.getValue();
        String status = deliveryStatuscombobox.getValue();


    }

    @FXML
    void initialize() {

        deliveryStatuscombobox.getItems().addAll("Shipped","Pending" );

    }

}
