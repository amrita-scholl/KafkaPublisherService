package org.producer.producerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "template-topic-1";

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}
