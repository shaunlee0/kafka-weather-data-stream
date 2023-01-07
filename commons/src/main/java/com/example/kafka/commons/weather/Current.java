package com.example.kafka.commons.weather;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.Instant;

record Current (
  @Field(type = FieldType.Auto)
  Instant last_updated_epoch,
  @Field(type = FieldType.Auto)
  String last_updated,
  @Field(type = FieldType.Auto)
  double temp_c,
  @Field(type = FieldType.Auto)
  double temp_f,
  @Field(type = FieldType.Auto)
  int is_day,
  @Field(type = FieldType.Auto)
  Condition condition,
  @Field(type = FieldType.Auto)
  double wind_mph,
  @Field(type = FieldType.Auto)
  double wind_kph,
  @Field(type = FieldType.Auto)
  int wind_degree,
  @Field(type = FieldType.Auto)
  String wind_dir,
  @Field(type = FieldType.Auto)
  double pressure_mb,
  @Field(type = FieldType.Auto)
  double precip_mm,
  @Field(type = FieldType.Auto)
  double pressure_in,
  @Field(type = FieldType.Auto)
  double precip_in,
  @Field(type = FieldType.Auto)
  int humidity,
  @Field(type = FieldType.Auto)
  int cloud,
  @Field(type = FieldType.Auto)
  double feelslike_c,
  @Field(type = FieldType.Auto)
  double feelslike_f,
  @Field(type = FieldType.Auto)
  double vis_km,
  @Field(type = FieldType.Auto)
  double vis_miles,
  @Field(type = FieldType.Auto)
  double uv,
  @Field(type = FieldType.Auto)
  double gust_mph,
  @Field(type = FieldType.Auto)
  double gust_kph
) {}

