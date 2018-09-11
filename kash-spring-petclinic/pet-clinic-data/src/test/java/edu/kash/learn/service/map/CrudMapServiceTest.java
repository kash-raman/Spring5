package edu.kash.learn.service.map;

import edu.kash.learn.model.base.BaseEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CrudMapServiceTest {

    CrudMapService crudMapService;
    BaseEntity baseEntity;

    @BeforeAll
    public void setUp() throws Exception {
        crudMapService = new CrudMapService();
        baseEntity = new BaseEntity();
        baseEntity.setId(1l);
    }

    @Test
    public void save() {
        crudMapService.save(baseEntity);
        assertTrue(1 == crudMapService.findAll().size());
        assertNotNull(crudMapService.findById("1"));
        crudMapService.delete(baseEntity);
        assertNull(crudMapService.findById("1"));
    }

    @Test
    public void saveMultiple() {
        crudMapService.save(baseEntity);
        BaseEntity baseEntityR = new BaseEntity();
        baseEntityR.setId(2l);
        crudMapService.save(baseEntityR);
        assertTrue(2 == crudMapService.findAll().size());
        assertNotNull(crudMapService.findById("1"));
        crudMapService.deleteById("1");
        assertNull(crudMapService.findById("1"));
        assertTrue(1 == crudMapService.findAll().size());
        crudMapService.deleteAll();
        assertTrue(0 == crudMapService.findAll().size());

    }


}

class CrudMapService extends AbstractCrudMapService<BaseEntity, String> {
}