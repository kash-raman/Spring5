package com.learn.spring5.demo.repo;

import com.learn.spring5.demo.data.Counter;
import org.springframework.data.repository.CrudRepository;

public interface CounterRepository extends CrudRepository<Counter,String> {
}
