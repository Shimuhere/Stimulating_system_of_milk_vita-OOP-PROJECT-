package org.example.stimulating_system_of_milk_vita.shimuuser3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MaintenanceSystemController {

    @FXML
    private TextArea describeIssue;

    @FXML
    private ComboBox<String> selectMachine;

    @FXML
    private ComboBox<String> selectUrgency;

    @FXML
    void backHandle(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();


    }

    @FXML
    void submitHandle(ActionEvent event) {
        String selectedMachine = selectMachine.getValue();
        String selectedUrgency = selectUrgency.getValue();
        String describeIssueText = describeIssue.getText();

    }
    @FXML
    void initialize() {

    }

}
