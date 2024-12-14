package com.example.project_milkvita.TayyibaUser5;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class NewProductController
{
    @javafx.fxml.FXML
    private TableColumn<newproduct,String> stocklevelColumn;
    @javafx.fxml.FXML
    private TableView <String> productsTableview;
    @javafx.fxml.FXML
    private TableColumn<newproduct,String> productNameColumn;
    @javafx.fxml.FXML
    private ComboBox<String> productnameCombobox;
    @javafx.fxml.FXML
    private TableColumn<newproduct,String> priceColumn;


    @javafx.fxml.FXML
    public void initialize() {
        productnameCombobox.getItems().addAll("Butter","Cheese","Full Cream Milk");

        productNameColumn.setCellValueFactory(new PropertyValueFactory<newproduct,String>("productname"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<newproduct,String>("price"));
        stocklevelColumn.setCellValueFactory(new PropertyValueFactory<newproduct,String>("stocklevel"));

        ArrayList<newproduct> productList = new ArrayList<>();
        productList.add(new newproduct("Butter", "50", "100"));
        productList.add(new newproduct("Cheese", "60", "150"));
        productList.add(new newproduct("Full Cream Milk", "40", "200"));

        productsTableview.getItems().addAll(String.valueOf(productList));
    }



    @javafx.fxml.FXML
    public void productDetailsButton(ActionEvent actionEvent) {
        String productname = productnameCombobox.getValue();

    }




}