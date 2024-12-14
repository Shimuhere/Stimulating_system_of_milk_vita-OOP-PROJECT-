module org.example.stimulating_system_of_milk_vita {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.stimulating_system_of_milk_vita to javafx.fxml;
    exports org.example.stimulating_system_of_milk_vita;
}