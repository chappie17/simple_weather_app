package com.sda.weatherapp.model;

public class Weather {

    private String cityName;
    private String iconUrl;
    private double temperature;
    private double feelsLikeC;

    public Weather(String cityName, String iconUrl, double temperature, double feelsLikeC) {
        this.cityName = cityName;
        this.iconUrl = iconUrl;
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
