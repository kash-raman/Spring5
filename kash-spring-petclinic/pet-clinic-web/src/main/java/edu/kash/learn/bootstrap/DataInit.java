package edu.kash.learn.bootstrap;

import edu.kash.learn.model.Owner;
import edu.kash.learn.model.Pet;
import edu.kash.learn.model.Vet;
import edu.kash.learn.service.OwnerService;
import edu.kash.learn.service.PetService;
import edu.kash.learn.service.VetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataInit implements CommandLineRunner {
    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    public DataInit(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Inside CommandLineRunner - Impl -starting data insert");
        Pet pet = new Pet();
        pet.setId(1L);
        pet.setPetType(null);
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Kas");
        owner.setLastName("raman");
        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("Kas");
        vet.setLastName("raman");
        ownerService.save(String.valueOf(owner.getId()), owner);

        petService.save(String.valueOf(pet.getId()), pet);
        vetService.save(String.valueOf(vet.getId()), vet);
        log.info("Done with CommandLineRunner - Impl - data inserted");

    }
}
