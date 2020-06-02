package com.cky.kafka.springbootkafkaproducer.controller;


import com.cky.kafka.springbootkafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class UserController {

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;
    private static final String topic = "test_kafka";

    @GetMapping(value = "/publish/{name}")
    public String post(@PathVariable("name") final String name) {
        kafkaTemplate.send(topic, new User(name, name+"@test.com.hk", "male"));
        return "Publish " + name + " successfully.";
    }

}
