module com.example.appcambiarcolor {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.appcambiarcolor to javafx.fxml;
    exports com.example.appcambiarcolor;
}