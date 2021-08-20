package co.quiz.dominio;

public class DispensadorDeGel {
    public String marca;
    public int capacidadMaxima;
    public int cantidadActual;
    public Sensor sensor;

    public DispensadorDeGel(String marca, int capacidadMaxima) {
        this.marca = marca;
        this.capacidadMaxima = capacidadMaxima;
        this.llenar();
    }

    public boolean dispensar(int cantidadADispensar) {
        if (cantidadADispensar <= this.cantidadActual) {
            this.cantidadActual -= cantidadADispensar;
            return true;
        }

        return false;
    }

    public void llenar() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void vaciar() {
        this.cantidadActual = 0;
    }
}
