# Kafka
Develop Kafka using docker with spring boot producer and consumer
 
### Start docker project
```docker-compose -f docker-compose.yml up```
### Enter kafka bash in docker and change the script path
```docker exec -it kafka /bin/sh```
```cd /opt/kafka/```
### Create Kafka Topic
```./bin/kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic test_kafka```
![image](https://github.com/ckyyyy/docker-kafka/blob/master/image/create_kafka_topic.png)
### List All Topics
```./bin/kafka-topics.sh --list --zookeeper zookeeper:2181```

### Spring Boot Kafka Producer
![image](https://github.com/ckyyyy/docker-kafka/blob/master/image/producer_publish_kafka_topic1.png)
![image](https://github.com/ckyyyy/docker-kafka/blob/master/image/producer_publish_kafka_topic2.png)
### Consume from the Kafka Topic via Console
```./bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test_kafka --from-beginning```
Return Object based on the function
![image](https://github.com/ckyyyy/docker-kafka/blob/master/image/producer_consume_kafka_topic.png)

### Publish to the Kafka Topic via Console
```./bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test_kafka```
![image](https://github.com/ckyyyy/docker-kafka/blob/master/image/consumer_produce_kafka_topic.png)
### Spring Boot Kafka Consumer
![image](https://github.com/ckyyyy/docker-kafka/blob/master/image/consumer_consume_kafka_topic.png)