package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class Pet extends BaseEntity {
    LocalDate birthDate;
    PetType petType;
    @EqualsAndHashCode.Exclude
    Owner owner;
    String name;
    @EqualsAndHashCode.Exclude
    Set<Visit> visitSet = new HashSet<>();

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + getId() + '\'' +
                "birthDate=" + birthDate +
                ", petType=" + petType +
                ", owner=" + owner +
                ", name='" + name + '\'' +
                ", visitSet=" + visitSet +
                '}';
    }
}
