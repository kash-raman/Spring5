package edu.kash.learn.service;

import edu.kash.learn.model.Pet;

import java.util.List;

public interface PetService {
    Pet findById(String id);

    List<Pet> findAll();

    Pet save(Pet pet);
}
