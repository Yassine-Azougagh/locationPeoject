package org.main.model;

import java.util.Date;
import java.util.List;

public class Commercial {
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private Date date_naissance;
    private long salaire;
    private String password;
    private List<Location> locations;
    private List<Client> clients;

    public Commercial() {
        super();
    }

    public Commercial(String cin, String nom, String prenom, String email, String tel, Date date_naissance, long salaire, String password, List<Location> locations, List<Client> clients) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.date_naissance = date_naissance;
        this.salaire = salaire;
        this.password = password;
        this.locations = locations;
        this.clients = clients;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public List<Client> getClients() {
        return clients;
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

    public long getSalaire() {
        return salaire;
    }

    public String getPassword() {
        return password;
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

    public void setSalaire(long salaire) {
        this.salaire = salaire;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", date_naissance=" + date_naissance +
                ", salaire=" + salaire +
                ", password='" + password + '\'' +
                ", locations=" + locations +
                ", clients=" + clients +
                '}';
    }
}
