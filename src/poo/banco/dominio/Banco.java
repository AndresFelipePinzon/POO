package poo.banco.dominio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private String ubicacion;
    private Persona gerente;
    private List<CuentaBancaria> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Persona getGerente() {
        return gerente;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setGerente(Persona gerente) {
        this.gerente = gerente;
    }
}
