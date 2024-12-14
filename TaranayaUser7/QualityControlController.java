package com.example.milkvitaproject.TaranayaUser7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class QualityControlController {

    @FXML
    private TableColumn<QualityControl, String> inspectiondateid;

    @FXML
    private TableColumn<QualityControl, String> productlistid;

    @FXML
    private TableColumn<QualityControl, String> statusid;

    @FXML
    private TableView<QualityControl> inspectionTable;

    @FXML
    void inspectButtonOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Inspection");
        alert.setHeaderText(null);
        alert.setContentText("successfully completed.");

    }

    @FXML
    void returnHomeButtonOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Return Home");
        alert.setHeaderText(null);
        alert.setContentText("Returning to the home screen.");

    }

    @FXML
    void saveButtonOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Save");
        alert.setHeaderText(null);
        alert.setContentText("Inspection data has been saved successfully.");

    }

    @FXML
    public void initialize() {
        inspectiondateid.setCellValueFactory(new PropertyValueFactory<>("inspectionDate"));
        productlistid.setCellValueFactory(new PropertyValueFactory<>("productList"));
        statusid.setCellValueFactory(new PropertyValueFactory<>("status"));}
    }
