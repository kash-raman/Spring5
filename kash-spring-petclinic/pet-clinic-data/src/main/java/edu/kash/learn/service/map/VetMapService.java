package edu.kash.learn.service.map;

import edu.kash.learn.model.Vet;
import edu.kash.learn.service.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractCrudMapService<Vet, String> implements VetService {

}
