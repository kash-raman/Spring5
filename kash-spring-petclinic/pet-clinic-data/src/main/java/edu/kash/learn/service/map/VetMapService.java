package edu.kash.learn.service.map;

import edu.kash.learn.model.Speciality;
import edu.kash.learn.model.Vet;
import edu.kash.learn.service.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractCrudMapService<Vet, String> implements VetService {

    private SpecialityMapService specialtyMapService;

    public VetMapService(SpecialityMapService specialtyMapService) {
        this.specialtyMapService = specialtyMapService;
    }

    @Override
    public Vet save(Vet object) {
        if (!object.getSpecialitySet().isEmpty()) {
            for (Speciality speciality : object.getSpecialitySet()
                    ) {
                Speciality tempSpeciality = specialtyMapService.save(speciality);
                speciality.setId(tempSpeciality.getId());
            }

        }
        return super.save(object);
    }
}
