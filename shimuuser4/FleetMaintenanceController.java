package org.example.stimulating_system_of_milk_vita.shimuuser4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FleetMaintenanceController {

    @FXML
    private DatePicker dueDate;

    @FXML
    private TextField maintenAnceStatus;

    @FXML
    private TableColumn<fleetmaintenance,String> maintenanceDue;

    @FXML
    private TextField maintenanceLog;

    @FXML
    private DatePicker maintenanceReschedule;

    @FXML
    private TableView<fleetmaintenance> maintenanceSchedule;

    @FXML
    private TableColumn<fleetmaintenance,String> maintenanceStatus;

    @FXML
    private TextField vehiCleId;

    @FXML
    private TableColumn<fleetmaintenance,String> vehicleId;

    @FXML
    void addOnClick(ActionEvent event) {
        String vehicleId = vehiCleId.getText();
        String maintenance_log = maintenanceLog.getText();

    }

    @FXML
    void backButton(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();

    }

    @FXML
    void updateSchedulebutton(ActionEvent event) {

    }
    @FXML
    void initialize() {}

}
