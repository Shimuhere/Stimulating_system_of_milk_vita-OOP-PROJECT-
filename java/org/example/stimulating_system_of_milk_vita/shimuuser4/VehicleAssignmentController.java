package org.example.stimulating_system_of_milk_vita.shimuuser4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VehicleAssignmentController {

    @FXML
    private TextField CAPAcity;

    @FXML
    private TextField StAtUs;

    @FXML
    private ComboBox<String> assignVehicle;

    @FXML
    private TableColumn<vehicleassignment,String> capacityVehicle;

    @FXML
    private TextField deliverYID;

    @FXML
    private ComboBox<String> deliveryRoute;

    @FXML
    private TableColumn<vehicleassignment,String> statusVehicle;

    @FXML
    private TableView<vehicleassignment> vehicleAssignementTable;

    @FXML
    private TableColumn<vehicleassignment,String> vehicleID;

    @FXML
    void addOnClick(ActionEvent event) {
        String deliveryID = assignVehicle.getValue();
        String capacity=CAPAcity.getText();
        String status=deliveryRoute.getValue();

    }

    @FXML
    void backOnClick(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();


    }

    @FXML
    void submitOnClick(ActionEvent event) {
        String deliveryID = assignVehicle.getValue();
        String capacity=CAPAcity.getText();
        String status=deliveryRoute.getValue();

    }

}
