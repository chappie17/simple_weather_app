package com.sda.weatherapp.model;

import com.sda.weatherapp.controller.WeatherController;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

public class WeatherService {

    private String url = "http://api.apixu.com/v1/current.json";
    private String key = "336d39b18670470196780108180709";
    private String finalUrl;

    public WeatherService(String url, String key) {
        finalUrl = url + "?key=" + key;
    }

    public WeatherService() {
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

    public String getFinalUrl() {
        return finalUrl;
    }

    public void setFinalUrl(String finalUrl) {
        this.finalUrl = finalUrl;
    }

    public Weather showCityWeather(String city) {
        Weather weather = new Weather();
        String url = finalUrl + "&q=" + city;
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(IOUtils.toString(new URL(url), Charset.forName("UTF-8")));
        } catch (IOException e) {
            return weather;
        }
        if (weather != null) {
            weather.setCityName(jsonObject.getJSONObject("location").get("name").toString());
            weather.setDescription(jsonObject.getJSONObject("current").getJSONObject("condition").get("text").toString());
            weather.setTemperature((Double)jsonObject.getJSONObject("current").get("temp_c"));
            weather.setFeelsLikeC((Double)jsonObject.getJSONObject("current").get("feelslike_c"));
            weather.setIconUrl(jsonObject.getJSONObject("current").getJSONObject("condition").get("icon").toString());
        }

        return weather;
    }
}
