# Kafka Example Project

## CLI Example commands 

### Start Kafka
```bash
cd ~/dev/java/kafka_2.13-3.3.1
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties
```

### Test addition of topic with console producer and consumer

```bash
./kafka-topics.sh --create --topic weather-data --bootstrap-server localhost:9092
./kafka-console-producer.sh --topic weather-data --bootstrap-server localhost:9092
./kafka-console-consumer.sh --topic weather-data --bootstrap-server localhost:9092 --from-beginning
```

### Start Elasticsearch

Run the docker image. 

```bash
/usr/local/bin/docker-compose -f /Users/shaun/dev/java/docker-services/elastic.yml up -d
```


## Weather API 

This application reads data from the [Weather API](https://www.weatherapi.com/api-explorer.aspx#current)

### Producer

TODO

### Consumer

TODO