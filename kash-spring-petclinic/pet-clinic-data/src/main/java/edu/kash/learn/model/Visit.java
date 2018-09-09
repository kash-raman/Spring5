package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {
    String description;
    private LocalDate appointmentsDate;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
