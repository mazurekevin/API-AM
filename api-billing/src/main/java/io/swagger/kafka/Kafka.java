package io.swagger.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class Kafka {
    private final String TOPIC_NAME = "contracts";

    @Autowired
    public KafkaTemplate<String, String> kafkaTemplate ;

    public void send(String topic, String message) {
        this.kafkaTemplate.send(topic, message);
    }

    @KafkaListener(topics = TOPIC_NAME, groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("Received Message in group - " + TOPIC_NAME + ": " + message);
    }

}
