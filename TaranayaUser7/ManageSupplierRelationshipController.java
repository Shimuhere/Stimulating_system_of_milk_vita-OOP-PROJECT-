package com.example.milkvitaproject.TaranayaUser7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.function.Supplier;

public class ManageSupplierRelationshipController {

    @FXML
    private TableColumn<Supplier, String> contactid;

    @FXML
    private TableColumn<Supplier, String> emailid;

    @FXML
    private TableColumn<Supplier, String> nameid;

    @FXML
    private TableView<Supplier> supplierTable;

    @FXML
    void communicateOnActionButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Communicate");
        alert.setHeaderText(null);
        alert.setContentText("Communicating with the supplier...");
        alert.showAndWait();
    }

    @FXML
    void returnHomeOnActionButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Return Home");
        alert.setHeaderText(null);
        alert.setContentText("Returning to the home screen.");
        alert.showAndWait();
    }

    @FXML
    void sendEmailOnActionButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Send Email");
        alert.setHeaderText(null);
        alert.setContentText("Email sent to the supplier.");
        alert.showAndWait();
    }

    @FXML
    void sendMessageOnActionButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Send Message");
        alert.setHeaderText(null);
        alert.setContentText("Message sent to the supplier.");
        alert.showAndWait();
    }

    @FXML
    public void initialize() {
        nameid.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailid.setCellValueFactory(new PropertyValueFactory<>("email"));
        contactid.setCellValueFactory(new PropertyValueFactory<>("contact"));
