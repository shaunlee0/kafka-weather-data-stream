package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

  public static final String WEATHER_TOPIC_NAME = "weather-data";

  @Bean
  public NewTopic weatherReading(){
    return TopicBuilder.name(WEATHER_TOPIC_NAME).build();
  }
}
