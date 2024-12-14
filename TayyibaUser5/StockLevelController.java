package com.example.project_milkvita.TayyibaUser5;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class StockLevelController
{
    @javafx.fxml.FXML
    private TableColumn <stocklevel,String> statuscolumn;
    @javafx.fxml.FXML
    private TableColumn <stocklevel,String> productnamecolumn;
    @javafx.fxml.FXML
    private TableView <String> stocklevelTableview;
    @javafx.fxml.FXML
    private TableColumn <stocklevel,String> currentquantitycolumn;
    @javafx.fxml.FXML
    private ComboBox <String> productnameCombobox;
    @javafx.fxml.FXML
    private TableColumn <stocklevel,String> requiredquantitycolumn;

    @javafx.fxml.FXML
    public void initialize() {
        productnameCombobox.getItems().addAll("Butter","Cheese","Full Cream Milk");

        productnamecolumn.setCellValueFactory(new PropertyValueFactory<stocklevel,String>("productname"));
        requiredquantitycolumn.setCellValueFactory(new PropertyValueFactory<stocklevel,String>("requiredquantity"));
        currentquantitycolumn.setCellValueFactory(new PropertyValueFactory<stocklevel,String>("currentquantity"));
        statuscolumn.setCellValueFactory(new PropertyValueFactory<stocklevel,String>("status"));
    }

    @javafx.fxml.FXML
    public void restockButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void monitorstockButton(ActionEvent actionEvent) {
    }
}