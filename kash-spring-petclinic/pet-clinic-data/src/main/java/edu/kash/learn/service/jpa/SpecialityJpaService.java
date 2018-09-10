package edu.kash.learn.service.jpa;

import edu.kash.learn.model.Speciality;
import edu.kash.learn.repo.SpecialityRepository;
import edu.kash.learn.service.SpecialityService;
import edu.kash.learn.service.support.ServiceHelper;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class SpecialityJpaService implements SpecialityService {

    private SpecialityRepository specialityRepository;

    public SpecialityJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Speciality findById(String uniqueId) {
        return specialityRepository.findById(ServiceHelper.getaLong(uniqueId)).orElse(null);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void deleteById(String uniqueId) {
        specialityRepository.deleteById(ServiceHelper.getaLong(uniqueId));
    }

    @Override
    public void deleteAll() {
        specialityRepository.deleteAll();
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }


}
