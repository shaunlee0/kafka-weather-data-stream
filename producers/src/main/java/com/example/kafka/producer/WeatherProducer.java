package com.example.kafka.producer;

import com.example.kafka.commons.weather.WeatherResponse;
import com.example.kafka.weather.WeatherAPIClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static com.example.kafka.config.KafkaTopicConfig.WEATHER_TOPIC_NAME;

@Service
@Slf4j
public class WeatherProducer {

  private final KafkaTemplate<String, WeatherResponse> kafkaTemplate;
  private final WeatherAPIClient client;
  private final ElasticsearchOperations elasticsearchOperations;
  public WeatherProducer(
          KafkaTemplate<String, WeatherResponse> kafkaTemplate,
          WeatherAPIClient client,
          ElasticsearchOperations elasticsearchOperations) {
    this.kafkaTemplate = kafkaTemplate;
    this.client = client;
    this.elasticsearchOperations = elasticsearchOperations;
  }

  @Scheduled(cron = "${weather.refresh.cron}")
  public void sendCurrentWeatherMessage(){
    WeatherResponse response = client.getCurrent();
    Message<WeatherResponse> message = MessageBuilder
            .withPayload(response)
            .setHeader(KafkaHeaders.TOPIC, WEATHER_TOPIC_NAME)
            .build();
    kafkaTemplate.send(message);
    elasticsearchOperations.save(response);
    log.info("Message sent {}", message);
  }
}
