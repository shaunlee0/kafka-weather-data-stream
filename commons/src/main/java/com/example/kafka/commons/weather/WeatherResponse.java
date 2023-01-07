package com.example.kafka.commons.weather;

import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import java.util.UUID;

@Document(indexName = "weather-data")
@Setting(settingPath = "static/elastic-settings.json")
@Setter
public class WeatherResponse {
        @Id UUID id;
        @Field(type = FieldType.Auto) Location location;
        @Field(type = FieldType.Auto) Current current;
}
