package com.company;

/**
 * Created by C55D on 6/11/2015.
 */
public class Trail {

    private  String merekTrail;
    private  double hargaTrail;
    private  String warnaTrail;

    public Trail () {
    }

    public Trail(String merekTrail, double hargaTrail, String warnaTrail) {
        this.merekTrail = merekTrail;
        this.hargaTrail = hargaTrail;
        this.warnaTrail = warnaTrail;
    }

    public String getMerekTrail() {
        return merekTrail;
    }

    public void setMerekTrail(String merekTrail) {
        this.merekTrail = merekTrail;
    }

    public double getHargaTrail() {
        return hargaTrail;
    }

    public void setHargaTrail(double hargaTrail) {
        this.hargaTrail = hargaTrail;
    }

    public String getWarnaTrail() {
        return warnaTrail;
    }

    public void setWarnaTrail(String warnaTrail) {
        this.warnaTrail = warnaTrail;
    }

    @Override
    public String toString() {
        return "Trail{" +
                "merekTrail='" + merekTrail + '\'' +
                ", hargaTrail=" + hargaTrail +
                ", warnaTrail='" + warnaTrail + '\'' +
                '}';
    }
}
