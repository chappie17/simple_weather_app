package com.sda.weatherapp.model;

public class Weather {

    private String cityName;
    private String iconUrl;
    private String description;
    private double temperature;
    private double feelsLikeC;

    public Weather(String cityName, String iconUrl, String description, double temperature, double feelsLikeC) {
        this.cityName = cityName;
        this.iconUrl = iconUrl;
        this.description = description;
        this.temperature = temperature;
        this.feelsLikeC = feelsLikeC;
    }

    public Weather() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(double feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }
}
