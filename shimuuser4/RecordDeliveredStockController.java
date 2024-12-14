package org.example.stimulating_system_of_milk_vita.shimuuser4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RecordDeliveredStockController {

    @FXML
    private TextField Status;

    @FXML
    private TableColumn<recorddeliveredstock,String> deliverID;

    @FXML
    private TextField deliveryId;

    @FXML
    private TextField expEctedQuality;

    @FXML
    private TableColumn<recorddeliveredstock,String> expectedQuality;

    @FXML
    private TextField productNAme;

    @FXML
    private TableColumn<recorddeliveredstock,String> productName;

    @FXML
    private TableColumn<recorddeliveredstock,String> statusRecord;

    @FXML
    private TableView<recorddeliveredstock> tableRecord;

    @FXML
    void addOnClick(ActionEvent event) {
        String productName = this.productName.getText();
        String status = this.Status.getText();
        String statusRecord = this.statusRecord.getText();
        String expected_quality = this.expectedQuality.getText();

    }

    @FXML
    void backOnClick(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();


    }

    @FXML
    void submitOnClick(ActionEvent event) {

    }

}
