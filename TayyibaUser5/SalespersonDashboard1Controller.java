package com.example.project_milkvita.TayyibaUser5;

import com.example.project_milkvita.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class SalespersonDashboard1Controller {

    @FXML
    private BorderPane salespersondashboard;

    @FXML
    void mangeordersButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Manage_Order.fxml"));
            salespersondashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void newproductButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("New_Product.fxml"));
            salespersondashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void paymentrecordsButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Payment_Records.fxml"));
            salespersondashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void printButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("print.fxml"));
            salespersondashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void productreturnsButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Produce_Returns.fxml"));
            salespersondashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @Deprecated
    void retailermanagementButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Assigned_Retailer.fxml"));
            salespersondashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void salesdataButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sales_Data.fxml"));
            salespersondashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void stocklevelButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Stock_Level.fxml"));
            salespersondashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    public void assignedretailerButton(ActionEvent actionEvent) {
    }
}


