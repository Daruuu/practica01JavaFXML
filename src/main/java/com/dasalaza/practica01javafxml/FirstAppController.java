package com.dasalaza.practica01javafxml;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstAppController extends Application {

    @FXML
    public Button buttonColor;
    @FXML
    public Circle circleColor;
    @FXML
    public TextField inputColorStr;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FirstAppController.class.getResource("firstTemplate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("First App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void gestionErrores(Color colorStr){
        if (colorStr == null || inputColorStr.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Introduce a color valid name!");
            alert.showAndWait();
        }
    }

    public void changeCircleColor() {
        String colorStr = inputColorStr.getText().toLowerCase();
        Color color = Color.web(colorStr);
        gestionErrores(color);

        if (color != null)
            circleColor.setFill(color);
    }
}