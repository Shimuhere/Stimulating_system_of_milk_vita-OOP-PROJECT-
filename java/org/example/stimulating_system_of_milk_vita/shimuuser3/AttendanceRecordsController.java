package org.example.stimulating_system_of_milk_vita.shimuuser3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.time.LocalDate;

import static java.util.random.RandomGeneratorFactory.all;

public class AttendanceRecordsController {

    @FXML
    private ComboBox<String> attendanceDatePicker;

    @FXML
    private TableView<attendancerecords> attendanceTable;

    @FXML
    private TableColumn<attendancerecords, String> dateColumn;

    @FXML
    private TableColumn<attendancerecords, String> remarksColumn;

    @FXML
    private TableColumn<attendancerecords, String> statusColumn;

    @FXML
    void addOnClick(ActionEvent event) {
        String status=attendanceDatePicker.getValue();
        LocalDate date=LocalDate.parse(attendanceDatePicker.getValue());


    }

    @FXML
    void handleBackButtonAction(ActionEvent event) {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        currentStage.close();
        System.out.println("Back button clicked. Returning to the previous screen.");
    }



}





