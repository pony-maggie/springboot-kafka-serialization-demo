package com.ponymaggie.github.kafka.beans;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Person {
    private int id;
    private String name;
    private int age;

}
