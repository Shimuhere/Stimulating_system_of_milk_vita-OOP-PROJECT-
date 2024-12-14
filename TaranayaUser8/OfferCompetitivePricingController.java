package com.example.milkvitaproject.TaranayaUser8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class OfferCompetitivePricingController {

    @FXML
    private TableColumn<OfferCompetitivePricing, String> materialid;

    @FXML
    private TableColumn<OfferCompetitivePricing, Double> currentpriceid;

    @FXML
    private TableView<OfferCompetitivePricing> pricingTableView;

    @FXML
    private TextField newpriceid;


    @FXML
    void returnhomeonaction(ActionEvent event) {
        System.out.println("Returning to Home Screen.");
    }


    @FXML
    void submitonaction(ActionEvent event) {
        String newPriceText = newpriceid.getText();

        if (!newPriceText.isEmpty()) {
            try {
                double newPrice = Double.parseDouble(newPriceText);
                PricingItem selectedItem = pricingTableView.getSelectionModel().getSelectedItem();

                if (selectedItem != null) {
                    selectedItem.setCurrentPrice(newPrice);
                    pricingTableView.refresh();
                    System.out.println("Updated price for material: " + selectedItem.getMaterialId() + " to " + newPrice);
                }
                else {
                    System.out.println("No material selected to update price.");
                }

    }
