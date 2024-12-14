package com.example.milkvitaproject.TaranayaUser7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StaffManagementController{

    @FXML
    private ComboBox<String> comboboxid;

    @FXML
    private DatePicker datepicker;

    @FXML
    private javafx.scene.control.TextField inputroleid;

    @FXML
    private javafx.scene.control.TextField inputshiftid;

    @FXML
    private TableColumn<StaffManagementController, String> nameid;

    @FXML
    private TableColumn<StaffManagementController, String> roleid;

    @FXML
    private TableColumn<StaffManagementController, String> shiftid;

    @FXML
    private TableView<StaffManagementController> staffTable;

    @FXML
    void addStaffOnActionButton(ActionEvent event) {
        String name = comboboxid.getValue();
        String role = inputroleid.getText();
        String shift = inputshiftid.getText();

        if (name == null || name.isEmpty() || role.isEmpty() || shift.isEmpty()) {
            showAlert("Input Error", "Please fill out all fields to add staff.");
            return;
        }

        staffTable.getItems().add(new Staff(name, role, shift));
        clearFields();
        showAlert("Success", "Staff added successfully.");
    }

    private void showAlert(String inputError, String s) {
    }

    @FXML
    void assignRoleOnActionButton(ActionEvent event) {
        Staff selectedStaff = staffTable.getSelectionModel().getSelectedItem();
        String newRole = inputroleid.getText();

        if (selectedStaff == null) {
            showAlert("Selection Error", "Please select a staff member to assign a role.");
            return;
        }

        if (newRole.isEmpty()) {
            showAlert("Input Error", "Please enter a valid role.");
            return;
        }

        selectedStaff.setRole(newRole);
        staffTable.refresh();
        showAlert("Success");
    }

    @FXML
    void handleComboBoxSelection(ActionEvent event) {
        String selectedName = comboboxid.getValue();
        if (selectedName != null) {
            showAlert("Selection", "You selected: " + selectedName);
        }
    }

    @FXML
    void returnHomeOnActionButton(ActionEvent event) {
        showAlert("Return Home");

        @FXML
        public void initialize () {
            comboboxid.getItems().addAll("YYY", "BBB", "AAA");
        }
    }