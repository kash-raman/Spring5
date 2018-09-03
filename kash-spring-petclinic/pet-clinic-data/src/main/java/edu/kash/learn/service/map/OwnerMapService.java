package edu.kash.learn.service.map;

import edu.kash.learn.model.Owner;
import edu.kash.learn.service.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractCrudMapService<Owner, String> implements OwnerService {

}
