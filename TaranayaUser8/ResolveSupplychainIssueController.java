package com.example.milkvitaproject.TaranayaUser8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ResolveSupplyChainIssuesController {

    @FXML
    private TableColumn<ResolveSupplyChainIssues, String> issueid;

    @FXML
    private TableColumn<ResolveSupplyChainIssues, String> issuetype;

    @FXML
    private TableColumn<ResolveSupplyChainIssues, String> status;

    @FXML
    private TableView<ResolveSupplyChainIssues> issueTableView;

    @FXML
    private TextField resolutionnoteid;


    @FXML
    void resolveissueonaction(ActionEvent event) {
        String resolutionNote = resolutionnoteid.getText();

        if (!resolutionNote.isEmpty()) {
            Issue selectedIssue = issueTableView.getSelectionModel().getSelectedItem();

            if (selectedIssue != null) {
                selectedIssue.setStatus("Resolved");
                selectedIssue.setResolution(resolutionNote);
                issueTableView.refresh();
                System.out.println("Issue ID: " + selectedIssue.getIssueId() + " resolved with note: " + resolutionNote);
            } else {
            System.out.println("Please enter a resolution note.");
        }
    }

    @FXML
    void returnhomeonaction(ActionEvent event) {
        System.out.println("Returning to Home Screen.");
    }

    @FXML
    public void initialize() {
        issueid.setCellValueFactory(new PropertyValueFactory<>("issueId"));
        issuetype.setCellValueFactory(new PropertyValueFactory<>("issueType"));
        status.setCellValueFactory(new PropertyValueFactory<>("status"));
    }
}