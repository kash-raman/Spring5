package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class Person extends BaseEntity {
    String firstName;
    String lastName;
}
