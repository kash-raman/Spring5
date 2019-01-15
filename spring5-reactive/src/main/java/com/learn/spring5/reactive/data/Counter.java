package com.learn.spring5.demo.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Counter {
    @Id
    String id;
    String counter;

    public Counter(String counter) {
        this.counter = counter;
    }
}
