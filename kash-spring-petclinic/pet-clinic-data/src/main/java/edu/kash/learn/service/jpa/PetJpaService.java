package edu.kash.learn.service.jpa;

import edu.kash.learn.model.Pet;
import edu.kash.learn.repo.PetRepository;
import edu.kash.learn.service.PetService;
import edu.kash.learn.service.support.ServiceHelper;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class PetJpaService implements PetService {
    PetRepository petRepository;

    public PetJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(String uniqueId) {
        return petRepository.findById(ServiceHelper.getaLong(uniqueId)).orElse(null);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void deleteById(String uniqueId) {
        petRepository.deleteById(ServiceHelper.getaLong(uniqueId));
    }

    @Override
    public void deleteAll() {
        petRepository.deleteAll();
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }


}
