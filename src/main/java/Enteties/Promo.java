package Enteties;

import java.util.Date;

public class Promo {
    public String id;
    public String titre;
    public String description;
    public Date duree;

    public Promo() {
    }

    public Promo(String id, String titre, String description, Date duree) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.duree = duree;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDuree() {
        return duree;
    }

    public void setDuree(Date duree) {
        this.duree = duree;
    }
}
