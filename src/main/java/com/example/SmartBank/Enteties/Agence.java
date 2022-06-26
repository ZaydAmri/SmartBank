package com.example.SmartBank.Enteties;

import javax.persistence.*;

@Entity
@Table(name = "agence")
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String adresse;
    private int nbrInscrits;

    public Agence() {
    }

    public Agence(Long id, String name, String adresse, int nbrInscrits) {
        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.nbrInscrits = nbrInscrits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbrInscrits() {
        return nbrInscrits;
    }

    public void setNbrInscrits(int nbrInscrits) {
        this.nbrInscrits = nbrInscrits;
    }
}
