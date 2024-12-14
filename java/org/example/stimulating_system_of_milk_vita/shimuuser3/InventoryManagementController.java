package org.example.stimulating_system_of_milk_vita.shimuuser3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class InventoryManagementController {

    @FXML
    private AnchorPane materialType;

    @FXML
    private ComboBox<String> selecTmaterial;

    @FXML
    private ComboBox<String> stockLevel;

    @FXML
    void backHandle(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();


    }

    @FXML
    void submitHandle(ActionEvent event) {
        String material = selecTmaterial.getValue();
        String stock = stockLevel.getValue();

    }

}
