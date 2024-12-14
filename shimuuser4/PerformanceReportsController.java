package org.example.stimulating_system_of_milk_vita.shimuuser4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PerformanceReportsController {

    @FXML
    private TextField overallPerformance;

    @FXML
    private DatePicker selectPeriod;

    @FXML
    void backHandle(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();


    }

    @FXML
    void submitOnClick(ActionEvent event) {
        String period = selectPeriod.getValue().toString();
        String performance = overallPerformance.getText();


    }
    @FXML
    void initialize() {

    }

}
