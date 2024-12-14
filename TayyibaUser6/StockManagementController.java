package com.example.project_milkvita.TayyibaUser6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class StockManagementController {

    @FXML
    private Label confirmlabel;

    @FXML
    private TextField currentStockTextfield;

    @FXML
    private TextField newstocklevelTextfield;

    @FXML
    private TextField productnameTextfield;


    @FXML
    void updateButton(ActionEvent event) {
        String productname= productnameTextfield.getText();
        String currentstocklevel= currentStockTextfield.getText();
        String newstocklevel= newstocklevelTextfield.getText();

        if (productnameTextfield.getText().isEmpty()||
                currentStockTextfield.getText().isEmpty()||
                newstocklevelTextfield.getText().isEmpty()){
            confirmlabel.setText("Fill up properly");
        }


        else {
            confirmlabel.setText("Update is Successful");
        }


    }

}

