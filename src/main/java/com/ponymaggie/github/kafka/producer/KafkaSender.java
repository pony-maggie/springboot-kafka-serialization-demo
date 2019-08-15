package com.ponymaggie.github.kafka.producer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ponymaggie.github.kafka.beans.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
@Slf4j
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();


    //发送消息方法
    public void send() {
        Person person = new Person();
        person.setId(1000);
        person.setName("小明");
        person.setAge(30);

        log.info("+++++++++++++++++++++  message = {}", gson.toJson(person));
        kafkaTemplate.send("malu", person);
    }
}