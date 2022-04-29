module com.mksoftware.simplecalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.mksoftware.simplecalc to javafx.fxml;
    exports com.mksoftware.simplecalc;
}