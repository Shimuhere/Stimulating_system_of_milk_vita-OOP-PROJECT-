package org.example.stimulating_system_of_milk_vita.shimuuser4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MonitorDeliveryVehiclesController {

    @FXML
    private TableColumn<monitordeliveryvehicle,String> avgDeliveryTime;

    @FXML
    private TableColumn<monitordeliveryvehicle,String> currentStatus;

    @FXML
    private ComboBox<String> current_status;

    @FXML
    private TextField deliveryTime;

    @FXML
    private TextField issueIdenTified;

    @FXML
    private TableColumn<monitordeliveryvehicle,String> issueIdentified;

    @FXML
    private TableView<monitordeliveryvehicle> monitorDeliveryVehicle;

    @FXML
    private TableColumn<monitordeliveryvehicle,String> vehicleID;

    @FXML
    private TextField vehicleId;

    @FXML
    void addOnClick(ActionEvent event) {
        String delivery_time = deliveryTime.getText();
        String current_status=currentStatus.getText();
        String issue_identification=issueIdenTified.getText();

    }

    @FXML
    void backHandle(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();


    }

    @FXML
    void submitOnClick(ActionEvent event) {
        String delivery_time = deliveryTime.getText();
        String current_status=currentStatus.getText();
        String issue_identification=issueIdenTified.getText();


    }
    @FXML
    void initialize() {

    }

}
