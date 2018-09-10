package edu.kash.learn.service.jpa;

import edu.kash.learn.model.Owner;
import edu.kash.learn.repo.OwnerRepository;
import edu.kash.learn.service.OwnerService;
import edu.kash.learn.service.support.ServiceHelper;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class OwnerJpaService implements OwnerService {
    private OwnerRepository ownerRepository;

    public OwnerJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findById(String uniqueId) {
        return ownerRepository.findById(ServiceHelper.getaLong(uniqueId)).orElse(null);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owner = new HashSet<>();
        ownerRepository.findAll().forEach(owner::add);
        return owner;
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void deleteById(String uniqueId) {
        ownerRepository.deleteById(ServiceHelper.getaLong(uniqueId));
    }


    @Override
    public void deleteAll() {
        ownerRepository.deleteAll();
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }
}
