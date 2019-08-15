package com.ponymaggie.github.kafka.serializer;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ponymaggie.github.kafka.beans.Person;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

@Slf4j
public class PersonSerializer implements Serializer<Person> {

    private static Gson gson;

    static {
        gson = new GsonBuilder().create();
    }

    @Override
    public void configure(Map<String, ?> map, boolean b) {

        log.info("自定义的序列化组件--configure");

    }

    @Override
    public byte[] serialize(String s, Person person) {
        log.info("自定义的序列化组件--serialize");

        return JSON.toJSONBytes(person);
    }

    @Override
    public void close() {
        log.info("自定义的序列化组件--close");

    }
}
