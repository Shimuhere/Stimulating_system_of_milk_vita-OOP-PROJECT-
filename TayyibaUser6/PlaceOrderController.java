package com.example.project_milkvita.TayyibaUser6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PlaceOrderController {

    @FXML
    private TextArea deliveryaddresstextarea;

    @FXML
    private TextField productnameTextField;

    @FXML
    private TextField quantityTextfield;

    @FXML
    private Label showAlert;


    @FXML
    void submitButton(ActionEvent event) {

        if (productnameTextField.getText().isEmpty() ||
                quantityTextfield.getText().isEmpty()||
                deliveryaddresstextarea.getText().isEmpty()) {
            showAlert.setText("Please fill in all fields");

        }
        else{
            showAlert.setText("Order placement is successful");
        }
        String productname = productnameTextField.getText();
        int quantity = Integer.parseInt(quantityTextfield.getText());
        String deliveryddress = deliveryaddresstextarea.getText();

    }
    @FXML
    void initialize(){

        showAlert.setText("");
    }

}

