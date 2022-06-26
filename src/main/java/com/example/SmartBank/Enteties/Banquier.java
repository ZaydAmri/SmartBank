package com.example.SmartBank.Enteties;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "banquier")
public class Banquier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    private String matricule;
    private String nom;
    private String prenom;
    private double salaire;
    private Date dateEmbauche;
    private Date dateFinService;

    public Banquier() {
    }

    public Banquier(int id, String matricule, String nom, String prenom, double salaire, Date dateEmbauche, Date dateFinService) {
        this.id = id;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.dateEmbauche = dateEmbauche;
        this.dateFinService = dateFinService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Date getDateFinService() {
        return dateFinService;
    }

    public void setDateFinService(Date dateFinService) {
        this.dateFinService = dateFinService;
    }
}