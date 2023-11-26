module com.example.calculardia {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.calculardia to javafx.fxml;
    exports com.example.calculardia;
}