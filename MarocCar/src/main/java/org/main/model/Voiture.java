package org.main.model;

import java.util.Date;

public class Voiture {
    private int id;
    private String marque;
    private String type;
    private Date date_ms;
    private int numerotation;
    private long prix;
    private Client client;
    private Location location;
    public Voiture() {
        super();
    }

    public Voiture(int id, String marque, String type, Date date_ms, int numerotation, long prix, Client client, Location location) {
        this.id = id;
        this.marque = marque;
        this.type = type;
        this.date_ms = date_ms;
        this.numerotation = numerotation;
        this.prix = prix;
        this.client = client;
        this.location = location;
    }

    public Client getClient() {
        return client;
    }

    public Location getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getType() {
        return type;
    }

    public Date getDate_ms() {
        return date_ms;
    }

    public int getNumerotation() {
        return numerotation;
    }

    public long getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate_ms(Date date_ms) {
        this.date_ms = date_ms;
    }

    public void setNumerotation(int numerotation) {
        this.numerotation = numerotation;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", type='" + type + '\'' +
                ", date_ms=" + date_ms +
                ", numerotation=" + numerotation +
                ", prix=" + prix +
                ", client=" + client +
                ", location=" + location +
                '}';
    }
}
