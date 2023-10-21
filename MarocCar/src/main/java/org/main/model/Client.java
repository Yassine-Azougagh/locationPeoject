package org.main.model;

import java.util.Date;
import java.util.List;

public class Client {
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private Date dateNaissance;
    private String permis;
    private boolean estValidé;
    private int carteBank;
    private String password;
     private List<Location> locations;
     private Commercial commercial;


    public Client() {
        super();
    }

    public Client(String cin, String nom, String prenom, String email, String tel, Date dateNaissance, String permis, boolean estValidé, int carteBank, String password, List<Location> locations, Commercial commercial) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.dateNaissance = dateNaissance;
        this.permis = permis;
        this.estValidé = estValidé;
        this.carteBank = carteBank;
        this.password = password;
        this.locations = locations;
        this.commercial = commercial;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public Commercial getCommercial() {
        return commercial;
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

    public String getPermis() {
        return permis;
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

    public void setPermis(String permis) {
        this.permis = permis;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public void setCommercial(Commercial commercial) {
        this.commercial = commercial;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public boolean isEstValidé() {
        return estValidé;
    }

    public void setEstValidé(boolean estValidé) {
        this.estValidé = estValidé;
    }

    public int getCarteBank() {
        return carteBank;
    }

    public void setCarteBank(int carteBank) {
        this.carteBank = carteBank;
    }

    @Override
    public String toString() {
        return "Client{" +
                "cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", permis='" + permis + '\'' +
                ", estValidé=" + estValidé +
                ", carteBank=" + carteBank +
                ", password='" + password + '\'' +
                ", locations=" + locations +
                ", commercial=" + commercial +
                '}';
    }
}

