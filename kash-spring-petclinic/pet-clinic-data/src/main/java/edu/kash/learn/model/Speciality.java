package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialities")
@Data
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String name;

}
