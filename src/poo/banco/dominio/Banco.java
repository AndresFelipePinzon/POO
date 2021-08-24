package poo.banco.dominio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nombre;
    public String ubicacion;
    public Persona gerente;
    public List<CuentaBancaria> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }
}
