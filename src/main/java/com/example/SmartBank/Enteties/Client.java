package com.example.SmartBank.Enteties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client extends User{


    private String iban;
    private Date dateInscit;
    private Long nbrVisite;
    @OneToMany(mappedBy = "intitule",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Compte> listComptes;


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Date getDateInscit() {
        return dateInscit;
    }

    public void setDateInscit(Date dateInscit) {
        this.dateInscit = dateInscit;
    }

    public Long getNbrVisite() {
        return nbrVisite;
    }

    public void setNbrVisite(Long nbrVisite) {
        this.nbrVisite = nbrVisite;
    }

    public List<Compte> getListComptes() {
        return listComptes;
    }

    public void setListComptes(List<Compte> listComptes) {
        this.listComptes = listComptes;
    }
}
