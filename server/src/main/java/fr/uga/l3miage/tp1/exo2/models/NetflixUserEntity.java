package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {
        @Id
        @Column(name = "id")
        private long id; //bigint est un type de entier long

        @Column(name="uuid")
        private String uuid;

        @Column(name = "last_name")
        private String lastname;

        @Column(name = "first_name")
        private String firstname;

        @Enumerated(EnumType.STRING)
        @Column(name = "sex" , length = 2)
        private String sex;


        @Column(name = "birth_date")
        private LocalDate birthDate;

        @OneToOne(mappedBy = "netflixeAccount")
        private NetflixAccountEntity netflixAccount;
    }
