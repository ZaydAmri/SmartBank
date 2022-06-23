package Enteties;

import javax.persistence.*;

@Entity
@Table(name = "banque")
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String raisonSociale;
    private int NbrClients;
    private String tel;
    private String fax;
    private String email;
    private int NbrAgences;


    public Banque() {
    }

    public Banque(int id, String raisonSociale, int nbrClients, String tel, String fax, String email, int nbrAgences) {
        this.id = id;
        this.raisonSociale = raisonSociale;
        NbrClients = nbrClients;
        this.tel = tel;
        this.fax = fax;
        this.email = email;
        NbrAgences = nbrAgences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public int getNbrClients() {
        return NbrClients;
    }

    public void setNbrClients(int nbrClients) {
        NbrClients = nbrClients;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNbrAgences() {
        return NbrAgences;
    }

    public void setNbrAgences(int nbrAgences) {
        NbrAgences = nbrAgences;
    }
}
