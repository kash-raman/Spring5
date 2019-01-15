package com.learn.spring5.demo.controller;

import com.learn.spring5.demo.data.Counter;
import com.learn.spring5.demo.repo.CounterRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HitController {
    CounterRepository repository;

    public HitController(CounterRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/count")
    public String hitMe(){
        Counter  count =null;
        if(repository.existsById("1")) {
            Iterable<Counter> counter = repository.findAll();
              count = counter.iterator().next();
            if (count != null) {
                count.setCounter(count.getCounter().concat("1"));
                repository.save(count);
            } }else {
               count = new Counter("1");
                repository.save(count);
            }

        return "Counter is "+count;
    }

}
