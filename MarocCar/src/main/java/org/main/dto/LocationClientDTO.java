package org.main.dto;

import java.util.Date;

public class LocationClientDTO {
    private Date date_loc;
    private Date lancement;
    private float prix;
    private boolean est_validée;

    public LocationClientDTO() {
        super();
    }

    public LocationClientDTO(Date date_loc, Date lancement, float prix, boolean est_validée) {
        this.date_loc = date_loc;
        this.lancement = lancement;
        this.prix = prix;
        this.est_validée = est_validée;
    }

    public Date getDate_loc() {
        return date_loc;
    }

    public Date getLancement() {
        return lancement;
    }

    public float getPrix() {
        return prix;
    }

    public boolean isEst_validée() {
        return est_validée;
    }

    public void setDate_loc(Date date_loc) {
        this.date_loc = date_loc;
    }

    public void setLancement(Date lancement) {
        this.lancement = lancement;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setEst_validée(boolean est_validée) {
        this.est_validée = est_validée;
    }

    @Override
    public String toString() {
        return "LocationClientDTO{" +
                "date_loc=" + date_loc +
                ", lancement=" + lancement +
                ", prix=" + prix +
                ", est_validée=" + est_validée +
                '}';
    }
}
