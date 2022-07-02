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
    @JoinColumn(name = "intitule_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Client intitule;

    @JoinColumn(name = "agence_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Agence agence;

    private String nomSurCarte;
    private TypeCompte typeCompte;
    private String sourceRevenus;
    private String rib;
    private String iban;
    private Date dateOuverture;
    private Boolean visibility;
    private String codeInternet;
    private String codeCarte;

    public Compte() {
    }

    public Compte(Long id, String state, double solde, Client intitule, Agence agence, String nomSurCarte, TypeCompte typeCompte, String sourceRevenus, String rib, String iban, Date dateOuverture, Boolean visibility, String codeInternet, String codeCarte) {
        this.id = id;
        this.state = state;
        this.solde = solde;
        this.intitule = intitule;
        this.agence = agence;
        this.nomSurCarte = nomSurCarte;
        this.typeCompte = typeCompte;
        this.sourceRevenus = sourceRevenus;
        this.rib = rib;
        this.iban = iban;
        this.dateOuverture = dateOuverture;
        this.visibility = visibility;
        this.codeInternet = codeInternet;
        this.codeCarte = codeCarte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getIntitule() {
        return intitule;
    }

    public void setIntitule(Client intitule) {
        this.intitule = intitule;
    }

    public String getNomSurCarte() {
        return nomSurCarte;
    }

    public void setNomSurCarte(String nomSurCarte) {
        this.nomSurCarte = nomSurCarte;
    }

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }

    public String getSourceRevenus() {
        return sourceRevenus;
    }

    public void setSourceRevenus(String sourceRevenus) {
        this.sourceRevenus = sourceRevenus;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public Boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public String getCodeInternet() {
        return codeInternet;
    }

    public void setCodeInternet(String codeInternet) {
        this.codeInternet = codeInternet;
    }

    public String getCodeCarte() {
        return codeCarte;
    }

    public void setCodeCarte(String codeCarte) {
        this.codeCarte = codeCarte;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
