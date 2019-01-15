package edu.learn.kashspring.repos;

import edu.learn.kashspring.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
