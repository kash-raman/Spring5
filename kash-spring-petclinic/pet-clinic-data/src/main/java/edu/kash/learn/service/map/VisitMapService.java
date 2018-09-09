package edu.kash.learn.service.map;

import edu.kash.learn.model.Visit;
import edu.kash.learn.service.VisitService;
import org.springframework.stereotype.Service;

@Service
public class VisitMapService extends AbstractCrudMapService<Visit, String> implements VisitService {
    private PetMapService petMapService;

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null && visit.getPet().getOwner() == null) {

            throw new RuntimeException("Visit cannot be scheduled without pet and owner");
        }
        return super.save(visit);
    }
}
