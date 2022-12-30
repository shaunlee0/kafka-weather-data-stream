package com.example.kafka.commons.weather;

record Location (
  String name,
  String region,
  String country,
  double lat,
  double lon,
  String tz_id,
  int localtime_epoch,
  String localtime
) {}
