package edu.kash.learn.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "owners")
public class Owner extends Person {

    String address;
    String telephone;
    String city;
    @EqualsAndHashCode.Exclude
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
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
