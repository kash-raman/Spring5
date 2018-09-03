package edu.kash.learn.service.map;

import edu.kash.learn.model.Pet;
import edu.kash.learn.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractCrudMapService<Pet, String> implements PetService {

}
