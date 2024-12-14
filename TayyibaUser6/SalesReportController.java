package com.example.project_milkvita.TayyibaUser6;

import com.example.project_milkvita.TayyibaUser5.print;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class SalesReportController {

    @FXML
    private TableColumn<salesreport,String> productnameColumn;

    @FXML
    private ComboBox<String> productnameCombobox;

    @FXML
    private TableColumn<salesreport,Integer> quantitysoldColumn;

    @FXML
    private TextField quantitysoldtextfield;

    @FXML
    private TableView<salesreport> reportTableview;

    @FXML
    private TextField totalSaleTextfield;

    @FXML
    private TableColumn<salesreport,Integer> totalsalecolumn;

    ArrayList<salesreport> report = new ArrayList<>();
    @FXML
    void viewreportButton(ActionEvent event) {
        String productname = productnameCombobox.getValue();
        int quantitysold =Integer.parseInt(quantitysoldtextfield.getText());
        int totalsale=Integer.parseInt(totalSaleTextfield.getText());

        salesreport viewreport =new salesreport (productname, quantitysold,totalsale);
        report.add(viewreport);
        reportTableview.getItems().clear();
        reportTableview.getItems().addAll(report);

    }

    @FXML
    void initialize(){
        productnameCombobox.getItems().addAll("Butter", "Cheese","Milk");

        productnameColumn.setCellValueFactory(new PropertyValueFactory<salesreport,String>("productname"));
        quantitysoldColumn.setCellValueFactory(new PropertyValueFactory<salesreport,Integer>("quantitysold"));
        totalsalecolumn.setCellValueFactory(new PropertyValueFactory<salesreport,Integer>("totalsale"));
    }

}

