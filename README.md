# Kafka
Develop Kafka using docker
 
### Start docker project
```docker-compose -f docker-compose.yml up```
### Enter kafka bash in docker and change the script path
```docker exec -it kafka /bin/sh```
```cd /opt/kafka/```
### Create Kafka Topic and List All Topics
```./bin/kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic test_kafka```
```./bin/kafka-topics.sh --list --zookeeper zookeeper:2181```