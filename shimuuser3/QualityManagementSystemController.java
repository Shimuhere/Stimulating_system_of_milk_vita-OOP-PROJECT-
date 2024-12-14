package org.example.stimulating_system_of_milk_vita.shimuuser3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class QualityManagementSystemController {

    @FXML
    private ComboBox<String> currentBatch;

    @FXML
    private TextField temperatureBatch;

    @FXML
    private TextField weightBatch;

    @FXML
    void backHandle(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();



    }

    @FXML
    void submitHandle(ActionEvent event) {
        String current_production_batch=currentBatch.getValue();
        String current_temperature_batch=temperatureBatch.getText();
        String current_weight_batch=weightBatch.getText();

    }
    @FXML
    void initialize() {

    }

}
