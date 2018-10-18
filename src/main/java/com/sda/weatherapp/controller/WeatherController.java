package com.sda.weatherapp.controller;

import com.sda.weatherapp.model.Weather;
import com.sda.weatherapp.model.WeatherService;
import com.sda.weatherapp.view.WeatherView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WeatherController {

    private WeatherService weatherService;
    private WeatherView weatherView;

    @FXML
    private Label temperatureLabel;

    @FXML
    private Label temperatureFeelsLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private ImageView imageIcon;

    @FXML
    private TextField cityTextField;

    @FXML
    public void showWeather() {
        Weather weather = weatherService.showCityWeather(cityTextField.getText());
        imageIcon.setVisible(true);
        if (weather.getCityName() == null){
            descriptionLabel.setText("Not found!");
            temperatureLabel.setText("");
            temperatureFeelsLabel.setText("");
            imageIcon.setVisible(false);
        }else {
            temperatureLabel.setText(String.valueOf(weather.getTemperature()));
            temperatureFeelsLabel.setText(String.valueOf(weather.getFeelsLikeC()));
            descriptionLabel.setText(weather.getDescription());
            Image image = new Image("http:" + weather.getIconUrl(), true);
            imageIcon.setImage(image);
        }
    }

    public void setWeatherView(WeatherView weatherView) {
        this.weatherView = weatherView;
    }

    public WeatherService getWeatherService() {
        return weatherService;
    }

    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
}
