package edu.kash.learn.service.map;

import edu.kash.learn.model.PetType;
import edu.kash.learn.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractCrudMapService<PetType, String> implements PetTypeService {

}
