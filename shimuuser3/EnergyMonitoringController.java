package org.example.stimulating_system_of_milk_vita.shimuuser3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EnergyMonitoringController {

    @FXML
    private TableColumn<energymonitoring, String> MACHInename;

    @FXML
    private TextField STAtuss;

    @FXML
    private TextField energyComSump;

    @FXML
    private TableColumn<energymonitoring, String> energyCosSUMPtion;

    @FXML
    private TextField machineName;

    @FXML
    private TableColumn<energymonitoring, String> status;

    @FXML
    private TableView<energymonitoring> tableViewFOrMAchine;

    @FXML
    void addOnClIck(ActionEvent event) {
        String machine_name=machineName.getText();
        String energyComSumption=energyCosSUMPtion.getText();
        String status=STAtuss.getText();

    }

    @FXML
    void backOnClick(ActionEvent event) {
        Stage currentStage = (Stage) tableViewFOrMAchine.getScene().getWindow();
        currentStage.close();



    }

    @FXML
    void submitOnClick(ActionEvent event) {
        String machine_name=machineName.getText();
        String energyComSumption=energyCosSUMPtion.getText();
        String status=STAtuss.getText();

    }

}
