package poo.tv.app;

import poo.tv.dominio.Televisor;

public class AppTV {
    public static void main(String[] args) {
        Televisor tv = new Televisor("LG", " 3.0", (short) 50);
        System.out.println("Marca es " + tv.marca);

        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();

        System.out.println("Volumen: " + tv.volumenActual);
    }
}
