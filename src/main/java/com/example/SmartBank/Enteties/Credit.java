package com.example.SmartBank.Enteties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "credit")
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    private double plafond;
    private String duree;
    private double tauxInteret;
    private double tmm;
    private TypeClient typeClient;
    private double montantAssurance;
    private Date datePreEcheance;
    private double montantAutoFinanc;

    public Credit() {
    }

    public Credit(int id, double plafond, String duree, double tauxInteret, double tmm, TypeClient typeClient, double montantAssurance, Date datePreEcheance, double montantAutoFinanc) {
        this.id = id;
        this.plafond = plafond;
        this.duree = duree;
        this.tauxInteret = tauxInteret;
        this.tmm = tmm;
        this.typeClient = typeClient;
        this.montantAssurance = montantAssurance;
        this.datePreEcheance = datePreEcheance;
        this.montantAutoFinanc = montantAutoFinanc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPlafond() {
        return plafond;
    }

    public void setPlafond(double plafond) {
        this.plafond = plafond;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public double getTmm() {
        return tmm;
    }

    public void setTmm(double tmm) {
        this.tmm = tmm;
    }

    public TypeClient getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient;
    }

    public double getMontantAssurance() {
        return montantAssurance;
    }

    public void setMontantAssurance(double montantAssurance) {
        this.montantAssurance = montantAssurance;
    }

    public Date getDatePreEcheance() {
        return datePreEcheance;
    }

    public void setDatePreEcheance(Date datePreEcheance) {
        this.datePreEcheance = datePreEcheance;
    }

    public double getMontantAutoFinanc() {
        return montantAutoFinanc;
    }

    public void setMontantAutoFinanc(double montantAutoFinanc) {
        this.montantAutoFinanc = montantAutoFinanc;
    }
}