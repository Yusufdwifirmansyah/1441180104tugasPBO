package com.company;

/**
 * Created by C55D on 6/11/2015.
 */
public class TestJoki {

    public static void main(String[] args) {

        Joki yusuf = new Joki ("yusuf","Malang",'L',165);
        System.out.println(yusuf.getNamaJoki());
        System.out.println(yusuf.getAlamatJoki());
        System.out.println(yusuf.getJenisKlaminJoki());
        System.out.println(yusuf.getTinggiBadanJoki());

        Trail KLX = new Trail("Kawsaki",140000.0,"hijau");
        System.out.println(KLX.getMerekTrail());
        System.out.println(KLX.getHargaTrail());
        System.out.println(KLX.getWarnaTrail());

    }
}
