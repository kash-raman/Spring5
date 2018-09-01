package edu.kash.learn.service;

import edu.kash.learn.model.Owner;

import java.util.List;

public interface OwnerService {
    Owner findById(String id);

    List<Owner> findAll();

    Owner save(Owner owner);

}
