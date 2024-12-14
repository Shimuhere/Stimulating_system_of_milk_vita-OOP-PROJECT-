package com.example.project_milkvita.TayyibaUser6;

import com.example.project_milkvita.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class RetailerDashboardController {

    @FXML
    private BorderPane Retailerdashboard;

    @FXML
    void availableproductsButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Available_Products.fxml"));
            Retailerdashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void managediscountsButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Manage_Discounts.fxml"));
            Retailerdashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void placeorderButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Place_Order.fxml"));
            Retailerdashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void receivedeliveriesButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Receive_Deliveries.fxml"));
            Retailerdashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void salesTransactionButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sales_Transaction.fxml"));
            Retailerdashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void salesreportButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sales_Report.fxml"));
            Retailerdashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void stockalertButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Stock_Alert.fxml"));
            Retailerdashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

    @FXML
    void stockmanagementButton(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Stock_Management.fxml"));
            Retailerdashboard.setCenter(fxmlLoader.load());
        }
        catch (Exception e){
        }

    }

}
