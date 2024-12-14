package com.example.milkvitaproject.TaranayaUser8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SupplyRawMaterials {

    @FXML
    private TableColumn<SupplyRawMaterial, String> materialid;

    @FXML
    private TableColumn<SupplyRawMaterial, Integer> currentstockid;

    @FXML
    private TableView<SupplyRawMaterial> rawMaterialsTableView;

    @FXML
    private TextField quantitysupplyid;


    @FXML
    void confirmsupplybuttononaction(ActionEvent event) {
        String quantityText = quantitysupplyid.getText();

        if (!quantityText.isEmpty()) {
            try {
                int quantityToSupply = Integer.parseInt(quantityText);
                RawMaterial selectedMaterial = rawMaterialsTableView.getSelectionModel().getSelectedItem();

                if (selectedMaterial != null) {
                    int updatedStock = selectedMaterial.getCurrentStock() + quantityToSupply;
                    selectedMaterial.setCurrentStock(updatedStock);
                    rawMaterialsTableView.refresh();
                    System.out.println("Supplied " + quantityToSupply + " units of material: " + selectedMaterial.getMaterialId() + ". New stock: " + updatedStock);
                } else {
                    System.out.println("No material selected for supply.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid quantity entered. Please enter a number.");
            }
        } else {
            System.out.println("Please enter the quantity to supply.");
        }
    }

    @FXML
    void returnhomebuttononaction(ActionEvent event) {
        System.out.println("Returning to Home Screen.");
    }

    @FXML
    public void initialize() {
        materialid.setCellValueFactory(new PropertyValueFactory<>("materialId"));
        currentstockid.setCellValueFactory(new PropertyValueFactory<>("currentStock"));

        rawMaterialsTableView.getItems().addAll(
                new RawMaterial("Material01", 100),
                new RawMaterial("Material02", 200),
                new RawMaterial("Material03", 150) ''
        );
    }