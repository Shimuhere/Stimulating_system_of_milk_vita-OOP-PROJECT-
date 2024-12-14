package com.example.milkvitaproject.TaranayaUser8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ManageDeliverySchedules {

    @FXML
    private TableColumn<ManageDeliverySchedule, String> dateid;

    @FXML
    private TableColumn<ManageDeliverySchedule, String> deliveryid;

    @FXML
    private TableColumn<ManageDeliverySchedule, String> statusid;

    @FXML
    private TableView<ManageDeliverySchedule> deliveryTableView;

    @FXML
    private DatePicker dobdatepicker;

    // Return Home Button Action
    @FXML
    void returnhomebuttononaction(ActionEvent event) {
        System.out.println("Returning to Home Screen.");
    }

    // Update Schedule Button Action
    @FXML
    void updatescheduleonaction(ActionEvent event) {
        if (dobdatepicker.getValue() != null) {
            String selectedDate = dobdatepicker.getValue().toString();
            DeliverySchedule selectedItem = deliveryTableView.getSelectionModel().getSelectedItem();

            if (selectedItem != null) {
                selectedItem.setDate(selectedDate);
                deliveryTableView.refresh();
                System.out.println("Updated delivery date: " + selectedItem.getDeliveryId() + " to " + selectedDate);
            } else {
                System.out.println("Nothing to to update.");
            }
        } else {
            System.out.println("select a date");
        }
    }

    @FXML
    public void initialize() {
        dateid.setCellValueFactory(new PropertyValueFactory<>("date"));
        deliveryid.setCellValueFactory(new PropertyValueFactory<>("deliveryId"));
        statusid.setCellValueFactory(new PropertyValueFactory<>("status"));}
