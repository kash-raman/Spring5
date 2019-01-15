package com.learn.spring5.demo.repo;

import com.learn.spring5.demo.data.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {
}
