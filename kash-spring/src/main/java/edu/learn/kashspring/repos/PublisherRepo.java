package edu.learn.kashspring.repos;

import edu.learn.kashspring.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher, Long> {
}
