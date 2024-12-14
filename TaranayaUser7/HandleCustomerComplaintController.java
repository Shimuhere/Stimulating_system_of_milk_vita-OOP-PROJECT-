package com.example.milkvitaproject.TaranayaUser7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class HandleCustomerComplaint {

    @FXML
    private TableColumn<CustomerComplaint, String> complaintid;

    @FXML
    private TableColumn<CustomerComplaint, String> complaintstatusid;

    @FXML
    private TableColumn<CustomerComplaint, String> complainttypeid;

    @FXML
    private TextArea resolutionNoteId;

    @FXML
    private TableView<CustomerComplaint> complaintsTable;

    @FXML
    void resolveOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Resolve Complaint");
        alert.setHeaderText(null);
        alert.setContentText("Complaint has been resolved successfully.");
        alert.showAndWait();
    }

    @FXML
    void returnHomeButtonOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Return Home");
        alert.setHeaderText(null);
        alert.setContentText("Returning to the home screen.");
        alert.showAndWait();
    }

    @FXML
    void saveButtonOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Save Resolution Note");
        alert.setHeaderText(null);
        alert.setContentText("Resolution note has been saved successfully.");
        alert.showAndWait();
    }

    @FXML
    public void initialize() {

        complaintid.setCellValueFactory(new PropertyValueFactory<>("complaintId"));
        complaintstatusid.setCellValueFactory(new PropertyValueFactory<>("complaintStatus"));
        complainttypeid.setCellValueFactory(new PropertyValueFactory<>("complaintType"));


        complaintsTable.getItems().addAll(
                new CustomerComplaint("C01", "Pending", "Late Delivery"),
                new CustomerComplaint("C02", "Resolved", "Poor Quality"),
                new CustomerComplaint("03", "In Progress", "Billing issue")
        );
    }


    public static class CustomerComplaint {
        private String complaintId;
        private String complaintStatus;
        private String complaintType;

        public CustomerComplaint(String complaintId, String complaintStatus, String complaintType) {
            this.complaintId = complaintId;
            this.complaintStatus = complaintStatus;
            this.complaintType = complaintType;
        }

        public String getComplaintId() {
            return complaintId;
        }

        public void setComplaintId(String complaintId) {
            this.complaintId = complaintId;
        }

        public String getComplaintStatus() {
            return complaintStatus;
        }

        public void setComplaintStatus(String complaintStatus) {
            this.complaintStatus = complaintStatus;
        }

        public String getComplaintType() {
            return complaintType;
        }

        public void setComplaintType(String complaintType) {
            this.complaintType = complaintType;
        }
    }
}
