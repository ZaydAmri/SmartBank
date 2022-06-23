package Enteties;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client extends User{
    public String numeroCompte;
    public String rib;
    public String iban;

    public Client() {
    }

    public Client(int id, String ipAdress, String nom, String prenom, String adress, String cin, String telephone, String email, String nomUtilisateur, String motDePasse, String numeroCompte, String rib, String iban) {
        super(id, ipAdress, nom, prenom, adress, cin, telephone, email, nomUtilisateur, motDePasse);
        this.numeroCompte = numeroCompte;
        this.rib = rib;
        this.iban = iban;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
