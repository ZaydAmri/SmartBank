package Enteties;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "banquiers")
public class Banquier {
    public int id;

    public Banquier() {
    }

    public Banquier(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
