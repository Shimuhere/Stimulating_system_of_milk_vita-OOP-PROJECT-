package com.example.project_milkvita.TayyibaUser5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class PrintController {

    @FXML
    private TableColumn<print, String> DateofsaleColumn;

    @FXML
    private Label confirmationmessageLabel;

    @FXML
    private DatePicker dateofsaleDatePicker;

    @FXML
    private TextField productNameTextfield;

    @FXML
    private TableColumn<print, String> productnameColumn;

    @FXML
    private TableColumn<print, Integer> quantityColumn;

    @FXML
    private TextField quantityTextfield;

    @FXML
    private TextField retailerNameTextfield;

    @FXML
    private TableColumn<print, String> retailernameColumn;

    @FXML
    private TableView<print> salesDataTableview;

    private final ArrayList<print> info = new ArrayList<>();

    @FXML
    void addButton(ActionEvent event) {

        String retailername=retailerNameTextfield.getText();
        String productname= productNameTextfield.getText();
        int quantity =Integer.parseInt(quantityTextfield.getText());
        LocalDate dateofsale= dateofsaleDatePicker.getValue();

        print record =new print (retailername,productname, quantity,dateofsale);
        info.add(record);
        salesDataTableview.getItems().clear();
        salesDataTableview.getItems().addAll(info);


    }


    @FXML
    void printsalesdataButton(ActionEvent event) {

        confirmationmessageLabel.setText("Print is Successful");

    }
    @FXML
    void initialize(){
        dateofsaleDatePicker.setValue(LocalDate.now());

        retailernameColumn.setCellValueFactory(new PropertyValueFactory<print,String>("retailername"));
        productnameColumn.setCellValueFactory(new PropertyValueFactory<print,String>("productname"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<print,Integer>("quantity"));
        DateofsaleColumn.setCellValueFactory(new PropertyValueFactory<print,String>("dateofsale"));

        confirmationmessageLabel.setText("");

    }

}
