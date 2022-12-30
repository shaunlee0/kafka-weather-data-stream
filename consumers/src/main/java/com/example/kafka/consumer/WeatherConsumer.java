package com.example.kafka.consumer;

import com.example.kafka.commons.weather.WeatherResponse;
import com.example.kafka.config.KafkaTopicConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class WeatherConsumer {

  private final List<WeatherResponse> responses = new ArrayList<>();

  @KafkaListener(topics = KafkaTopicConfig.WEATHER_TOPIC_NAME, groupId = "${spring.kafka.consumer.group-id}")
  public void consume(WeatherResponse weatherResponse) {
      responses.add(weatherResponse);
      log.info("Message consumed {}", weatherResponse);
  }
}
