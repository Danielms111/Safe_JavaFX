module com.example.seguimiento13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seguimiento13 to javafx.fxml;
    exports com.example.seguimiento13;
    exports com.example.seguimiento13.Controllers;
    opens com.example.seguimiento13.Controllers to javafx.fxml;
}