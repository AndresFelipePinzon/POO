package poo.banco.app;

import poo.banco.dominio.Banco;
import poo.banco.dominio.CuentaBancaria;
import poo.banco.dominio.Persona;

public class App {
    public static void main(String[] args) {
        Banco bancolombia = new Banco("Bancolombia");
        Persona alejandro = new Persona("Alejandro", 124);
        Persona lema = new Persona("Lema", 321);

        CuentaBancaria cuentaAlejo = new CuentaBancaria(111, "Ahorro", 100000, alejandro, bancolombia);
        CuentaBancaria cuentaLema = new CuentaBancaria(222, "Ahorro", lema, bancolombia);

        System.out.println("Antes de la consignación");
        cuentaAlejo.mostrarSaldo();
        cuentaLema.mostrarSaldo();

        System.out.println("Despues de la consgnación a lema");
        cuentaLema.consignar(80000);
        cuentaLema.mostrarSaldo();

        System.out.println("Despues de la transferencia");
        cuentaLema.transferir(cuentaAlejo, 80000);
        cuentaAlejo.mostrarSaldo();
        cuentaLema.mostrarSaldo();

    }
}