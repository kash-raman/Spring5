package edu.kash.learn.service.jpa;

import edu.kash.learn.model.Visit;
import edu.kash.learn.repo.VisitRepository;
import edu.kash.learn.service.VisitService;
import edu.kash.learn.service.support.ServiceHelper;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class VisitJpaService implements VisitService {

    VisitRepository visitRepository;

    public VisitJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findById(String uniqueId) {
        return visitRepository.findById(ServiceHelper.getaLong(uniqueId)).orElse(null);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void deleteById(String uniqueId) {
        visitRepository.deleteById(ServiceHelper.getaLong(uniqueId));
    }

    @Override
    public void deleteAll() {
        visitRepository.deleteAll();
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }
}
