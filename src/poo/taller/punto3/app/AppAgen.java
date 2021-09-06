package poo.taller.punto3.app;

import poo.taller.punto3.domain.Agenda;
import poo.taller.punto3.domain.Contacto;

import java.util.ArrayList;

public class AppAgen {
    public static void main(String[] args) {
        Contacto numero1= new Contacto("Andres Felipe", "Pinzon Franco", "3004990513");
        Contacto numero2= new Contacto("Alejandro", "Rojas Pineda", "3102044567");
        Agenda c= new Agenda();
        Agenda.eliminarContacto("3004990513");
        Agenda.crear();
        Agenda.buscarContactoNombre("Alejandro");
        Agenda.buscarContactoApellido("Pinzon Franco");
        Agenda.buscarContactoNumero("3004990513");





    }
}
