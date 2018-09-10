package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
@Data
public class PetType extends BaseEntity {
    String name;
}
