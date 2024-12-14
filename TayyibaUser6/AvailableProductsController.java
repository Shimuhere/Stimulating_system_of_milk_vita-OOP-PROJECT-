package com.example.project_milkvita.TayyibaUser6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AvailableProductsController {


    @FXML
    private TableColumn<availableproducts, String> priceColumn;

    @FXML
    private TableView<availableproducts> productdetailsTableview;

    @FXML
    private TableColumn<availableproducts, String> productnameColumn;

    @FXML
    private TextField productnameTextfield;

    @FXML
    private TableColumn<availableproducts, String> stockquantityColumn;

    availableproducts product1 = new availableproducts("Butter", "200gm", "tk300");
    availableproducts product2 = new availableproducts("Cheese", "200gm",  "tk300");



    @FXML
    void viewproductdetailsButton(ActionEvent event) {
        String productname=productnameTextfield.getText();

        if (productname.equals("Butter")) {
            productdetailsTableview.getItems().setAll(product1);
        } else if (productname.equals("Cheese")) {
            productdetailsTableview.getItems().setAll(product2);
        }

    }
    @FXML
    void  initialize(){
        productnameColumn.setCellValueFactory(new PropertyValueFactory<availableproducts,String>("productname"));
        stockquantityColumn.setCellValueFactory(new PropertyValueFactory<availableproducts,String>("stockquantity"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<availableproducts,String>("price"));



    }


}

