package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;

@Data
public class Person extends BaseEntity {
    String firstName;
    String lastName;
}
