package org.example.stimulating_system_of_milk_vita.shimuuser3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DailyProductionController {

    @FXML
    private TextField batchCompletionStatus;

    @FXML
    private TextField dailyProductionTargetField;

    @FXML
    private TextField defectiveUnitsField;

    @FXML
    private TextField totalUnitProducedField;
    @FXML
    void backhandle(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();
        System.out.println("Back button clicked. Returning to the previous screen.");
    }


    @FXML
    void saveAction(ActionEvent event) {
        String production_target=dailyProductionTargetField.getText();
        String total_units=totalUnitProducedField.getText();
        String defective_units=defectiveUnitsField.getText();
        String batch_status=batchCompletionStatus.getText();


    }
    @FXML
    void initialize() {

    }

}
