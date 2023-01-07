package com.example.kafka.commons.weather;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

record Location (
  @Field(type = FieldType.Auto)
  String name,
  @Field(type = FieldType.Auto)
  String region,
  @Field(type = FieldType.Auto)
  String country,
  @Field(type = FieldType.Auto)
  double lat,
  @Field(type = FieldType.Auto)
  double lon,
  @Field(type = FieldType.Auto)
  String tz_id,
  @Field(type = FieldType.Auto)
  int localtime_epoch,
  @Field(type = FieldType.Auto)
  String localtime
) {}
