package org.producer.kafkapublisherservice.controller;

import org.producer.kafkapublisherservice.service.KafkaPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaPublisherController {

    @Autowired
    private KafkaPublisherService publisherService;

    @PostMapping("/publish")
    public String publishMessage(@RequestParam("message") String message) {
        publisherService.sendMessage(message);
        return "Message published successfully";
    }
}

