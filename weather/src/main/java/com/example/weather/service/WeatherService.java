package com.example.weather.service;

import com.example.weather.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final String apiKey = "9efe340b80c799c2fb0b0a1567f63125";

    public WeatherResponse getWeather(String city) {
        String url = String.format("http://api.weatherstack.com/current?access_key=%s&query=%s", apiKey, city);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
