package edu.learn.kashspring.repos;

import edu.learn.kashspring.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Long> {
}
