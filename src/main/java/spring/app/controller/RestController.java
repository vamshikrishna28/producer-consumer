package spring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.app.producer.KafkaProducer;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/kafka/send")
public class RestController {

    @Autowired
    protected KafkaProducer kafkaProducer;

    @GetMapping("/{message}")
    public void sendKafkaTopicMessage(@PathVariable String message){
        kafkaProducer.sendMessage(message);
    }
}
