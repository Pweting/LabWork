package fr.work.modele;

import java.util.Objects;

public class Vin {

    private String nom;
    private Integer annee;
    private Integer vieillissement;
    private String type;
    private String region;
    private String commentaire;

    public Vin() {
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

    public Integer getVieillissement() {
        return vieillissement;
    }

    public void setVieillissement(Integer vieillissement) {
        this.vieillissement = vieillissement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vin vin = (Vin) o;
        return Objects.equals(nom, vin.nom) &&
                Objects.equals(annee, vin.annee) &&
                Objects.equals(vieillissement, vin.vieillissement) &&
                Objects.equals(type, vin.type) &&
                Objects.equals(region, vin.region) &&
                Objects.equals(commentaire, vin.commentaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, annee, vieillissement, type, region, commentaire);
    }

    @Override
    public String toString() {
        return "Vin{" +
                "nom='" + nom + '\'' +
                ", annee=" + annee +
                ", vieillissement=" + vieillissement +
                ", type='" + type + '\'' +
                ", region='" + region + '\'' +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }
}
