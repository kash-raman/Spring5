package edu.kash.learn.service;


import edu.kash.learn.model.Vet;
import edu.kash.learn.service.map.VetMapService;
import org.junit.Assert;
import org.junit.Test;

public class VetServiceTest {

    @Test
    public void testOWner() {
        Vet owner = new Vet();
        owner.setId(1L);
        owner.setFirstName("Kas");
        owner.setLastName("raman");
        VetService ownerMapService = new VetMapService(null);
        ownerMapService.save(owner);
        Assert.assertTrue(!ownerMapService.findAll().isEmpty());
        ownerMapService.delete(owner);
        Assert.assertTrue(ownerMapService.findAll().isEmpty());
    }
}
