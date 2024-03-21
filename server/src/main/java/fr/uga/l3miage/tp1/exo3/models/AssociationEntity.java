package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="association_entity")
public class AssociationEntity {
    @Id
    @Column(name="name")
    private String name;

    @NotNull
    @Column(name = "president_name", nullable = false)
    private String presidentName;

    @NotNull
    @Column(name = "treasurer_name", nullable = false)
    private String treasurerName;

    @Enumerated(EnumType.STRING)
    @Column (name = "association_type")
    private AssociationType associationType;

    @ManyToOne
    @JoinColumn(name = "federation_entity")
    private FederationEntity federationEntity;



}
