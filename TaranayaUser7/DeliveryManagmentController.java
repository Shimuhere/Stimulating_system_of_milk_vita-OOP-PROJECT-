package com.example.milkvitaproject.TaranayaUser7;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;

public class DeliveryManagmentController {

    @FXML
    private TableColumn<DeliveryManagment, String> deliverydateid;

    @FXML
    private AnchorPane deliverystatusid;

    @FXML
    private TableColumn<DeliveryManagment, String> orderid;

    @FXML
    private TableColumn<DeliveryManagment, String> statusid;

    @FXML
    private TableView<DeliveryManagment> deliveryTable;

    @FXML
    private Button returnHomeButton;

    @FXML
    private Button saveChangesButton;


    @FXML
    public void initialize() {
        // Set up table columns
        orderid.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        deliverydateid.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        statusid.setCellValueFactory(new PropertyValueFactory<>("status"));


        deliveryTable.getItems().addAll(
                new DeliveryManagment("ORD01", "2024-11-29", "Delivered"),
                new DeliveryManagment("ORD02", "2024-12-5", "Pending"),
                new DeliveryManagment("ORD03", "2024-12-17", "In Transit"));}

    }