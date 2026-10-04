module com.example.domacauloha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.domacauloha to javafx.fxml;
    exports com.example.domacauloha;
}