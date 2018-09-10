package edu.kash.learn.service.map;

import edu.kash.learn.model.Owner;
import edu.kash.learn.model.Pet;
import edu.kash.learn.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractCrudMapService<Owner, String> implements OwnerService {
    private PetMapService petMapService;

    public OwnerMapService(PetMapService petMapService) {
        this.petMapService = petMapService;
    }

    @Override
    public Owner save(Owner object) {
        if (!object.getPetSet().isEmpty()) {
            for (Pet pet : object.getPetSet()
                    ) {
                Pet savedPet = petMapService.save(pet);
                pet.setId(pet.getId());
            }

        }
        return super.save(object);
    }
}
