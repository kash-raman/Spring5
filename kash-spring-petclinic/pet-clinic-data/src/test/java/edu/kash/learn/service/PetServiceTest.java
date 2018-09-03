package edu.kash.learn.service;


import edu.kash.learn.model.Pet;
import edu.kash.learn.service.map.PetMapService;
import org.junit.Assert;
import org.junit.Test;

public class PetServiceTest {

    @Test
    public void testPet() {
        Pet pet = new Pet();
        pet.setId(1L);
        pet.setPetType(null);
        PetMapService ownerMapService = new PetMapService();
        ownerMapService.save(String.valueOf(pet.getId()), pet);
        Assert.assertTrue(!ownerMapService.findAll().isEmpty());
        ownerMapService.delete(pet);
        Assert.assertTrue(ownerMapService.findAll().isEmpty());
    }
}
