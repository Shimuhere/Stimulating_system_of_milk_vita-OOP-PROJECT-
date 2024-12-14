package org.example.stimulating_system_of_milk_vita.shimuuser4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TrackDeliveriesController {

    @FXML
    private TextField DESTination;

    @FXML
    private TextField STAtus;

    @FXML
    private TextField deliverYID;

    @FXML
    private TableColumn<trackdeliveries,String> deliveryID;

    @FXML
    private TableColumn<trackdeliveries,String> destinationTrack;

    @FXML
    private TableColumn<trackdeliveries,String> statusTrack;

    @FXML
    private TableView<trackdeliveries> trackDeliveries;

    @FXML
    void addOnClick(ActionEvent event) {
        String destination = DESTination.getText();
        String status = statusTrack.getText();
        String delivery_id = deliveryID.getText();

    }

    @FXML
    void backOnClick(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();


    }

    @FXML
    void resolveOnClick(ActionEvent event) {

    }

}
