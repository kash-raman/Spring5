package edu.kash.learn.service;

import java.util.Set;

public interface CrudService<T, Id> {

    T findById(Id uniqueId);

    Set<T> findAll();

    T save(T object);

    void deleteById(Id uniqueId);

    void deleteAll();

    public void delete(T object);
}
