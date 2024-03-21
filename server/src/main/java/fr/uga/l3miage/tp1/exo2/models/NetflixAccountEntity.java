package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;

@Entity
@Table(name = "netflix_account")
public class NetflixAccountEntity {
            @Id
            @Column(name="id")
            private long id; //bigint est un type de entier long

            @Column(name = "nb_devices")
            private int nb_devices;
            @Enumerated(EnumType.STRING)
            @Column(name = "typeAccount")
            private String typeAccount;

            @Column(name="uuid_user")
            private String uuid_user;

            @OneToOne
            @JoinColumn(name = "uuid_user")
            private NetflixUserEntity netflixUser;

}


