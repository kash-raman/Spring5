package edu.kash.learn.service;

import edu.kash.learn.model.Vet;

import java.util.List;

public interface VetService {

    Vet findById(String id);

    List<Vet> findAll();

    Vet save(Vet vet);
}
