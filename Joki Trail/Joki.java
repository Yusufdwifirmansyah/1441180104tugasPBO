package com.company;

/**
 * Created by C55D on 6/11/2015.
 */
public class Joki {

    private String namaJoki;
    private String alamatJoki;
    private char jenisKlaminJoki;
    private int tinggiBadanJoki;

    public Joki () {
    }

    public Joki(String namaJoki, String alamatJoki, char jenisKlaminJoki, int tinggiBadanJoki) {
        this.namaJoki = namaJoki;
        this.alamatJoki = alamatJoki;
        this.jenisKlaminJoki = jenisKlaminJoki;
        this.tinggiBadanJoki = tinggiBadanJoki;
    }

    public String getNamaJoki() {
        return namaJoki;
    }

    public void setNamaJoki(String namaJoki) {
        this.namaJoki = namaJoki;
    }

    public String getAlamatJoki() {
        return alamatJoki;
    }

    public void setAlamatJoki(String alamatJoki) {
        this.alamatJoki = alamatJoki;
    }

    public char getJenisKlaminJoki() {
        return jenisKlaminJoki;
    }

    public void setJenisKlaminJoki(char jenisKlaminJoki) {
        this.jenisKlaminJoki = jenisKlaminJoki;
    }

    public int getTinggiBadanJoki() {
        return tinggiBadanJoki;
    }

    public void setTinggiBadanJoki(int tinggiBadanJoki) {
        this.tinggiBadanJoki = tinggiBadanJoki;
    }

    @Override
    public String toString() {
        return "Joki{" +
                "namaJoki='" + namaJoki + '\'' +
                ", alamatJoki='" + alamatJoki + '\'' +
                ", jenisKlaminJoki=" + jenisKlaminJoki +
                ", tinggiBadanJoki=" + tinggiBadanJoki +
                '}';
    }
}
