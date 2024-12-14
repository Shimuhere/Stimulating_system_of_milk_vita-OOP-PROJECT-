package com.example.milkvitaproject.TaranayaUser8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HandleProductReturnController{

    @FXML
    private TextField commentsid;

    @FXML
    private TableColumn<HandleProductReturn,String> productid;

    @FXML
    private TableColumn<HandleProductReturn, String> reasonid;

    @FXML
    private TableColumn<HandleProductReturn, String> statusid;

    @FXML
    private TableView<HandleProductReturn> productReturnsTableView;


    @FXML
    void processreturnonaction(ActionEvent event) {
        String comments = commentsid.getText();

        if (!comments.isEmpty()) {
            System.out.println("Processing product return with comments: " + comments);
        } else {
            System.out.println("Please provide comments before processing the return.");
        }
    }


    @FXML
    void returnhomeonaction(ActionEvent event) {
        System.out.println("Returning to Home Screen.");
    }

    @FXML
    void initialize {
        productid.setCellValueFactory(new PropertyValueFactory<>("productId"));
        reasonid.setCellValueFactory(new PropertyValueFactory<>("reason"));
        statusid.setCellValueFactory(new PropertyValueFactory<>("status"));
}
