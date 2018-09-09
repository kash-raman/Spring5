package edu.kash.learn.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Data
public class Owner extends Person {
    String address;
    String telephone;
    String city;
    @EqualsAndHashCode.Exclude
    Set<Pet> petSet = new HashSet<Pet>();

    @Override
    public String toString() {
        return "Owner{" +
                "id='" + getId() + '\'' +
                "address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", city='" + city + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
