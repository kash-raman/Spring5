package edu.kash.learn.service.map;

import edu.kash.learn.model.Pet;
import edu.kash.learn.service.PetService;
import edu.kash.learn.service.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractCrudMapService<Pet, String> implements PetService {
    private PetTypeService petTypeService;

    public PetMapService(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public Pet save(Pet object) {
        if (object.getPetType() != null) {
            petTypeService.save(object.getPetType());
        }
        return super.save(object);
    }
}
