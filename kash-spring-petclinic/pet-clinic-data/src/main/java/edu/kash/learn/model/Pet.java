package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {
    LocalDate birthDate;
    @ManyToOne
    @JoinColumn(name = "type_id")
    PetType petType;
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "owner_id")
    Owner owner;
    String name;
    @EqualsAndHashCode.Exclude
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
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
