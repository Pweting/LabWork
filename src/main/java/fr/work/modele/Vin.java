package fr.work.modele;

import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

import java.util.Objects;

public class Vin {

    private Integer id;
    private String nom;
    private Integer annee;
    private Integer vieillissement;
    private String type;
    private String region;
    private String commentaire;
    private String plat;

    public Vin() {
    }

    public Vin(Integer id){
        this id = id;
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

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
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
