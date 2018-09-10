package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
@Data
@EqualsAndHashCode(exclude = "pet")
public class Visit extends BaseEntity {
    String description;
    private LocalDate appointmentsDate;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
