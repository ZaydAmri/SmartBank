package com.example.SmartBank.Enteties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "offre")
public class Offre  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;

    private Date dateDebut;
    private Date dateFin;
    private int nbrInscrits;

    public Offre() {
    }

    public Offre(Long id, String type, Date dateDebut, Date dateFin, int nbrInscrits) {
        this.id = id;
        this.type = type;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbrInscrits = nbrInscrits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getNbrInscrits() {
        return nbrInscrits;
    }

    public void setNbrInscrits(int nbrInscrits) {
        this.nbrInscrits = nbrInscrits;
    }
}
