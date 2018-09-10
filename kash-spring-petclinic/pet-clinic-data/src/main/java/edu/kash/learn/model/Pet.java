package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pets")
@EqualsAndHashCode(exclude = {"visitSet", "owner", "petType"})
@Data
public class Pet extends BaseEntity {
    LocalDate birthDate;
    @ManyToOne
    @JoinColumn(name = "type_id")
    PetType petType;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    Owner owner;
    String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    Set<Visit> visitSet = new HashSet<>();
}
