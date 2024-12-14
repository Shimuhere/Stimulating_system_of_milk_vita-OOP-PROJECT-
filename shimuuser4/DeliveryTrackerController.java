package org.example.stimulating_system_of_milk_vita.shimuuser4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DeliveryTrackerController {

    @FXML
    private Button backHandle;

    @FXML
    private DatePicker dateOfReschedule;

    @FXML
    private TableColumn<deliverytracker,String> deliveryID;

    @FXML
    private TextField deliveryId;

    @FXML
    private TableView<deliverytracker> deliveryTrackerView;

    @FXML
    private TextField destinAtion;

    @FXML
    private TableColumn<deliverytracker,String> destination;

    @FXML
    private Button markAsCompletedButton;

    @FXML
    private TextField staTus;

    @FXML
    private TableColumn<deliverytracker,String> status;

    @FXML
    private Button updateSchedule;

    @FXML
    void addOnClick(ActionEvent event) {
        String destination=destinAtion.getText();
        String deliveryID=this.deliveryId.getText();
        String status=this.status.getText();


    }

}
