package com.example.SmartBank.Enteties;



import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ipAdress;
    private String nom;
    private String prenom;
    private String adress;
    private String cin;
    private String telephone;
    private String email;
    private String nomUtilisateur;
    private String motDePasse;

    public User() {
    }

    public User(Long id, String ipAdress, String nom, String prenom, String adress, String cin, String telephone, String email, String nomUtilisateur, String motDePasse) {
        this.id = id;
        this.ipAdress = ipAdress;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.cin = cin;
        this.telephone = telephone;
        this.email = email;
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
