package com.example.milkvitaproject.TaranayaUser7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryManagmentController {

    @FXML
    private TableColumn<InventoryManagmentController, String> currentstockid;

    @FXML
    private TableColumn<InventoryManagmentController, String> productnameid;

    @FXML
    private TableView<InventoryManagmentController> inventoryTable;

    @FXML
    void confirmButtonOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirm Update");
        alert.setHeaderText(null);
        alert.setContentText("updated successfully.");
        alert.showAndWait();
    }

    @FXML
    void returnHomeButtonOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Return Home");
        alert.setHeaderText(null);
        alert.setContentText("Returning to the home screen.");
        alert.showAndWait();
    }

    @FXML
    public void initialize() {

        productnameid.setCellValueFactory(new PropertyValueFactory<>("productName"));
        currentstockid.setCellValueFactory(new PropertyValueFactory<>("currentStock"));

    }

}

