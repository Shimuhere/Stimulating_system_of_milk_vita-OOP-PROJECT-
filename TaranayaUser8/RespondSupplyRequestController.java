package com.example.milkvitaproject.TaranayaUser8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class RespondSupplyRequests {

    @FXML
    private TableColumn<RespondSupplyRequest, String> materialid;

    @FXML
    private TableColumn<RespondSupplyRequest, String> requestid;

    @FXML
    private TableColumn<RespondSupplyRequest, String> statusid;

    @FXML
    private TableView<RespondSupplyRequest> supplyRequestTableView;

    @FXML
    private TextField responseid;

    // Confirm Button Action
    @FXML
    void confirmbuttononaction(ActionEvent event) {
        String responseText = responseid.getText();

        if (!responseText.isEmpty()) {
            SupplyRequest selectedRequest = supplyRequestTableView.getSelectionModel().getSelectedItem();

            if (selectedRequest != null) {
                selectedRequest.setStatus("Responded");
                selectedRequest.setResponse(responseText);
                supplyRequestTableView.refresh();
                System.out.println("Response to Request ID: " + selectedRequest.getRequestId() + " added: " + responseText);
            } else {
                System.out.println("No supply request selected to respond.");
            }
        } else {
            System.out.println("Please enter a response before confirming.");
        }
    }


    @FXML
    void returnhomebuttononaction(ActionEvent event) {
        System.out.println("Returning to Home Screen.");
    }

    @FXML
    public void initialize() {

        materialid.setCellValueFactory(new PropertyValueFactory<>("materialId"));
        requestid.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        statusid.setCellValueFactory(new PropertyValueFactory<>("status"));

