package com.example.kafka.weather;

import com.example.kafka.commons.weather.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@Component
public class WeatherAPIClient {
  private static final String API_KEY = "098d6ea8f5bd4aeb811150946222812";
  private static final String BASE_URL = "http://api.weatherapi.com/v1";
  private static final String CURRENT_WEATHER_URL_SUFFIX = "/current.json";

  @Autowired
  private RestTemplate restTemplate;

  public WeatherResponse getCurrent(){
    final WeatherResponse weatherResponse = restTemplate.getForEntity(BASE_URL + CURRENT_WEATHER_URL_SUFFIX + "?key={key}&q={q}", WeatherResponse.class, Map.of("key", API_KEY, "q", "PH337JQ")).getBody();
    Objects.requireNonNull(weatherResponse)
            .setId(UUID.randomUUID());
    return weatherResponse;
  }

  public String getCurrentAsString(){
    return restTemplate.getForEntity(BASE_URL + CURRENT_WEATHER_URL_SUFFIX + "?key={key}&q={q}", String.class, Map.of("key", API_KEY, "q", "PH337JQ")).getBody();
  }

}
