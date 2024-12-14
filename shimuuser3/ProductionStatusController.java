package org.example.stimulating_system_of_milk_vita.shimuuser3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ProductionStatusController {

    @FXML
    private ComboBox<String> batchStatus;

    @FXML
    private TextField fieldProduction;

    @FXML
    private ComboBox<String> productionBatch;

    @FXML
    void backOnClick(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();


    }

    @FXML
    void submitOnClick(ActionEvent event) {
        String productionBatchValue = productionBatch.getValue();
        String batchStatusValue = batchStatus.getValue();
        String additionalNotes=fieldProduction.getText();

    }
    @FXML
    void initialize() {}

}
