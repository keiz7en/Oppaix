module com.oppai.opelax {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oppai.opelax to javafx.fxml;
    exports com.oppai.opelax;
}