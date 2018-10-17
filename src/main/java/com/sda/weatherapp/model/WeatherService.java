package com.sda.weatherapp.model;

public class WeatherService {

    private String url = "http://api.apixu.com/v1/current.json";
    private String key = "336d39b18670470196780108180709";
    private String finalUrl;

    public WeatherService(String url, String key) {
        finalUrl = url + "?key=" + key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
