package com.example.kafka;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProducerApplicationTests {

	private String response = """
			{
					"location": {
							"name": "Fort William",
							"region": "Inverness-Shire",
							"country": "UK",
							"lat": 56.82,
							"lon": -5.11,
							"tz_id": "Europe/London",
							"localtime_epoch": 1672240801,
							"localtime": "2022-12-28 15:20"
					},
					"current": {
							"last_updated_epoch": 1672240500,
							"last_updated": "2022-12-28 15:15",
							"temp_c": 1.7,
							"temp_f": 35.1,
							"is_day": 1,
							"condition": {
									"text": "Moderate or heavy sleet",
									"icon": "//cdn.weatherapi.com/weather/64x64/day/320.png",
									"code": 1207
							},
							"wind_mph": 5.4,
							"wind_kph": 8.6,
							"wind_degree": 54,
							"wind_dir": "NE",
							"pressure_mb": 983.0,
							"pressure_in": 29.04,
							"precip_mm": 5.1,
							"precip_in": 0.2,
							"humidity": 100,
							"cloud": 100,
							"feelslike_c": -0.9,
							"feelslike_f": 30.4,
							"vis_km": 6.0,
							"vis_miles": 3.0,
							"uv": 1.0,
							"gust_mph": 6.5,
							"gust_kph": 10.4
					}
			}
			""";

	@Test
	void contextLoads() {
	}

}
