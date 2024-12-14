package com.example.project_milkvita.TayyibaUser5;

import com.example.project_milkvita.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class AssignedRetailerController
{
    @javafx.fxml.FXML
    private TableColumn <assignedretailer,String>shopnameColumn;
    @javafx.fxml.FXML
    private TableColumn<assignedretailer,String> shopAddressColumn;
    @javafx.fxml.FXML
    private TableColumn<assignedretailer,String> retailernameColumn;
    @javafx.fxml.FXML
    private TextField retailerNameTextfield;
    @javafx.fxml.FXML
    private TableView<assignedretailer> assignedretailerTableview;
    @javafx.fxml.FXML
    private TableColumn<assignedretailer,String> phoneNumberColumn;

    assignedretailer retailer1 = new assignedretailer("Kalam", "18263233789", "Shop1", "Dhanmondi");
    assignedretailer retailer2 = new assignedretailer("Sarif", "16829334424", "Shop2", "Savar");
    @javafx.fxml.FXML
    public void initialize() {
        retailernameColumn.setCellValueFactory(new PropertyValueFactory<assignedretailer,String>("retailername"));
        phoneNumberColumn.setCellValueFactory(new PropertyValueFactory<assignedretailer,String>("phonenumber"));
        shopnameColumn.setCellValueFactory(new PropertyValueFactory<assignedretailer,String>("shopname"));
        shopAddressColumn.setCellValueFactory(new PropertyValueFactory<assignedretailer,String>("shopaddress"));

    }



    @javafx.fxml.FXML
    public void viewInformationButton(ActionEvent actionEvent) {
        String retailername= retailerNameTextfield.getText();
        if (retailername.equals("Kalam")) {
            assignedretailerTableview.getItems().setAll(retailer1);
        } else if (retailername.equals("Sarif")) {
            assignedretailerTableview.getItems().setAll(retailer2);
        }
    }
}