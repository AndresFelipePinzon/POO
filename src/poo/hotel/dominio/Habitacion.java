package poo.hotel.dominio;

public class Habitacion {
    private int numero;
    private int piso;
    private double tamano;
    private int camas;
    private Sofa sofa;

    public Habitacion(int numero, int piso, double tamano) {
        this.numero = numero;
        this.piso = piso;
        this.tamano = tamano;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public double getTamano() {
        return tamano;
    }

    public int getCamas() {
        return camas;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }
}
