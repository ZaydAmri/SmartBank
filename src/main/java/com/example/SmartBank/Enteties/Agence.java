package com.example.SmartBank.Enteties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "agence")
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codeAgence;
    private String nbrGuichet;
    private Boolean disponibility;
    private String name;
    private String adresse;
    private int nbrInscrits;
    @OneToMany(mappedBy = "agence",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Compte> listComptes;

    public Agence() {
    }

    public Agence(Long id, String codeAgence, String nbrGuichet, Boolean disponibility, String name, String adresse, int nbrInscrits, List<Compte> listComptes) {
        this.id = id;
        this.codeAgence = codeAgence;
        this.nbrGuichet = nbrGuichet;
        this.disponibility = disponibility;
        this.name = name;
        this.adresse = adresse;
        this.nbrInscrits = nbrInscrits;
        this.listComptes = listComptes;
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

    public List<Compte> getListComptes() {
        return listComptes;
    }

    public void setListComptes(List<Compte> listComptes) {
        this.listComptes = listComptes;
    }

    public String getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(String codeAgence) {
        this.codeAgence = codeAgence;
    }

    public String getNbrGuichet() {
        return nbrGuichet;
    }

    public void setNbrGuichet(String nbrGuichet) {
        this.nbrGuichet = nbrGuichet;
    }

    public Boolean getDisponibility() {
        return disponibility;
    }

    public void setDisponibility(Boolean disponibility) {
        this.disponibility = disponibility;
    }
}
