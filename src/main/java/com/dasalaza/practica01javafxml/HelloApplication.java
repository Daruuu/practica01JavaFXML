package com.dasalaza.practica01javafxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private final double HEIGTH = 700;
    private final double WIDTH = 400;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene scene = new Scene(fxmlLoader.load(), WIDTH, HEIGTH);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


    // create color from RGB value
    public void createColorFromRGB()
    {
        int x = 100;
        int y = 100;
        int red = 30;
        int green = 40;
        int blue = 50;
        Text text = new Text(x, y, "text");

        text.setFill(Color.rgb(red, green, blue, .99));
    }
}