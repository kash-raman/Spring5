package com.learn.spring5.demo.controller;

import com.learn.spring5.demo.data.Chapter;
import com.learn.spring5.demo.repo.ChapterRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {

    private ChapterRepository repository;

    public ChapterController(ChapterRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> list() {
        return repository.findAll();
    }
}
