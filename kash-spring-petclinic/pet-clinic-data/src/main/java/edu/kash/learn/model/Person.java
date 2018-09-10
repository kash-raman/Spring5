package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity {
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
