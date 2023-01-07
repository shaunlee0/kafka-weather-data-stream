package com.example.kafka.commons.weather;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

public record Condition (
    @Field(type = FieldType.Auto)
    String text,
    @Field(type = FieldType.Auto)
    String icon,
    @Field(type = FieldType.Auto)
    int code
) {}
