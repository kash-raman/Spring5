package edu.kash.learn.model;

import edu.kash.learn.model.base.BaseEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Visit extends BaseEntity {
    String description;
    private LocalDate appoitmentDate;
    private Pet pet;
}
