package com.example.kafka.commons.weather;

public record Condition(
    String text,
    String icon,
    int code
) {}
