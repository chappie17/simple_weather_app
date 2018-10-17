package com.sda.weatherapp.view;

import com.sda.weatherapp.App;
import com.sda.weatherapp.controller.WeatherController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WeatherView {

    private Stage stage;
    private FlowPane pane;

    public WeatherView(Stage stage) {
        this.stage = stage;
    }

    public void loadView(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(App.class.getResource("/view.fxml"));
        try {
            pane = loader.load();
            Scene scene = new Scene(pane);
            stage.getScene();
            stage.setTitle("Weather Application");
            stage.getIcons().add(new Image(App.class.getResourceAsStream("/icon.png")));
            stage.show();

            WeatherController weatherController;
            weatherController = loader.getController();
            weatherController.setWeatherView(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
