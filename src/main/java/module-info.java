module com.example.autorepairshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.autorepairshop to javafx.fxml;
    exports com.example.autorepairshop;
}