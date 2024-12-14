
package com.example.project_milkvita.TayyibaUser6;

import com.example.project_milkvita.TayyibaUser5.assignedretailer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class ManageDiscountsController {

    @FXML
    private TableColumn<managediscounts, String> currentpriceColumn;

    @FXML
    private TextField currentpriceTextfield;

    @FXML
    private TableView<managediscounts> discountTableview;

    @FXML
    private TextField discountpercentageTextfield;

    @FXML
    private TableColumn<managediscounts, String> productnameColumn;

    @FXML
    private TextField productnameTextfield;





    @FXML
    void addbutton(ActionEvent event) {
        String productname = productnameTextfield.getText();
        String currentprice= currentpriceTextfield.getText();


    }

    @FXML
    void applydiscountsButton(ActionEvent event) {


    }

    @FXML
    void initialize() {
        productnameColumn.setCellValueFactory(new PropertyValueFactory<managediscounts, String>("productname"));
        currentpriceColumn.setCellValueFactory(new PropertyValueFactory<managediscounts, String>("currentprice"));

    }




    }
