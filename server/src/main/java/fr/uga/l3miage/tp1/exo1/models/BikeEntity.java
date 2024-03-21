package fr.uga.l3miage.tp1.exo1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class BikeEntity {
    @Id
    private String immatriculation;
    @Column(name = "Cylinder_number")
    private int cylinderNumber;
    private boolean automatic;
    private boolean shifter;
    @Column(name = "Shifter_type")
    private int shifterType;

    @Column(name = "circulationDate")
    private LocalDate circulationDate;

}
