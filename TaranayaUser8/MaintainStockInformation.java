package com.example.milkvitaproject.TaranayaUser8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MaintainStockInformation {

    @FXML
    private TableColumn<MaintainStockInfo, String> materialsid;

    @FXML
    private TableColumn<MaintainStockInfo,, Integer> stocklevelid;

    @FXML
    private TableView<MaintainStockInfo,> stockTableView;

    @FXML
    private TextField newstocklevelid;

    // Return Home Button Action
    @FXML
    void returnhomebuttononaction(ActionEvent event) {
        System.out.println("Returning to Home Screen.");
    }

    // Update Stock Button Action
    @FXML
    void updatestockbuttononaction(ActionEvent event) {
        String newStockLevelText = newstocklevelid.getText();

        if (!newStockLevelText.isEmpty()) {
            try {
                int newStockLevel = Integer.parseInt(newStockLevelText);
                // For demonstration, we assume updating the first item in the table
                StockItem selectedItem = stockTableView.getSelectionModel().getSelectedItem();

                if (selectedItem != null) {
                    selectedItem.setStockLevel(newStockLevel);
                    stockTableView.refresh();
                    System.out.println("Updated stock level for material: " + selectedItem.getMaterialId() + " to " + newStockLevel);
                } else {
                    System.out.println("No material selected to update stock.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid stock level entered. Please enter a number.");
            }
        } else {
            System.out.println("Please enter a new stock level.");
        }
    }

    @FXML
    public void initialize() {
        // Set up table columns
        materialsid.setCellValueFactory(new PropertyValueFactory<>("materialId"));
        stocklevelid.setCellValueFactory(new PropertyValueFactory<>("stockLevel"));

        // Add sample data (for testing purposes)
        stockTableView.getItems().addAll(
                new StockItem("Material001", 50),
                new StockItem("Material002", 30),
                new StockItem("Material003", 70)
        );

        System.out.println("MaintainStockInformation Controller initialized.");
    }
