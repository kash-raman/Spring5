package edu.kash.learn.service;


import edu.kash.learn.model.Owner;
import edu.kash.learn.service.map.OwnerMapService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OwnerServiceTest {

    @Test
    public void testOWnerMap() {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Kas");
        owner.setLastName("raman");
        OwnerMapService ownerMapService = new OwnerMapService(null);
        ownerMapService.save(owner);
        assertTrue(!ownerMapService.findAll().isEmpty());
        ownerMapService.delete(owner);
        assertTrue(ownerMapService.findAll().isEmpty());
    }
}
