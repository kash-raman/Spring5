package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    LocalDate birthDate;
    PetType petType;
    Owner owner;
}
