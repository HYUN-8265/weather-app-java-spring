package com.example.weather.controller;

import com.example.weather.model.WeatherResponse;
import com.example.weather.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public String getWeatherForm() {
        return "weatherForm";
    }

    @PostMapping("/weather")
    public String getWeather(@ModelAttribute("city") String city, Model model) {
        WeatherResponse weather = weatherService.getWeather(city);
        model.addAttribute("weather", weather);
        return "weatherResult";
    }
}
