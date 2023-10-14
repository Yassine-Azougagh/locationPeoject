package org.main.dto;

import java.util.Date;

public class LocationCommercialDTO {

    private Date dateLoc;
    private Date dateLancement;
    private String nomClient;
    private String prenomClient;
    private String emailClient;
    private String telClient;
    private Date dateNaissanceClient;
    private String permisClient;

    public LocationCommercialDTO() {
        super();
    }

    public LocationCommercialDTO(Date dateLoc, Date dateLancement, String nomClient, String prenomClient, String emailClient, String telClient, Date dateNaissanceClient, String permisClient) {
        super();
        this.dateLoc = dateLoc;
        this.dateLancement = dateLancement;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.emailClient = emailClient;
        this.telClient = telClient;
        this.dateNaissanceClient = dateNaissanceClient;
        this.permisClient = permisClient;
    }

    public Date getDateLoc() {
        return dateLoc;
    }

    public void setDateLoc(Date dateLoc) {
        this.dateLoc = dateLoc;
    }

    public Date getDateLancement() {
        return dateLancement;
    }

    public void setDateLancement(Date dateLancement) {
        this.dateLancement = dateLancement;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getTelClient() {
        return telClient;
    }

    public void setTelClient(String telClient) {
        this.telClient = telClient;
    }

    public Date getDateNaissanceClient() {
        return dateNaissanceClient;
    }

    public void setDateNaissanceClient(Date dateNaissanceClient) {
        this.dateNaissanceClient = dateNaissanceClient;
    }

    public String getPermisClient() {
        return permisClient;
    }

    public void setPermisClient(String permisClient) {
        this.permisClient = permisClient;
    }

    @Override
    public String toString() {
        return "LocationCommercialDTO{" +
                "dateLoc=" + dateLoc +
                ", dateLancement=" + dateLancement +
                ", nomClient='" + nomClient + '\'' +
                ", prenomClient='" + prenomClient + '\'' +
                ", emailClient='" + emailClient + '\'' +
                ", telClient='" + telClient + '\'' +
                ", dateNaissanceClient=" + dateNaissanceClient +
                ", permisClient='" + permisClient + '\'' +
                '}';
    }
}
