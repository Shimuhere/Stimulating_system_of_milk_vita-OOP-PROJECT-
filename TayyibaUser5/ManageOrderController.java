package com.example.project_milkvita.TayyibaUser5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;

public class ManageOrderController {

    @FXML
    private DatePicker dateoforderDatepicker;
    @FXML
    private Label messageLAbel;

    @FXML
    private TextField productNameTextfield;

    @FXML
    private ComboBox<Integer> quantityCombobox;

    @FXML
    private ComboBox<String> statusCombobox;

    @FXML
     void initialize() {

        statusCombobox.getItems().addAll("Pending", "Shipped");
        quantityCombobox.getItems().addAll(500,600 );

    }


    @FXML
    void updateOrderButton(ActionEvent event) {
        if (productNameTextfield.getText().isEmpty()||
                dateoforderDatepicker.getValue().isBefore(LocalDate.now())||
                statusCombobox.getValue().isEmpty()){
            messageLAbel.setText("Fill up properly");
        }


        else {
            messageLAbel.setText("Update is Successful");
        }
        String productName = productNameTextfield.getText();
        int quantity =quantityCombobox.getValue();
        LocalDate dateoforder = dateoforderDatepicker.getValue();
        String status = statusCombobox.getValue();


    }

}
