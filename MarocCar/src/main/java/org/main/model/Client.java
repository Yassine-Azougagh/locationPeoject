package org.main.model;

import java.util.Date;
import java.util.List;

public class Client {
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private Date date_naissance;
    private String permis;
    private boolean est_validé;
    private int carte_bank;
    private String password;
     private List<Location> locations;


    public Client() {
        super();
    }

    public Client(String cin, String nom, String prenom, String email, String tel, Date date_naissance, String permis, boolean est_validé, int carte_bank, String password) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.date_naissance = date_naissance;
        this.permis = permis;
        this.est_validé = est_validé;
        this.carte_bank = carte_bank;
        this.password = password;
    }

    public int getCarte_bank() {
        return carte_bank;
    }

    public void setCarte_bank(int carte_bank) {
        this.carte_bank = carte_bank;
    }

    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public String getPermis() {
        return permis;
    }

    public boolean isEst_validé() {
        return est_validé;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }

    public void setEst_validé(boolean est_validé) {
        this.est_validé = est_validé;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", date_naissance=" + date_naissance +
                ", permis='" + permis + '\'' +
                ", est_validé=" + est_validé +
                ", carte_bank=" + carte_bank +
                ", password='" + password + '\'' +
                '}';
    }
}

