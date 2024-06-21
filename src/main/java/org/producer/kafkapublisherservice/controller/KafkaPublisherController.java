package org.producer.producerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.producer.producerservice.service.KafkaProducerService;

@RestController
@RequestMapping("/api/kafka")
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/publish")
    public String publishMessage(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Message published successfully";
    }
}

