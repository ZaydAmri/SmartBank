package com.example.SmartBank.Enteties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "compte")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String state;
    private double solde;
    @ManyToOne
    @JoinColumn(name = "intitule_id")
    private Client intitule;
    private String nomSurCarte;
    private TypeCompte typeCompte;
    private String sourceRevenus;

    public Client getIntitule() {
        return intitule;
    }


}
