package org.producer.kafkapublisherservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublisherService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "<topic-name>";

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}
