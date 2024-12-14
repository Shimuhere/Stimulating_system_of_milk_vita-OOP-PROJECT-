package com.example.project_milkvita.TayyibaUser5;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ProductReturnsController
{
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField reasonTextfield;
    @javafx.fxml.FXML
    private TextField quantityTextfield;
    @javafx.fxml.FXML
    private ComboBox <String>productNamecombobox;

    @javafx.fxml.FXML
    public void initialize() {
        productNamecombobox.getItems().addAll("Butter","Cheese","Milk");

    }


    @javafx.fxml.FXML
    public void returnButton(ActionEvent actionEvent) {
        String productname=productNamecombobox.getValue();
        int quantity =Integer.parseInt(quantityTextfield.getText());
        String reason= reasonTextfield.getText();

        if (productNamecombobox.getValue().isEmpty()||
                reasonTextfield.getText().isEmpty()){
            messageLabel.setText("Fill up properly");
        }


        else {
            messageLabel.setText("Return is Successful");
        }

    }
}