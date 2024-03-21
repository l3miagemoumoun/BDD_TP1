package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="federation_entity")
public class FederationEntity {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "isfage_membership")
    private boolean isFageMembership;

    @OneToMany(mappedBy = "association_entity")
    List<AssociationEntity> associations;

}
