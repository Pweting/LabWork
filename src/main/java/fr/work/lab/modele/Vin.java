package fr.work.lab.modele;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Vin {

    @Id
    @SequenceGenerator(name = "vinSeq", sequenceName = "vin_seq", allocationSize = 1)
    @GeneratedValue(generator = "vinSeq", strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String nom;
    private Integer annee;
    private Integer consommation;
    private String type;
    private String region;
    private String domaine;
    private String commentaire;
    private String plat;
    private Integer premium;
    private boolean bu;

    public Vin() {
    }

    public Vin(Integer id) {
        this.id = id;
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

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Integer getConsommation() {
        return consommation;
    }

    public void setConsommation(Integer consommation) {
        this.consommation = consommation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public Integer getPremium() {
        return premium;
    }

    public void setPremium(Integer premium) {
        this.premium = premium;
    }

    public boolean isBu() {
        return bu;
    }

    public void setBu(boolean bu) {
        this.bu = bu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vin vin = (Vin) o;
        return bu == vin.bu &&
                Objects.equals(id, vin.id) &&
                Objects.equals(nom, vin.nom) &&
                Objects.equals(annee, vin.annee) &&
                Objects.equals(consommation, vin.consommation) &&
                Objects.equals(type, vin.type) &&
                Objects.equals(region, vin.region) &&
                Objects.equals(domaine, vin.domaine) &&
                Objects.equals(commentaire, vin.commentaire) &&
                Objects.equals(plat, vin.plat) &&
                Objects.equals(premium, vin.premium);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, annee, consommation, type, region, domaine, commentaire, plat, premium, bu);
    }

    @Override
    public String toString() {
        return "Vin{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", annee=" + annee +
                ", consommation=" + consommation +
                ", type='" + type + '\'' +
                ", region='" + region + '\'' +
                ", domaine='" + domaine + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", plat='" + plat + '\'' +
                ", premium=" + premium +
                ", bu=" + bu +
                '}';
    }
}
