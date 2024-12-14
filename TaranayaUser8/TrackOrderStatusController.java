package com.example.milkvitaproject.TaranayaUser8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TrackOrderStatusController {

    @FXML
    private TableColumn<TrackOrderStatus, String> customernameid;

    @FXML
    private TableColumn<TrackOrderStatus, String> orderid;

    @FXML
    private TableColumn<TrackOrderStatus, String> statusid;

    @FXML
    private TableView<TrackOrderStatus> orderTableView;

    @FXML
    private TextField newstatusid;

    // Return Home Button Action
    @FXML
    void returnhomeonaction(ActionEvent event) {
        System.out.println("Returning to Home Screen.");
    }

    @FXML
    void updatestatusonaction(ActionEvent event) {
        String newStatus = newstatusid.getText();

        if (!newStatus.isEmpty()) {
            Order selectedOrder = orderTableView.getSelectionModel().getSelectedItem();

            if (selectedOrder != null) {
                selectedOrder.setStatus(newStatus);
                orderTableView.refresh();
                System.out.println("Updated order status: " + selectedOrder.getOrderId() + " to: " + newStatus);
            } else {
            System.out.println("Enter a new status: ");
        }
    }

    @FXML
        void initialize;() {

        customernameid.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        orderid.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        statusid.setCellValueFactory(new PropertyValueFactory<>("status"));
