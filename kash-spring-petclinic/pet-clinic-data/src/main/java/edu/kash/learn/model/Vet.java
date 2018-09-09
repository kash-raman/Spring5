package edu.kash.learn.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Data
public class Vet extends Person {
    @EqualsAndHashCode.Exclude
    private Set<Speciality> specialitySet = new HashSet<Speciality>();

    @Override
    public String toString() {
        return "Vet{" +
                "id='" + getId() + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
