package poo.taller.punto3.domain;

import java.util.Objects;

public class Contacto {
    private String nombres;
    private String apellidos;
    private int numero;

    public Contacto(String nombres, String apellidos, int numero) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numero = numero;
    }

    public Contacto(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numero =0; //inicie en cero
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
