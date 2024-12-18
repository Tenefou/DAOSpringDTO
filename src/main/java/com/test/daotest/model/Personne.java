package com.test.daotest.model;

import java.util.List;

import jakarta.persistence.OneToMany;

public class Personne {
    private Long id;

    private String nom;

    private String prenom;

    private String mail;

    private String mdp;

    private int role;

    @OneToMany(mappedBy = "personne")
    private List<Choisir> choix;

    public Personne() {
    }

    public Personne(Long id, String nom, String prenom, String mail, String mdp, int role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.role = role;
    }

    public Personne(String nom, String prenom, String mail, String mdp, int role) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", mdp='" + mdp + '\'' +
                ", role=" + role +
                '}';
    }    
}