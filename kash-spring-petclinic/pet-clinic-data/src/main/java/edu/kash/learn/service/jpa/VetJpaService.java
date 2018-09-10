package edu.kash.learn.service.jpa;

import edu.kash.learn.model.Vet;
import edu.kash.learn.repo.VetRepository;
import edu.kash.learn.service.VetService;
import edu.kash.learn.service.support.ServiceHelper;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class VetJpaService implements VetService {

    VetRepository vetRepository;

    public VetJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findById(String uniqueId) {
        return vetRepository.findById(ServiceHelper.getaLong(uniqueId)).orElse(null);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void deleteById(String uniqueId) {
        vetRepository.deleteById(ServiceHelper.getaLong(uniqueId));
    }

    @Override
    public void deleteAll() {
        vetRepository.deleteAll();
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }
}
