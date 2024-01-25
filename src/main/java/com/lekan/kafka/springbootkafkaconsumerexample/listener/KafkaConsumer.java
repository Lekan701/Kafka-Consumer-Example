package com.lekan.kafka.springbootkafkaconsumerexample.listener;

import com.lekan.kafka.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "NewTopic1", groupId = "group_id")
    public void consumer(String message){
        System.out.println(
                "Consumed message: " + message);
    }

    @KafkaListener(topics = "NewTopic1Json", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user){
        System.out.println("Consumed Json Message: " + user);
    }


}
