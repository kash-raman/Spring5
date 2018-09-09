package edu.kash.learn.repo;

import edu.kash.learn.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
