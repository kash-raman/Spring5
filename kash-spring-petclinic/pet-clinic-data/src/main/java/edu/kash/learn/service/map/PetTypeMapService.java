package edu.kash.learn.service.map;

import edu.kash.learn.model.PetType;
import edu.kash.learn.service.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeMapService extends AbstractCrudMapService<PetType, String> implements PetTypeService {

}
