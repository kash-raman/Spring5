package edu.kash.learn.service.jpa;

import edu.kash.learn.model.PetType;
import edu.kash.learn.repo.PetTypeRepository;
import edu.kash.learn.service.PetTypeService;
import edu.kash.learn.service.support.ServiceHelper;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("jpa")
public class PetTypeJpaService implements PetTypeService {

    PetTypeRepository petTypeRepository;

    public PetTypeJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType findById(String uniqueId) {
        return petTypeRepository.findById(ServiceHelper.getaLong(uniqueId)).orElse(null);
    }

    @Override
    public Set<PetType> findAll() {
        return null;
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void deleteById(String uniqueId) {
        petTypeRepository.deleteById(ServiceHelper.getaLong(uniqueId));
    }

    @Override
    public void deleteAll() {
        petTypeRepository.deleteAll();
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

}
