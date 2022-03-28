module com.example.project2_airpticket {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.web;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires validatorfx;
  requires org.kordamp.ikonli.javafx;
  requires org.kordamp.bootstrapfx.core;
  requires eu.hansolo.tilesfx;
  requires javafx.graphics;

  opens com.example.project2_airpticket to javafx.fxml;
  exports com.example.project2_airpticket;
}