module com.example.factura {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires lombok;

    opens com.example.factura to javafx.fxml;
    exports com.example.factura;
}