package edu.kash.learn.repo;

import edu.kash.learn.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
