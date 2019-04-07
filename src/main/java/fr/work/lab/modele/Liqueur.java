package fr.work.lab.modele;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Liqueur {

    @Id
    @SequenceGenerator(name = "liqueurSeq", sequenceName = "liqueur_seq", allocationSize = 1)
    @GeneratedValue(generator = "liqueurSeq", strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String nom;
    private String type;
    private String pays;

    public Liqueur(Integer id) {
        this.id = id;
    }

    public Liqueur() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Liqueur liqueur = (Liqueur) o;
        return Objects.equals(id, liqueur.id) &&
                Objects.equals(nom, liqueur.nom) &&
                Objects.equals(type, liqueur.type) &&
                Objects.equals(pays, liqueur.pays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, type, pays);
    }

    @Override
    public String toString() {
        return "Liqueur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}
