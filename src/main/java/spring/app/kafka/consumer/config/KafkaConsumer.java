package spring.app.kafka.consumer.config;

import org.springframework.kafka.annotation.KafkaListener;

@KafkaListener(topics = "test", groupId = "groupone", containerFactory = "kafkaListenerContainerFactory")
public class KafkaConsumer {

    public void KafkaConsumer(String message){
        System.out.println(message);
    }
}
