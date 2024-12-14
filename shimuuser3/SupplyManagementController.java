package org.example.stimulating_system_of_milk_vita.shimuuser3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class SupplyManagementController {

    @FXML
    private ComboBox<String> Required_Stock;

    @FXML
    private TableColumn<supplymanagement,String> currentStock;

    @FXML
    private ComboBox<String> current_StocK;

    @FXML
    private ComboBox<String> materia_NamE;

    @FXML
    private TableColumn<supplymanagement,String> materialName;

    @FXML
    private TableView<supplymanagement> materialStock;

    @FXML
    private TableColumn<supplymanagement,String> requiredStock;

    @FXML
    void addOnClick(ActionEvent event) {
        String material_name=materia_NamE.getSelectionModel().getSelectedItem();
        int current_stock=current_StocK.getSelectionModel().getSelectedIndex();
        int required_stock=Required_Stock.getSelectionModel().getSelectedIndex();


    }

    @FXML
    void backHandle(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();



    }

    @FXML
    void saveOnClick(ActionEvent event) {



    }
    @FXML
    void initialize() {

    }

}
