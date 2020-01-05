package spring.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String args[]){
        SpringApplication.run(App.class, args);
        /*ApplicationContext applicationContext = SpringApplication.run(App.class, args);
        KafkaProducer kafkaProducer = (KafkaProducer) applicationContext.getBean(KafkaProducer.class);
        boolean flag = false ;
        do kafkaProducer.sendMessage("Testing the kafka messaging system"); while (flag);*/
    }
}
