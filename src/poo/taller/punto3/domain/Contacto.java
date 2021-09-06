package poo.taller.punto3.domain;

import java.util.Objects;

public class Contacto {
    private String nombres;
    private String apellidos;
    private String numero;

    public Contacto(String nombres, String apellidos, String numero) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numero = numero;
    }

    public Contacto(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    //Metodo para verificar cuando el nombre sea igual
    public boolean nombreIgual(Contacto c) {

        return this.nombres.equalsIgnoreCase(c.getNombres());
    }
}
