package poo.tv.dominio;

public class Televisor {
    public short tamano;
    public String marca;
    public String referencia;
    public boolean encendido;
    public short canalSintonizado;
    public byte volumenActual;

    public Televisor(String marca, String referencia, short tamano) {
        this(marca, referencia);
        this.tamano = tamano;
        this.encender();
    }

    public Televisor(String marca, String referencia) {
        this.marca = marca;
        this.referencia = referencia;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public boolean cambiarCanal(short nuevoCanal) {
        if (this.encendido) {
            this.canalSintonizado = nuevoCanal;
            return true;
        }

        return false;
    }

    public void subirVolumen() {
        if (this.encendido) {
            this.volumenActual++;
        }
    }

    public void bajarVolumen() {
        if (this.encendido) {
            this.volumenActual--;
        }
    }
}
