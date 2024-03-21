package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "brand_miage")
public class BrandMiage {
    @Id
    @Column(name = "company_name")
    private String company_name;

    @Column(name = "siret_number" , length = 11)
    private String siretNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "brandMiage")
    private List<ProductEntity> product_entity;
}
