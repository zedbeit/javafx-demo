module com.beita.tutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.beita.tutorial to javafx.fxml;
    exports com.beita.tutorial;
}