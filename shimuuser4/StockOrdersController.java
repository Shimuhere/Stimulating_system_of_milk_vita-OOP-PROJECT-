package org.example.stimulating_system_of_milk_vita.shimuuser4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StockOrdersController {

    @FXML
    private TextField PRoduct;

    @FXML
    private DatePicker adjustDeliverySchedule;

    @FXML
    private TextField naMe;

    @FXML
    private TableView<stockorders> pendingStock;

    @FXML
    private TableColumn<stockorders,String> productStock;

    @FXML
    private TextField quanTITy;

    @FXML
    private TableColumn<stockorders,String> quantityStock;

    @FXML
    private TextField supplIerName;

    @FXML
    private TextField supplierEmail;

    @FXML
    private TableColumn<stockorders,String> supplierName;

    @FXML
    private TextField supplierPhone;

    @FXML
    void addOnCLick(ActionEvent event) {
        String productName = PRoduct.getText();
        String quantity = quanTITy.getText();
        String expected_quality=quanTITy.textProperty().get();

    }

    @FXML
    void backOnClick(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();


    }

    @FXML
    void submitOnClick(ActionEvent event) {

        String productName = PRoduct.getText();
        String quantity = quanTITy.getText();
        String expected_quality=quanTITy.textProperty().get();


    }

}
