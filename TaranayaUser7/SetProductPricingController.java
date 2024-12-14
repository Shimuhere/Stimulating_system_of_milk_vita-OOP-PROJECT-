package com.example.milkvitaproject.TaranayaUser7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SetProductPricingController {

    @FXML
    private TableColumn<SetProductPricing, String> currentpriceid;

    @FXML
    private TextField newpriceid;

    @FXML
    private TableColumn<SetProductPricing, String> productnameid;

    @FXML
    private TableView<SetProductPricing> pricingTable;


    @FXML
    void updatePriceButtonOnAction(ActionEvent event) {
        ProductPrice selectedProduct = pricingTable.getSelectionModel().getSelectedItem();

        if (selectedProduct == null) {
            alert.setTitle("No Selection");
            alert.setHeaderText(null);
            alert.setContentText("select a product to update the price.");
            return;

        }
        @FXML
               void  returnHomeButtonOnAction;(ActionEvent event){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Return Home");
            alert.setHeaderText(null);
            alert.setContentText("Returning to the home screen");

        }




    }