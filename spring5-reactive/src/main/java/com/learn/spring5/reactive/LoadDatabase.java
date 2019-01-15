package com.learn.spring5.demo;

import com.learn.spring5.demo.data.Chapter;
import com.learn.spring5.demo.repo.ChapterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import reactor.core.publisher.Flux;


@Configuration
public class LoadDatabase {

    @Order(2)
    @Bean
    CommandLineRunner init(ChapterRepository chapterRepository) {
        System.out.println("inside Command Line Runner");
        return args -> {
            Flux.just(
                    new Chapter("Quick Start with Java"),
                    new Chapter("Learning lamda Java"),
                    new Chapter("Learning spring boot")
            ).flatMap(chapterRepository::save).subscribe(System.out::println);

        };
    }
}
