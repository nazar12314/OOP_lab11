package org.example.task2.strategy;

import lombok.Builder;
import lombok.Generated;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class Client {
    @Generated
    private final String id = UUID.randomUUID().toString();
    private String name;
    private Gender sex;
    private int age;
}
