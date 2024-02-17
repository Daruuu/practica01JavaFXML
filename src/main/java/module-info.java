module com.dasalaza.practica01javafxml {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.dasalaza.practica01javafxml to javafx.fxml;
    exports com.dasalaza.practica01javafxml;
}