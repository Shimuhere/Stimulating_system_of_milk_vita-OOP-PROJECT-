package com.example.project_milkvita.TayyibaUser5;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class SalesDataController {
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private DatePicker salesdateDatepicker;
    @javafx.fxml.FXML
    private TextArea remarksTextArea;
    @javafx.fxml.FXML
    private TextField quantityTextfield;
    @javafx.fxml.FXML
    private TextField productNameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        salesdateDatepicker.setValue(LocalDate.now());
        confirmationLabel.setText("");


    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
        String productname = productNameTextfield.getText();
        String quantity = quantityTextfield.getText();
        LocalDate salesdate = salesdateDatepicker.getValue();
        String remarks = remarksTextArea.getText();

        if (productNameTextfield.getText().isEmpty() ||
                quantityTextfield.getText().isEmpty() ||
                salesdateDatepicker.getValue() == null) {
            confirmationLabel.setText("Fill up the form properly");
        } else {
            confirmationLabel.setText("Sales Data Collected");
        }
    }

}

