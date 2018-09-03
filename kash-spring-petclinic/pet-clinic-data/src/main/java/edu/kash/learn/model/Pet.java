package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet extends BaseEntity {
    LocalDate birthDate;
    PetType petType;
    Owner owner;
}
