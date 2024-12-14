package com.example.milkvitaproject.TaranayaUser7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class GenerateSalesReport {

    @FXML
    private TableColumn<SalesReport, String> productid;

    @FXML
    private TableColumn<SalesReport, String> revenueid;

    @FXML
    private TableColumn<SalesReport, String> salesid;

    @FXML
    private TableView<SalesReport> salesReportTable;

    @FXML
    void generateReportOnActionButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Generate Report");
        alert.setHeaderText(null);
        alert.setContentText("Sales report has been generated successfully.");
        alert.showAndWait();
    }

    @FXML
    void reportingPeriodOnActionButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Reporting Period");
        alert.setHeaderText(null);
        alert.setContentText("Please select the reporting period.");
        alert.showAndWait();
    }

    @FXML
    void saveButtonOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Save Report");
        alert.setHeaderText(null);
        alert.setContentText("Sales report has been saved successfully.");
        alert.showAndWait();
    }

    @FXML
    public void initialize() {
        // Set up table columns
        productid.setCellValueFactory(new PropertyValueFactory<>("productId"));
        salesid.setCellValueFactory(new PropertyValueFactory<>("sales"));
        revenueid.setCellValueFactory(new PropertyValueFactory<>("revenue"));
