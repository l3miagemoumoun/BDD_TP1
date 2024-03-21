package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product_entity")
public class ProductEntity {
    @Id
    @Column(name = "bar_code_number" , length = 11)
    private String bar_code_number;

    @Column(name = "name")
    private String name;

    @Column(name = "consumable")
    private String consumable;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private BrandMiage brand_miage;
}
