package io.swagger.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

public class Kafka {
    private static final String TOPIC_NAME = "test";

    @Autowired
    public static KafkaTemplate<String, String> kafkaTemplate;

    public static void send(String topic, String message){
        kafkaTemplate.send(topic, message);
    }

    /*@KafkaListener(topics = TOPIC_NAME, groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("Received Messasge in group - " + TOPIC_NAME + ": " + message);
    }*/
}
