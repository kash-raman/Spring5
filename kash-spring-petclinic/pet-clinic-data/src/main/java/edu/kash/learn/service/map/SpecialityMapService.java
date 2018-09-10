package edu.kash.learn.service.map;

import edu.kash.learn.model.Speciality;
import edu.kash.learn.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractCrudMapService<Speciality, String> implements SpecialityService {

}
