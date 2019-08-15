package com.ponymaggie.github.kafka.serializer;

import com.alibaba.fastjson.JSON;
import com.ponymaggie.github.kafka.beans.Person;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

@Slf4j
public class PersonDeserializer implements Deserializer <Person> {

    @Override
    public void configure(Map<String, ?> map, boolean b) {

    }

    @Override
    public Person deserialize(String s, byte[] bytes) {
        log.info("自定义的反序列化-deserialize");
        return JSON.parseObject(bytes, Person.class);
    }

    @Override
    public void close() {

    }
}
