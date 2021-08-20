package poo.banco.app;

import poo.banco.dominio.Persona;

public class AppMemoria {
    public static void main(String[] args) {
        Persona persona = null;

        System.out.println("Memoria libre ANTES del proceso: " + Runtime.getRuntime().freeMemory() / 1024);

        for (int i = 0; i < 99999999; i++) {
            persona = new Persona("Alejandro Ramírez Hernández", (short) 28, 32456885);
            persona = null;
        }

        System.out.println("Memoria libre después del proceso: " + Runtime.getRuntime().freeMemory() / 1024);
        System.gc();
        System.out.println("Memoria libre después del Garbage Collector: " + Runtime.getRuntime().freeMemory() / 1024);

//        Persona fulano = new Persona("Toreto", 987654);
//        Persona pepito = fulano;
//
//        System.out.println("Fulano: " + fulano);
//        System.out.println("Pepito: " +pepito);
//
//        pepito.nombre = "Gloria";
//
//        pepito = new Persona("Drew", 123456);
//
//        System.out.println("Fulano 2: " + fulano);
//        System.out.println("Pepito 2: " +pepito);
//
//        System.out.println("Nombre de referencia FULANO: " + fulano.nombre);
//        System.out.println("Nombre de referencia PEPITO: " + pepito.nombre);
    }
}
