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

    public void errorHandlingInput(){
        if (inputColorStr.getText().isEmpty() || inputColorStr.getText().isEmpty())
            showAlert("Please enter a valid color name" );
        else if (!isHexadecimal(inputColorStr.toString()))
            showAlert("Invalid hexadecimal color!");
    }

    public void changeCircleColor() {
        Color color = null;

        if (!inputColorStr.getText().isEmpty())
            color = Color.web(inputColorStr.getText());

        errorHandlingInput();

        if (inputColorStr.getText() != null)
            circleColor.setFill(color);
    }

    private void showAlert(String message)
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private boolean isHexadecimal(String inputStr)
    {
        return inputStr.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
    }
}