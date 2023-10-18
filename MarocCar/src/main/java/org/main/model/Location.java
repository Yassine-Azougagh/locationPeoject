package org.main.model;

import java.util.Date;
import java.util.List;

public class Location {
    private  long num;

    private Date date_loc;
    private Date lancement;
    private boolean est_validée;
    private List<Voiture> voitures;
    private Client client;

    public Location() {
        super();
    }

    public Location(long num, Date date_loc, Date lancement, boolean est_validée) {
        this.num = num;
        this.date_loc = date_loc;
        this.lancement = lancement;
        this.est_validée = est_validée;

    }

    public long getNum() {
        return num;
    }

    public Date getDate_loc() {
        return date_loc;
    }

    public Date getLancement() {
        return lancement;
    }

    public boolean isEst_validée() {
        return est_validée;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public void setDate_loc(Date date_loc) {
        this.date_loc = date_loc;
    }

    public void setLancement(Date lancement) {
        this.lancement = lancement;
    }

    public void setEst_validée(boolean est_validée) {
        this.est_validée = est_validée;
    }

    @Override
    public String toString() {
        return "Location{" +
                "num=" + num +
                ", date_loc=" + date_loc +
                ", lancement=" + lancement +
                ", est_validée=" + est_validée +
                '}';
    }
}
